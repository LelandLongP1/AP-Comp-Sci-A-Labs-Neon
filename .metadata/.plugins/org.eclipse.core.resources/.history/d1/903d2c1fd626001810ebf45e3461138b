//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String className;
	private List<Student> studentList = new ArrayList<Student>();
	
	public Class()
	{
		className = "";
	}
	
	public Class(String name, int stuCount)
	{
		className = name;
	
	}
	
	public void addStudent(Student s)
	{
		studentList.add(s);

	}
	
	public String getClassName()
	{
	   return className;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for (int i = 0; i < studentList.size(); i++){
			classAverage = classAverage + studentList.get(i).getAverage();
		}
		classAverage = classAverage / studentList.size();


		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for (int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getName().equals(stuName)){
				return studentList.get(i).getAverage();
			}
		}


		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		for (int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getAverage() > high){
				high = studentList.get(i).getAverage();
			}
		}
		
		for(int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getAverage() == high){
				hName = studentList.get(i).getName();
			}
		}

		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
		for (int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getAverage() < low){
				low = studentList.get(i).getAverage();
			}
		}
		
		for(int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getAverage() == low){
				hName = studentList.get(i).getName();
			}
		}





		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getAverage() < failingGrade){
				output = output + studentList.get(i).getName();
			}
		}





		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for (int i = 0; i < studentList.size(); i++){
			output += studentList.get(i) + "\n";
		}



		return output;
	}  	
}