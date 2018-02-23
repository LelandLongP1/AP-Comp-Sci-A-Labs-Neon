import java.util.Scanner;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14d
{
	public static void main( String args[] )
	{
		int num = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many grades do you want to input?");
		num = keyboard.nextInt();
		Grades test = new Grades(num);
		System.out.println(test);
		//add test cases
		
		
		
	}
}