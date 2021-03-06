//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   //constructors
   public BlinkyBall()
   {
	   super(200,200);
	   
   }

   public BlinkyBall(int x, int y)
   {
	   super(x,y);
		


   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {
	   super (x,y,wid,ht);
		


   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super (x,y,wid,ht);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
		


   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super (x,y,wid,ht,col);
		setXSpeed(xSpd);
		setYSpeed(ySpd);

   }

   public Color randomColor()
   {
   	int r = 0;		//use Math.random()
 		int g = 0;
 		int b = 0;
 		r = (int)Math.random() * 256;
 		g = (int)Math.random() * 256;
 		b = (int)Math.random() * 256;
 		return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window)
   {
	   draw(window,randomColor());

	      setX(getX()+ getXSpeed());
			
	      setY(getY()+ getYSpeed());
			
	      draw(window);



   }
}