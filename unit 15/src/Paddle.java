//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10,10,10);
      speed =5;
   }

   public Paddle(int x, int y){
	   super(x,y,10,10);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int w, int h, int s){
	   super(x,y,w,h);
	   speed = s;
   }
   
   public Paddle(int x, int y, int s){
	   super(x,y,10,10);
	   speed = s;
   }
   
   public Paddle(int x, int y, int w, int h, Color c, int s){
	   super(x,y,w,h,c);
	   speed = s;
   }

   //add the other Paddle constructors

   public int getSpeed(){
	   return speed;
   }








   public void moveUpAndDraw(Graphics window)
   {
	  
	   draw(window, Color.WHITE);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   window.setColor(getColor());
	   setY(getY() - speed);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   
	   

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY() + speed);
	   draw(window, super.getColor());

   }
   
   public void moveRightAndDraw(Graphics window){
	   draw(window, Color.WHITE);
	   setX(getX() + speed);
	   draw(window, super.getColor());
   }
   
   public void moveLeftAndDraw(Graphics window){
	   draw(window, Color.WHITE);
	   setX(getX() - speed);
	   draw(window, super.getColor());
   }
   

   //add get methods
   
   
   //add a toString() method
   public String toString(){
	   String output = "";
	   output = "" + getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getSpeed();
		return output; 
   }
}