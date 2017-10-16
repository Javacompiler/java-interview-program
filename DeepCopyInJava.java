package com.job;
class Course implements Cloneable
{
	String subject1;

	String subject2;

	String subject3;

	public Course(String sub1, String sub2, String sub3)
	{
		this.subject1 = sub1;

		this.subject2 = sub2;

		this.subject3 = sub3;
	}

	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class Student implements Cloneable
{
	int id;

	String name;

	Course course;

	public Student(int id, String name, Course course)
	{
		this.id = id;

		this.name = name;

		this.course = course;
	}

	//Overriding clone() method to create a deep copy of an object.

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//Student student = (Student) super.clone();
		Student student=new Student(id, name, course);

		//student.course = (Course) course.clone();

		return student;
	}
}

public class DeepCopyInJava
{
	public static void main(String[] args)
	{
		Course course = new Course("Physics", "Chemistry", "Biology");

		Student student = new Student(111, "John", course);

		Student cloned = null;

		try
		{
			//Creating a clone of student1 and assigning it to student2

			cloned = (Student) student.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}

		//Printing the subject3 of 'student1'

		System.out.println(student.course.subject3);         //Output : Biology

		//Changing the subject3 of 'student2'

		cloned.course.subject3 = "Maths";

		//This change will not be reflected in original student 'student1'

		System.out.println(student.course.subject3);       //Output : Biology
		
	}
}