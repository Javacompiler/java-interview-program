package com.job;
class Course1{
	
	String course1;
	String course2;
	String course3;
	public Course1(){
		
	}
	/**
	 * @return the course1
	 */
	public String getCourse1() {
		return course1;
	}

	/**
	 * @param course1 the course1 to set
	 */
	public void setCourse1(String course1) {
		this.course1 = course1;
	}

	/**
	 * @return the course2
	 */
	public String getCourse2() {
		return course2;
	}

	/**
	 * @param course2 the course2 to set
	 */
	public void setCourse2(String course2) {
		this.course2 = course2;
	}

	/**
	 * @return the course3
	 */
	public String getCourse3() {
		return course3;
	}

	/**
	 * @param course3 the course3 to set
	 */
	public void setCourse3(String course3) {
		this.course3 = course3;
	}

	public Course1(String course1, String course2, String course3) {
		super();
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
	}

	
}
class Student1 implements Cloneable{
	Course1  course;
	String name;
	
	/**
	 * @return the course
	 */
	public Course1 getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(Course1 course) {
		this.course = course;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public Student1(Course1 course, String name) {
		super();
		this.course = course;
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
}
public class ShallowCopy {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Course1 course=new Course1("Math", "Bio", "Phy");
		Student1 student1=new Student1(course, "Bhanu");
		Student1 cloned=(Student1) student1.clone();
		System.out.println(student1.getCourse().getCourse1()+" original object -- "+student1.getName());
		System.out.println(cloned.getCourse().getCourse1()+" -cloned object- "+cloned.getName());
		cloned.course.course1="Hin";
		cloned.name="sweta";
		System.out.println(student1.getCourse().getCourse1()+" -- "+student1.getName());
		System.out.println(cloned.getCourse().getCourse1()+" -- "+cloned.getName());

	}

}
