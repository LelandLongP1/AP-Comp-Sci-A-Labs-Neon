//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;
	String length = "";

	public FancyWord()
	{

	}

   public FancyWord(String s)
	{
	   length = s;
	   mat = new char[s.length()][s.length()];
	  
	   for (int i = 0; i < s.length(); i++){
		   mat[0][i] = s.charAt(i);
		   mat[i][i] = s.charAt(i);
		   mat[s.length()-1-i][i] = s.charAt(i);
		   //mat[s.length()-1][i] = s.charAt(i);
	   }
	   
		   
	   
	   

	}

	public String toString()
	{
		String output="";
		
		for (int i = 0; i < length.length(); i++){
			for (int k = 0; k < length.length(); k++){
				output += mat[i][k];
			}
			output += "\n";
		}




		return output+"\n\n";
	}
}