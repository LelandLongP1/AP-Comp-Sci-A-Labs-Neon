//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.io.File;
import java.util.Scanner;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;

	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
			for (int i = 0; i < vowels.length(); i++){
				for (int j = 0; j < word.length(); j++){
					if (vowels.charAt(i) == word.charAt(j)){
						vowelCount += 1;
					}
				}
			}
			
		





		return vowelCount;
	}

	public int compareTo(Word rhs)
	{
		if (numVowels() > rhs.numVowels()){
			return 1;
		}
		if (numVowels() < rhs.numVowels()){
			return -1;
		}
		for (int i = 0; i < word.length(); i++){
			if (numVowels() == rhs.numVowels()){
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