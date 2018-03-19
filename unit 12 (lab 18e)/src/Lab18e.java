//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		ArrayList<Word> ordered = new ArrayList<Word>();
		ArrayList<Word> temp = new ArrayList<Word>();
		Scanner file = new Scanner(new File("C:\\Users\\Spam Sushi\\Desktop\\AP-Comp-Sci-A-Labs-Neon\\unit 12 (lab 18e)\\src\\lab18e.dat"));
		Word test;
		int size = file.nextInt();
		file.nextLine();
		while (file.hasNextLine()){
			test = new Word(file.nextLine());
			temp.add(test);
			
		}
		out.println(temp);
		ordered = temp;
		for (int i = 0; i < temp.size()-1;i++){
			int spot = i;
			for (int j = i; j < temp.size(); j++){
				if (temp.get(j).compareTo(temp.get(spot)) < 0){
					spot = j;
				}
			}
			Word save = temp.get(i);
			temp.set(i,temp.get(spot));
			temp.set(spot, save);
			
		}
		
		
		out.println(temp);










	}
}