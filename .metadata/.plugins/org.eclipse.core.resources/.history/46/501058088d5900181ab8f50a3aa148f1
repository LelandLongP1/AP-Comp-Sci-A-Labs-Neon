import java.awt.Color;

public class Brick extends Block implements Collidable{

	public Brick(int x, int y, int w, int h, Color c){
		super(x,y,w,h,c);
		
	}
	
	 public boolean didCollideLeft(Object obj){
		 Ball compare = (Ball)obj;
		 if((this.getX() <= compare.getX() + compare.getWidth()) && (this.getX() + this.getWidth() >= compare.getX()) &&//check if paddle is within bounds of x
					((compare.getY() <= this.getY()) && (this.getY() <= compare.getY() + compare.getHeight()) 
							)){
			return true;
			}
		 
		 return false;
	 }

	 
	 public boolean didCollideRight(Object obj){
		 Ball compare = (Ball)obj;
		 if((this.getX() <= compare.getX() + compare.getWidth()) && (this.getX() >= compare.getX()) &&//check if paddle is within bounds of x
					((this.getY() <= compare.getY()) && (this.getY() >= compare.getY() + compare.getHeight()) 
							)){
			return true;
			}
		 
		 return false;
	 }
	 
	 
	 
	 public boolean didCollideTop(Object obj){
		Ball compare = (Ball)obj;
		if (this.getY() > compare.getY() && this.getY() < compare.getY() + compare.getHeight() && this.getX() > compare.getX() && this.getX() < compare.getX() + compare.getWidth()){
			return true;
		}
		return false;
	 }

	
	public boolean didCollideBottom(Object obj) {
	
		return false;
	}
	
}
