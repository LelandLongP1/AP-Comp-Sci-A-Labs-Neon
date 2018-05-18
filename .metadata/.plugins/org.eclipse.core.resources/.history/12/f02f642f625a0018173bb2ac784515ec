import java.awt.Color;
import java.util.ArrayList;

public class Level extends Block {

private ArrayList<Brick> bricks = new ArrayList<Brick>();
	
	public Level(int x, int y, int w, int h, Color c){
		for (int i = 0; i < 550; i+=200){
			
			bricks.add(new Brick(x, y + i, h, w, c));
			bricks.add(new Brick(x + 760, y + i, h, w, c ));
		}
		
		for (int i = 0; i < 800; i += 200){
			bricks.add(new Brick(x + i, y , w, h,c));
			bricks.add(new Brick(x + i, y + 530, w, h, c));
		}
		
		
	}
	
	

	
	public ArrayList<Brick> getLevel(){
		return bricks;
	}

}
