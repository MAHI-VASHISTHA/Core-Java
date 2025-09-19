package test;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
		
	private String name;
	private int rollNo;
	private String addr;
	
	public int compareTo(Employee o) {
		return this.rollNo-o.rollNo;
	}
		
public Employee(String name,int rollNo,String addr) {
	
	this.name=name;
	this.rollNo=rollNo;
	this.addr=addr;
}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
		
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rollNo=" + rollNo + ", addr=" + addr + "]";
	}

		
	
	}

	
		
		
	
	
