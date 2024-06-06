package com.qsp.crudoperation;
import java.util.*;
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 EmployeeController ec=new EmployeeController();
		 while(true) {
      
    System.out.println("Enter the choice");
      System.out.println("1.Save "); 
      System.out.println("2.getData");
      System.out.println("3.getDataById");
      System.out.println("4.remove");
      System.out.println("5.Update");
      
      System.out.println("6.Exit");
      
      
 
      int option=sc.nextInt();
      switch (option) {
	case 1: {
		
		{
			System.out.println("Enter the id");
		  int id=sc.nextInt();
		  
		  System.out.println("Enter the name");
		 String Name=sc.next();
		 System.out.println("Enter the email");
		 String Email=sc.next();
		 System.out.println("Enter the mobile number");
		 long mobno=sc.nextLong();
		 System.out.println("Enter the Desigination");
		 String desc=sc.next();
	
		 ec.save(new Employee(id,Name,mobno,Email,desc));
		 System.out.println("Data Saved Sucessfully");
		 
		  
		}
		break;
	}
     case 2: {
    	 
    	 ec.getdata();
		
	break;
	}
     case 3: {
    	 System.out.println("Enter the Employee id");
    	 int id=sc.nextInt();
	     ec.getDataById(id);
    	 break;
	
    	 
}
      case 4: {
    	  System.out.println("Enter the Employee id");
     	 int id=sc.nextInt();
 	     ec.remove(id);
     	System.out.println("Data Removed Sucessfully");
	break;
	
}
      case 5: {
    	  System.out.println("Enter the employee id which you want to update");
    	  int id =sc.nextInt();
    	 ec.update(id);
    	 
    	  
    	  
	
	break;
}
      case 6:{
    	  ec.exit();
	break;
}
	default:
		throw new IllegalArgumentException("Unexpected value: " + option);
	}
		
	}
	}
}
