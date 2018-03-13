//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	
	private List<Double> grades = new ArrayList<Double>();
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner chopper = new Scanner(System.in);
		int size = chopper.nextInt();
		while(chopper.hasNextDouble()){
			grades.add(chopper.nextDouble());
		}


	}
	
	public void setGrade(int spot, double grade)
	{
		grades.set(spot, grade);


	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < grades.size(); i++){
			sum += grades.get(i);
		}



		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		low = grades.




		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;





		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output="";





		return output;
	}	
}