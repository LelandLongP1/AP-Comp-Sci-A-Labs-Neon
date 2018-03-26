//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner input = new Scanner(new File("C:\\Users\\longl5895\\Desktop\\AP-Comp-Sci-A-Labs-Neon\\unit 13\\src\\lab15d.dat"));
		int size = input.nextInt();
		input.nextLine();
		for (int i = 0; i < size; i++){
			FancyWords test= new FancyWords(input.nextLine());
			out.println(test);
		}
		





	}
}