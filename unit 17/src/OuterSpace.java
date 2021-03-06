//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	//private Alien alienTwo;
	private Ammo ammo;
	private boolean gameOver = false;
	private int lives = 15;
	private ArrayList <Ammo> enemyBullet;
	private BossKanye boss;
	private int bossHealth = 40;
	private boolean bossVisible;
	private ArrayList<Alien> aliens;
	private ArrayList<Ammo> shots;
	private boolean[] keys;
	private BufferedImage back;
	
	
	/**
	 * instantiates the objects and arrayLists for the game
	 * detects player input and sends it to methods to be interpreted 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other stuff
		ship = new Ship(400,450,2);
		alienOne = (new Alien(250,0,2));
        //alienTwo = (new Alien(450,50,2));
        AlienHorde swarm = new AlienHorde(8);
        aliens = swarm.getSwarm();        
        shots = new ArrayList<Ammo>();
        enemyBullet = new ArrayList<Ammo>();
        boss = new BossKanye(250,0);
        bossVisible = false;
        
        
        
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
		
		
	}
	
	/**
	 * constantly calls and updates the game to simulate movement 
	 *
	 * 
	 * @param  Graphics window which opens a new window for the game to be played on
	 * @see    changes to the window which appears as movement along the screen, constantly updating and adjusting for new changes
	 */
   public void update(Graphics window)
   {
	   paint(window);
   }
   
   /**
    * draws the objects on screen and plays the game
    *
    * @param  	Graphics window creates a double buffering window for the animations
    * @see     	The game being played
    */
	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		
		
		
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		/*Image image;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\Spam Sushi\\Desktop\\AP-Comp-Sci-A-Labs-Neon\\unit 17\\src\\winscreen.png"));
			graphToBack.drawImage(image,0,0,800,600,null);
		
		}
		
		catch(Exception e)
		{
			//feel free to do something here
		}*/
		
		
		
		//*****************************************[CONTROLS]***********************************************************

		if(ship.getX() >= 0 && keys[0] == true)
		{
			ship.move("LEFT");
		}

		//add code to move stuff
		if(ship.getX() <= 720 && keys[1] == true)
		{
			ship.move("RIGHT");
		}
		
		if(ship.getY() >= 0 && keys[2] == true)
		{
			ship.move("UP");
		}
		
		if(ship.getY() <= 480 && keys[3] == true)
		{
			ship.move("DOWN");
		}
		
		if(keys[4] == true)
		{
			
			if (gameOver == false){
				shots.add(new Ammo(ship.getX() + 35, ship.getY()-20, 3));
			}
			
			if (aliens.size() > 0){
			 	for (int i = 0; i < 5; i ++){
			 		int random = (int) (Math.random() * aliens.size());
			 		enemyBullet.add(new Ammo(aliens.get(random).getX() + aliens.get(random).getSpeed(),aliens.get(random).getY(),1));
			 		}
			 	}
			 else{
				 for (int i = 0; i < 3; i++){
					 int random = (int) (Math.random() * 300);
					 if (random % 2 != 0){
						 enemyBullet.add(new Ammo(boss.getX() + 50 + random,boss.getY(),2));
					 }
					 else{
						 enemyBullet.add(new Ammo(boss.getX() + 50 - random,boss.getY(),2));
					 }	
				 
				 }
				 
			 }
			 
			 keys[4]=false;
			 
		}
		
		
		//*****************************************[ALIEN BEHAVIOR]***********************************************************
		for (Alien enemies: aliens){
			enemies.draw(graphToBack);
			int temp = enemies.getY();
			enemies.move("RIGHT");
			
			 if(enemies.getX() <= 1000)
             {
                 if(enemies.getX() > 900)
                     enemies.setX(-20);
                 	 
             }
			for (Ammo bullets: shots){
				if (!(bullets.getY() <= enemies.getY() + 10 && bullets.getY() >= enemies.getY() - 20 
						&& bullets.getX() >= enemies.getX() 
						&& bullets.getX() <= enemies.getX() + 60) ){
					
					enemies.draw(graphToBack);
					
				}
				else {
					aliens.remove(enemies);
					shots.remove(bullets);
				}
			}
		}	
		
		if (aliens.size() <= 0 && bossHealth > 0){
			bossVisible = true;
			boss.draw(graphToBack);
		}
		else {
			bossVisible = false;
		}
		
		for (Ammo bullets: shots){
			if (boss.getY() <= bullets.getY() + 10 && boss.getY() + 300 >= bullets.getY() 
				&& boss.getX() + 300 >= bullets.getX() && boss.getX() <= bullets.getX() 
				&& bullets.getHit() == true && bossVisible == true){
					graphToBack.setColor(Color.BLACK);
					graphToBack.drawString("Health: " + bossHealth, 100, 100);
					bossHealth = bossHealth - 1;
					graphToBack.setColor(Color.WHITE);
					graphToBack.drawString("Health: " + bossHealth, 100, 100);
					bullets.setHit();
					shots.remove(bullets);
					
				}
		}
		
		
		
		//*****************************************[BULLETS]***********************************************************
		for (Ammo bullets: shots){
			bullets.move("UP");
			bullets.draw2(graphToBack,Color.YELLOW); 
			if(bullets.getY()<=0)
             {
                 shots.remove(bullets);
             }
		}
		
		for (Ammo bullets: enemyBullet){
			bullets.move("DOWN");
			 int random = (int) (Math.random() * 3);
			 if (random == 1){
				 bullets.move("LEFT");
			 }
			 else{
				 bullets.move("RIGHT");
			 }
			if (aliens.size() <= 0){
			 	int random2= (int) (Math.random() * 5);
			 	if (random2 == 1 ){
			 		bullets.draw2(graphToBack,Color.BLUE);
			 	}
			 	else if (random2 == 2){
			 		bullets.draw2(graphToBack,Color.RED);
			 	}	
			 	else if (random2 == 3){
			 		bullets.draw2(graphToBack,Color.GREEN);
			 	}	
			 	else if (random2 == 4){
			 		bullets.draw2(graphToBack,Color.CYAN);
			 	}	
			 	else if (random2 == 0){
			 		bullets.draw2(graphToBack,Color.MAGENTA);
			 	}	
			}
			else {
				bullets.draw2(graphToBack, Color.BLUE);
			}
		
			
			if(bullets.getY()>=750)
             {
                 enemyBullet.remove(bullets);
             }		
		}
		
		
        for (Ammo bullets: enemyBullet){
			if ((ship.getY() <= bullets.getY() + 10 && ship.getY() >= bullets.getY() - 20 
					&& ship.getX() + 60 >= bullets.getX() && ship.getX() <= bullets.getX()) 
					&& bullets.getHit() == true){
					
			lives = lives - 1;
			bullets.setHit();
			enemyBullet.remove(bullets);
			}
		}
        
        
         //*****************************************[DEATH]***********************************************************
		if (lives > 0){
			ship.draw(graphToBack);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Lives: " + lives, 700, 550);

		}
		else {
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("Lives: " + lives, 700, 550);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Game Over", 700, 550);
			gameOver = true;

		}
		
		if (bossHealth > 0 && aliens.size() <= 0 && bossVisible == true){
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Health: " + bossHealth, 100, 100);
		}
		else if (bossHealth <= 0 && aliens.size() <= 0 && bossVisible == false){
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("Health: " + bossHealth, 100, 100);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("You Win!", 370, 200);
		}
		
	
		//********************************************[END]**************************************************************
		
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	/**
	 * senses for player input and repaints the window with the changes: up, down, left, right
	 *
	 * @param  keyEvent E is the player's input
	 * 
	 */
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
		
	}
	
	/**
	 * senses when the player stops inputting a key
	 *
	 * @param  KeyEvent e is when a change in input is detected
	 * 
	 */
	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		/*if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}*/
		repaint();
	}
	
	/**
	 * another method to detect input 
	 * @param  KeyEvent e detects when a key is typed
	 *
	 */
	public void keyTyped(KeyEvent e)
	{
		
	}

	/**
	 * constantly refreshes the window with new changes
	 * @see         the game moving 
	 */
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

