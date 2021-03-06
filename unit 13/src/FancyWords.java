//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		setWords(sentence);
	}

	public void setWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < wordRay.length; i++){
			if (wordRay[i].length() > max)
				max = wordRay[i].length();
		}
		
		char[][] printed = new char[max][max];
		
		for(int i = 0; i < wordRay.length; i++){
			StringBuffer sc = new StringBuffer(wordRay[i]);
			wordRay[i] = sc.reverse().toString();
		}
		
		Collections.reverse(Arrays.asList(wordRay));
		
		for (int i = 0; i < wordRay.length; i++){ // columns
			for (int k = 0; k < wordRay[i].length(); k++){ //rows
				printed[k][i] = wordRay[i].charAt(k);
			}
		}
		
		for (int i = 0; i < max; i ++){ //row 
			for (int k =0; k < max; k++){ // column
				output += printed[i][k];
			}
			output += "\n";
			
		}
		




		return output+"\n\n";
	}
}