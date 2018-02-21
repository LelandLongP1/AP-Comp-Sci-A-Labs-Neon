//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let,count);
	}

	public void setTriangle( String let, int sz )
	{
		letter = let;
		size = sz;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output = "";
		for(int r=1; r<=size; r++) 
		{
			for(int i=size; i>=r; i--)
			System.out.print(" ");
			
			for(int c=1; c<=r; c++) 
			System.out.print(letter);
			System.out.println();
			
		}
		return output+"\n";
	}
}