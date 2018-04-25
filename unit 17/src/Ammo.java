//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private boolean detection = true;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
		super.setPos(x, y);
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super.setPos(x, y);
		setSpeed(s);
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw2( Graphics window, Color color )
	{
		//add code to draw the ammo
		
	    window.setColor(color);
		window.fillRect(super.getX(), super.getY(), 10, 10);
	  
	}
	
	public void draw (Graphics window){
		window.setColor(Color.YELLOW);
		window.fillRect(super.getX(), super.getY(), 10, 10);
	}
	
	public void setHit(){
		detection = false;
	}
	
	public boolean getHit(){
		return detection;
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
