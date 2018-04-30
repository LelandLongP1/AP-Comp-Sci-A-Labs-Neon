import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class BossKanye extends MovingThing {
	private int speed;
	private Image image;

	public BossKanye()
	{
		this(0,0,0);
	}

	public BossKanye(int x, int y)
	{
		this(x,y,0);
	}
	
	/**
	 * instantiates the boss of the game by checking for his image and setting his speed and position
	 *  
	 *  
	 *  
	 *
	 * @param  x position
	 * @param  y position
	 * @param  s speed
	 * 
	 * 
	 * 
	 */
	public BossKanye(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\longl5895\\Desktop\\AP-Comp-Sci-A-Labs-Neon\\unit 17\\src\\tempura.png"));
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}

	public void setSpeed(int s)
	{
		speed = s;
	   //add code
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),300,300,null);
	}

	public String toString()
	{
		return super.toString() + " " + getSpeed();
	}
}
