package com.jspiders.cardekho_case_study.operation;

import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.jspiders.cardekho_case_study.entity.car;

public class caroperation extends car{
	
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<car> obj = new ArrayList<car>();
	
	//-------New Add Car Details--------
	public static void Add_Car() 
	{
		
		obj.add(new car());
		System.out.println("---"+obj.get(0).toSting() + " Successfully Added ------\n");
		                                                                                                                 
	}
	
	
	//------------Remove Car ----------
	public static void Remove_Car() 
	{
		displayADetails();
		System.out.println("Enter Your Car Number Do You Want To Delete : ");
		int a=sc.nextInt();
		obj.remove(a-1);
		System.out.println("\n------Successfully Remove the Car-------\n");
	}
	
	
	//-------------Search Car-----------
	public static void searchCar(int num)
	{
//				"1.CAR ID  \n"+
//				"2.CAR NAME \n"+
//			    "3.Company Name \n"+
//				"4.Fuel Type \n"+
//			    "5.Price\n"+
//				"6.Exit\n");
		
		switch (num) {
		case 1: {
			System.out.println("Enter Your Car Id You Want To Search : ");
			int id= sc.nextInt();
			num=0;
			for(car var : obj)
			{
				if (var.get_Car_id()==id) {
					var.displayCarDetails();
					num++;
				}
				
			}
			if (num==0) {
				System.out.println("Sorry Entered Data Are Not Matched");
			}
			break;
		}
		case 2: {
			System.out.println("Enter Your Car Name You Want To Search : ");
			String Caname= sc.next();
			num=0;
			for(car var : obj)
			{
				if (var.get_Car_name().equals(Caname)) {
					var.displayCarDetails();
					num++;
				}
				
			}
			if (num==0) {
				System.out.println("Sorry Entered Data Are Not Matched");
			}
			break;
		}
		case 3: {
			System.out.println("Enter Your Company Name You Want To Search : ");
			String Caname= sc.next();
			num=0;
			for(car var : obj)
			{
				
				if (var.get_Brand().equals(Caname)) {
					var.displayCarDetails();
					num++;  
				}
				
			}
			if (num==0) {
				System.out.println("Sorry Entered Data Are Not Matched");
			}
			break;
		}
		case 4: {
			System.out.println("Enter Your Fuel Type You Want To Search : ");
			String Caname= sc.next();
			num=0;
			for(car var : obj)
			{
				if (var.get_fuel_type().equals(Caname)) {
					var.displayCarDetails();
					num++;
				}
				
			}
			if (num==0) {
				System.out.println("Sorry Entered Data Are Not Matched");
			}
			break;
		}
		case 5: {
			System.out.println("Enter Your Car Name You Want To Search : ");
			double price= sc.nextDouble();
			num=0;
			for(car var : obj)
			{
				if (var.get_price()<price) {
					var.displayCarDetails();
					num++;
				}
				
			}
			if (num==0) {
				System.out.println("Sorry Entered Data Are Not Matched");
			}
			break;
		}
		
		default:
			break;
			
		}
	}
	
	
//------------------Display All Details ------------
	public static void displayADetails()
	{
		System.out.println("IN DATABASE "+ obj.size()+" Car Present ");
		System.out.println("================================================");
		System.out.println("ID\t"+"Car_Name\t"+"Brand\t"+"Fuel_Type\t"+"Price ");
		for(car var : obj)
		{
			System.out.println(var.get_Car_id()+"\t"+var.get_Car_name()
			+"\t\t"+var.get_Brand()+"\t"+var.get_fuel_type()+"\t\t"+var.get_price());
		}
		
	}
	
	
	//------------------------Update Car Details ------------------
	
	public static int get_Choice()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Your Choice Number : ");
		int a=0;
		try {
			a= sc.nextInt();
		} catch (InputMismatchException e) {
			get_Choice();
			System.out.println("Enter Only Integer Value ! \n");
			
		}
		return a;
	} 
	public static void updateCarDetails()
	{
		
		displayADetails();
		
		System.out.println("Select Car Number You Want Upadate : ");
		int a= sc.nextInt(); 
		obj.get(a-1).displayCarDetails();
		 System.out.println(	"What Do You Want TO Update : \n"+
			    "1.CAR ID  \n"+
				"2.CAR NAME \n"+
			    "3.Company Name \n"+
				"4.Fuel Type \n"+
			    "5.Price\n"
				);
		int k=get_Choice(); 
		
		if (k<6) {
			switch(k)
			{
			case 1 :{
				System.out.print("Enter Your Updated Value for id : " );
				int id= sc.nextInt();
				obj.get(a-1).set_Car_id(id);
				break;
				
			}
			case 2 :{
				System.out.print("Enter Your Updated Value for Car Name : " );
				String cName= sc.next();
				obj.get(a-1).set_Car_name(cName);;
				break;
			}
			case 3 :{
				System.out.print("Enter Your Updated Value for Company Name: " );
				String coName= sc.next();
				obj.get(a-1).set_Brand(coName);;
				break;
			}
			case 4 :{
				System.out.print("Enter Your Updated Value for Fuel Type : " );
				String fType= sc.next();
				obj.get(a-1).set_fuel_type(fType);;
				break;
				
			}
			case 5 :{
				System.out.print("Enter Your Updated Value for Price : " );
				double pr= sc.nextDouble();
				obj.get(a-1).set_price(pr);
				break;
			}
			
			default:{
				return;
			}
			}
		
		System.out.println("Your value Will Be Updated successfully !");
		obj.get(a-1).displayCarDetails();
		}
		else {
			System.out.println("Wrong Choice Select Again ! ");
			updateCarDetails();
		}
	}
	
	public static void main(String[] args) {
		Add_Car();
		displayADetails();
		
	}
	
}
