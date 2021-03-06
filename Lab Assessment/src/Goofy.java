import java.util.Scanner;

public class Goofy {
	
	/** @param num is a positive non-decimal value
	* Precondition : num &gt;= 0
	* @return true if the sum of digit divisors of num is odd
	@return false if the sum of the digit divisors of num is even
	*/
	Scanner keyboard= new Scanner(System.in);
	
	
	public static boolean isGoofy(int num)
	{
		int number = num;
		int total = 0;
		int[]digits = {num};
		for (int i = 0; i < digits.length; i++){
			if (number % digits[i] == 0){
				total += digits[i];
			}
		}
		
		if (total % 2 != 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int [] newArray(int number, int[]digits){
		int []newArray = new int [digits.length +1];
		for (int i = 0; i <= digits.length; i++){
			newArray[i] = digits[i];
		}
		newArray[digits.length] = number;
		return newArray;
	}
	
	/* @param count is a positive non-decimal value
	* Precondition : count &gt; 0
	* @return an array containing count Goofy numbers
	*/
	public static int[] getSomeGoofyNumbers(int count)
	{
		int [] list = new int[count];
		int number = 1;
		int index = 0;
		while (index < count){
			if (isGoofy(number) == false){
			list[index] = number;
			index ++;
			number = number + 1;
			}
			else {
				number += 1;
			}
		}
		
		return list;
	}

	
	







public static void main (String args[]){
	System.out.println(Goofy.isGoofy(5));
	System.out.println(Goofy.getSomeGoofyNumbers(10));
	}

}