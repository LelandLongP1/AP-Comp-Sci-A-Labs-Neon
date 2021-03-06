//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private int size = 0;
	Scanner keyboard = new Scanner(System.in);
	double [] finalList;
	private static DecimalFormat df2 = new DecimalFormat(".##");
	
	//constructor
	public Grades(int num){
		setArray(num);
		
	}
	

	//set method
	public void setArray(int num){
		size = num;
		double gradeList[] = new double[size];
		for (int gradeNum = 0; gradeNum < size; gradeNum++){
			System.out.println("Enter grade " + (gradeNum + 1));
			gradeList[gradeNum] = keyboard.nextDouble();
		}
		finalList = gradeList;
	}



	private double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < finalList.length; i++){
			sum = sum + finalList[i];
		}


		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum() / finalList.length;


		return average;
	}


	//toString method
	public String toString(){
		String output = "";
		for (int i = 0; i < size; i++){
			output = output + "\n" + "Grade " + i + " :: " + finalList[i];
		}
		
		output = output + "\n\n" + "average: " + df2.format(getAverage());
		return output;
	}


}