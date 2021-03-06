//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{


	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int j = 0;
		for (int i = 0; i < 3; i++){	
			for (int k = 0; k < 3; k++){
				mat[i][k] = game.charAt(j);
				j++;
			}
		}
		for (int i = 0; i < 3; i++){
			for (int k = 0; k < 3; k++){
				out.print(mat[i][k]);
			}
			out.println();
		}


	}

	public String getWinner()
	{
		//horizontal 
		for (int i = 0; i < 2; i++){	
			int k = 0;
			char temp = mat[i][k];
			if (mat[i][k+1] == temp){
				if (mat[i][k+2] == temp){
					return temp + " wins horizontally";
				}
			}
		}
		
		//vertical 
		for (int i = 0; i < 3; i++){
			int k = 0;
			char temp = mat[k][i];
			if (mat[k+1][i] == temp && mat[k+2][i] == temp){
				return temp + " wins vertically";
			}
			
		}
		
		//diagonal 
		if (mat[1][1] == mat[0][2] && mat[1][1] == mat[2][0]){
			char temp = mat[1][1];
			return temp + " wins diagonally";
		}
		
		if (mat[1][1] == mat[0][0] && mat[1][1] == mat[2][2]){
			char temp = mat[1][1];
			return temp + " wins diagonally";
		}
		











		return "cat's game - no winner";
	}

	public String toString()
	{
		String output="";
		output += getWinner();






		return output+"\n\n";
	}
}