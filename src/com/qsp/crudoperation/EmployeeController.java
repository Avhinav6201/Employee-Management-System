package com.qsp.crudoperation;

import java.util.ArrayList;
import java.util.*;
public class EmployeeController {
 Scanner sc=new Scanner(System.in);
	private ArrayList <Employee>e=new ArrayList<Employee>();
	public void save(Employee a) {
		e.add(a);
	}
	public void getdata() {
		for(int i=0;i<e.size();i++)
		{
			System.out.println(e.get(i));
			System.out.println("......................................................");
		}
	
	}
	
	public void getDataById(int id) {
		for(Employee emp:e) {
			if(emp.getId()==id) {
				System.out.println(emp);
			}
		}
	}
	
	public void remove(int id) {
		for(int i=0;i<e.size() ;i++){
			if(e.get(i).getId()==id) {
				e.remove(e.get(i));
			}
		}
		
	}
	public void update(int id) {
	 for(Employee emp :e) {
		 if(emp.getId()==id) {
			 System.out.println("What do you want to Update");
//	    	  
	    	  System.out.println("1.Name");
	    	  System.out.println("2.Mobno");
	    	  System.out.println("3.email");
	    	  System.out.println("4.Desigination");
	    	  int choice=sc.nextInt();
	    	  switch (choice){
			case 1: {
				String name=sc.next();
				emp.setName(name);
				System.out.println("Name Updated");
			 break;
			}
			case 2: {
				long mobno=sc.nextLong();
				emp.setMobno(mobno);
				System.out.println();
				System.out.println("Mobile Updated");
				break;
				
				
			}
			case 3: {
				String email=sc.next();
				emp.setEmail(email);
				System.out.println("Email Updated");
				break;
				
				
			}
			case 4:{
				String Desigination=sc.next();
				emp.setDesigination(Desigination);
				System.out.println("Designation Updated");
				break;
			}
			
			default:{
				System.out.println("Enter the valid choice");
			}
			
			}
	    	  
			 
		 }
		 
	 }
		
		
	}
	public void exit() {
		System.out.println("Thanks");
		System.exit(0);
	}
}
