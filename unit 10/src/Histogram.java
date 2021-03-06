//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count = new ArrayList<Integer>();
	private ArrayList<Character> letters = new ArrayList<Character>();
	private String fileName = "";

	public Histogram()
	{
		
	}

	public Histogram(char[] values, String fName)
	{
		fileName = fName;
		
		for (int i = 0 ; i < values.length; i++){
			letters.add(values[i]); 
			
		}
		
		out.println("search letters = "+letters);
		
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		
		Scanner file = new Scanner(new File(fileName));
		for (int i = 0; i < letters.size(); i++){
			int number = 0;
			while(file.hasNext()){
				String word = file.next(); 
				for (int k = 0; k < word.length(); k++){
					if (word.charAt(k) == letters.get(i)){
						number = number + 1;
						
					}//if statement
					
				}//check loop	
				
			}//while loop
			count.add(number);
		}//for loop
		





	}

	public char mostFrequent()
	{
		
		return letters.get(count.indexOf(Collections.max(count)));
	}

	public char leastFrequent()
	{


		return letters.get(count.indexOf(Collections.min(count)));
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}