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

public class Student implements Comparable <Student>
{
	private String myName;
	private Grades myGrades;
	private String output = "";
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);
		output = name + " = " + myGrades.getgrade(gradeList);


	}
	
	public void setName(String name)
	{
		myName = name;

	}	
	
	public void setGrades(String gradeList)
	{
		myGrades = new Grades(gradeList);
	
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);

	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return getSum() / getNumGrades();
	}

	public double getAverageMinusLow()
	{
		return ((getAverage() * getNumGrades()) - getLowGrade()) / (getNumGrades()-1);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public String toString()
	{
		
		return output;
	}

	public int compareTo(Student param) {
		if (this.getAverage() > param.getAverage()){
			return 1;
		}
		else if (getAverage() < param.getAverage()){
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
	public boolean equals(Object obj){
		if (this.equals(obj)){
			return true;
		}
		return false;
	}

	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (this.getAverage() > o.getAverage()){
			return 1;
		}
		else if (getAverage() < o.getAverage()){
			return -1;
		}
		else {
			return 0;
		}
	}*/
}