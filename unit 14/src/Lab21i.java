//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner sc = new Scanner(new File("C:\\Users\\Spam Sushi\\Desktop\\AP-Comp-Sci-A-Labs-Neon\\unit 14\\src\\lab21i.dat"));
		int size = sc.nextInt();
		sc.nextLine();
		String rows = sc.nextLine();
		
		Maze test = new Maze(size, rows);
		test.hasExitPath(1, 1);
		out.println(test);
		
		size = sc.nextInt();
		sc.nextLine();
		rows = sc.nextLine();
		Maze testTwo = new Maze(size, rows);
		testTwo.hasExitPath(0, 0);
		out.println(testTwo);
		
		
	}
}