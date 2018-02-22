//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab11j
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("Enter Range for Triples");
	   int input = keyboard.nextInt(); 
	   Triples test = new Triples(input);
	   System.out.println(test);

	}
}