package com.clone;

public class MainApp {
	public static void main(String[] args) {
		Employee e=new Employee(23,"Abhiraj",56000,6789,546);
		System.out.println(e);
		
		System.out.println("===============");
		
		Employee emp;
		try {
			emp=(Employee)e.clone();
			System.out.println(emp);
		}catch(CloneNotSupportedException e1) {
			e1.printStackTrace();
		}
	}
}
