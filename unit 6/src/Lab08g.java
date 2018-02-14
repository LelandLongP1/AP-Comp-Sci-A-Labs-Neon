//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab08g
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int a;
		int b;
		System.out.print("starting number: ");
		a = keyboard.nextInt();
		System.out.print("ending number: ");
		b = keyboard.nextInt();
		LoopStats test = new LoopStats(a,b);
		System.out.print(test + "\n");
		
		System.out.print("starting number: ");
		a = keyboard.nextInt();
		System.out.print("ending number: ");
		b = keyboard.nextInt();
		test.setNums(a, b);
		System.out.print(test + "\n");
		
		System.out.print("starting number: ");
		a = keyboard.nextInt();
		System.out.print("ending number: ");
		b = keyboard.nextInt();
		test.setNums(a, b);
		System.out.print(test + "\n");
		//add test cases
		
		
	}
}