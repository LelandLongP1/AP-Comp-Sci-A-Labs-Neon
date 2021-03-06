//� A+ Computer Science  -  www.apluscompsci.com
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

import java.lang.reflect.Array;

public class Grades
{
	
	private List<Double> grades = new ArrayList<Double>();
	private String output = "";
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);
		getgrade(gradeList);
		output = gradeList;
	}
	
	public void setGrades(String gradeList)
	{
		Scanner chopper = new Scanner(gradeList);
		int size = chopper.nextInt();
		if (chopper.next() != "-"){
			while (chopper.hasNextDouble()){
				grades.add(chopper.nextDouble());
			}
		}
		
		
	}
	
	public void setGrade(int spot, double grade)
	{
		grades.set(spot, grade);


	}
	
	public String getgrade(String gradeList){
		String list = "";
		Scanner chopper = new Scanner(gradeList);
		int size = chopper.nextInt();
		if (chopper.next() != "-"){
			while (chopper.hasNextDouble()){
				list = list + " " + chopper.nextDouble();
			}
		}
		return list;
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
		for (int i = 0; i < grades.size(); i++){
			if (grades.get(i) < low){
				low = grades.get(i);
			}
		}




		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (int i = 0; i < grades.size(); i++){
			if (grades.get(i) > high){
				high = grades.get(i);
			}
		}




		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		




		return output;
	}	
}