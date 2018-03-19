//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable <Word>
{
	private String word;

	public Word( String s )
	{
		word = s;

	}
	
	public int getWord(){
		return word.length();
	}


	public int compareTo( Word rhs )
	{
		if (word.length() > rhs.getWord()){
			return 1;
		}
		else if (word.length() < rhs.getWord()){
			return -1;
		}
		for (int i = 0; i < word.length(); i++){
			if (word.length() == rhs.getWord()){
				if (word.charAt(i) > rhs.word.charAt(i)){
					return 1;
				}
				if (word.charAt(i) < rhs.word.charAt(i)){
					return -1;
				}
			}
		}
		
		return 0;
		
		
		
	}
	
	
	
	

	public String toString()
	{
		return word;
	}
}