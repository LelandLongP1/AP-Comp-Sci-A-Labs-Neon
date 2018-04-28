import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class AlienHorde {
	ArrayList <Alien> swarm = new ArrayList<Alien>();
	private Image image;
	
	public AlienHorde(){
		
	}
	
	/**
	 * creates three rows of aliens where each row is the size that the player instantiates the object with 
	 *
	 * @param  count  the size of each row (amount of aliens)
	 * 
	 *
	 */
	public AlienHorde(int count){
		for (int i = 0; i< count * 100; i += 100){
			swarm.add(new Alien (i, 50, 1));
			swarm.add(new Alien (i, 150, 1));
			swarm.add(new Alien (i,250,1));
		}
	
		
		
		try
		{
			image = ImageIO.read(new File("C:\\Users\\longl5895\\Desktop\\AP-Comp-Sci-A-Labs-Neon\\unit 17\\src\\tempura.JPG"));
		}
		catch(Exception e)
		{
			
		}
		
		
		
	}
	
	/**
	 *returns the arrayList of aliens created by the constructor
	 *
	 * @return      ArrayList <Alien> (the aliens and their position)
	 *
	 */
	public ArrayList<Alien> getSwarm(){
		return swarm;
   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end class
