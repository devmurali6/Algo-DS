package com.practise.udemy.ds.assignment;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




class Employee {

	public String firstName;
	public String lastName;
	public Long empId;

	public Employee(String firstName, String lastName, long empId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

}


public class EmployeeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//List<Employee> inputlist= new ArrayList<Employee>();
		//inputlist.add(e1);inputlist.add(e2);inputlist.add(e3);inputlist.add(e4);inputlist.add(e5);

		Employee a[] = new Employee[5];
			
		Employee e1=new Employee("raju", "5", 919592385);
		Employee e2=new Employee("ravi", "2", 919592382);
		Employee e3=new Employee("ramesh", "4", 919592384);
		Employee e4=new Employee("raghu", "1", 919592381);
		Employee e5=new Employee("rajesh", "3", 919592383);
		
		a[0]=e1;a[1]=e2;a[2]=e3;a[3]=e4;a[4]=e5;
		
		
		for (int i = 1; i < a.length; i++) {
			
			Employee current=a[i];
			
			int j=i;
			
			while(j>0 && a[j-1].getEmpId()>current.getEmpId()){
				
				 a[j]=a[j-1];
				  j--;
			}
			
			a[j]=current;
			
		}
		
		
		//Display the list
		int i=0;
        for(Employee temp: a){
 		   System.out.println("Customer " + ++i + "--firstname-- : " + temp.firstName +
 			", --lastname-- : " + temp.getLastName()+ "--Employeeid--" +temp.getEmpId());
 		}

	}



}
