//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{		{'@','-','@','-','-','@','-','@','@','@'},//1
									{'@','@','@','-','@','@','-','@','-','@'},//2
									{'-','-','-','-','-','-','-','@','@','@'},//3
									{'-','@','@','@','@','@','-','@','-','@'},//4
									{'-','@','-','@','-','@','-','@','-','@'},//5
									{'@','@','@','@','@','@','-','@','@','@'},//6
									{'-','@','-','@','-','@','-','-','-','@'},//7
									{'-','@','@','@','-','@','-','-','-','-'},//8
									{'-','@','-','@','-','@','-','@','@','@'},//9
									{'-','@','@','@','@','@','-','@','@','@'}};//10
									//1   2   3   4   5   6   7   8   9   10
	}
	
	public boolean bounds (int r, int c){
		if (r <= 10 && r >= 0){
			if (c<=10 && c>=0){
				return true;
			}
		}
		return false;
	}

	public int countAts(int r, int c)
	{

		//add in recursive code to count up the # of @s connected
		int visitedRow = r;
		int visitedColumn = c;
		if (atMat[r][c] == '@' && bounds(r, c)){
			atCount += 1;
			if (bounds (r+1, c) && atMat[r+1][c] == '@'){
				atCount += countAts(r+1,c);
			}
			if (bounds(r-1,c) && atMat[r-1][c] == '@'){
				atCount += countAts(r-1,c);
			}
			if (bounds(r,c+1) && atMat[r][c+1] == '@'){
				atCount += countAts(r,c+1);
			}
			if (bounds(r,c-1) && atMat[r][c-1] == '@'){
				atCount += countAts(r,c-1);
			}
			
		}
		else {
			return atCount;
		}
		//start checking at spot [r,c]
			

		return atCount;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}