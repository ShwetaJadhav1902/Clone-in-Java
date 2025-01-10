package com.clone;

public class Employee {
	private int empId;
	private String name;
	private int basicSal;
	private double hra;
	private double da;
	
	public Employee() {
		super();
	}
	
	public Employee(int Id, String name, int sal, double hra, double da) {
		super();
		this.empId = Id;
		this.name = name;
		this.basicSal = sal;
		this.hra = hra;
		this.da = da;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", basicSal=" + basicSal + ", hra=" + hra + ", da=" + da
				+ "]";
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(int basicSal) {
		this.basicSal = basicSal;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}
	
	public double calSal() {
		return  basicSal+hra+da;
	}
	
	public void print() {
		System.out.println("EmployeeId:"+empId);
		System.out.println("EmployeeName:"+name);
		System.out.println("EmployeeBasicSal:"+basicSal);
		System.out.println("Employeehra:"+hra);
		System.out.println("Employeeda:"+da);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
