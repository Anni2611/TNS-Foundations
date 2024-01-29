package com.tnsif.daythree;
import java.util.Scanner;
public class Executor {

	public static void main(String[] args) {
//		Customer obj=new Customer();
		Scanner s= new Scanner(System.in);
		String name;
		String city;
		int id;
		
		System.out.println("Enter your name : ");
		name=s.nextLine();
		System.out.println("Enter your City : ");
		city=s.nextLine();
		System.out.println("Enter your id : ");
		id=s.nextInt();
//        obj.setCustomerName(name);
//        obj.setCustomerCity(city);
//        obj.setCustomerId(id);
         
        Customer obj1= new Customer(name,id,city);
        System.out.println(obj1);
        
	}

}
