package com.job;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



class Employee  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2068098682052554179L;
	private int id;
	private  String name;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
public class EmployeeSer {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file=new File("emp.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileInputStream fis=new FileInputStream(file);
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("bhanu");
		Employee employee1=new Employee();
		employee1.setId(2);
		employee1.setName("sweta");
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.writeObject(employee1);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee employee2=(Employee) ois.readObject();
		Employee employee3=(Employee) ois.readObject();
		System.out.println(employee2.getId()+" "+employee2.getName());
		
		System.out.println(employee3.getId()+" "+employee3.getName());
	}
	

}
