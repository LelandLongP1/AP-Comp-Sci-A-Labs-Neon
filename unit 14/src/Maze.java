//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private int inBounds;
   private String output = "";
   private boolean exitFound = false;

	public Maze()
	{
		maze = new int [0][0];

	}

	public Maze(int size, String line)
	{
		Scanner chopper = new Scanner(line);
		int temp = 0;
		inBounds = size;
		maze = new int[size][size];
		for (int i = 0; i < size; i++){
			for (int k = 0; k < size; k++){
				temp = chopper.nextInt();
				maze[i][k] = temp;
			}
		}
		
	}

	public boolean hasExitPath(int r, int c)
	{
		if (r < inBounds && r >= 0 && c < inBounds && c >= 0 && maze[r][c] == 1){
			maze[r][c] = 2;
				if (c == inBounds -1){ //fix this
					exitFound = true;
					return true;
				}
				else{
					hasExitPath(r+1,c);
					hasExitPath(r-1,c);
					hasExitPath(r,c+1);
					hasExitPath(r,c-1);
				}
			
		}
		
		return false;
	}

	public String toString()
	{
		for (int i = 0; i < inBounds; i++){
			for (int k = 0; k < inBounds; k++){
				output += maze[i][k];
			}
			output += "\n";
		}
		if (exitFound == true)
			output += "has exit path\n";
		else 
			output += "has no exit\n";
		

		return output;
	}
}