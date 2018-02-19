//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		
		LetterRemover Test = new LetterRemover();
		Test.setRemover("I am Sam I am",'a' );
		System.out.println(Test);
		
		Test.setRemover("ssssssssxssssesssssesss",'s' );
		System.out.println(Test);
		
		Test.setRemover("qwertyqwertyqwerty",'a' );
		System.out.println(Test);
		
		Test.setRemover("abababababa",'b' );
		System.out.println(Test);
		
		Test.setRemover("abaababababa",'x' );
		System.out.println(Test);
		//add test cases
		
		
											
	}
}