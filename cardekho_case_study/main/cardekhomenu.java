package com.jspiders_cardekho_case_study.main;


import java.util.Scanner;

import com.jspiders.cardekho_case_study.operation.caroperation;


public class cardekhomenu extends caroperation {

	
	
	public static void main(String[] args)
	{
		System.out.println("SELECT YOUR CHOICE ");
		
		mainMenu();
	
	System.out.println("Thank You  For Your Valuable Time ! ");
		
	}

		static Scanner sc = new Scanner(System.in);
	
		public static void mainMenu()
		{
			System.out.println("========MENU=======\n"+
                	"1.Add/Remove Car\n"+
					"2.Update Car Details\n"+
					"3.Search Car Details\n"+
					"4.Display All Car Details\n"+
					"5.Exit\n");
			switch (get_Choice()) {
			case 1:{
				addRemove();
				mainMenu();
				break;
			}
			case 2:{
				
				updateCarDetails();
				mainMenu();
				break;							
			}
			case 3:{
				searchMenu();
				mainMenu();
				break;				
			}
			case 4:{
				displayADetails();
				mainMenu();
			}
			case 5:{
				return;			
			}
			default:
			{
				System.out.println("Invalid Choice! ");
				mainMenu();
			}
			}
			
		}
		public static void addRemove()
		{
			System.out.println("========MENU=======\n"+
                	"1.Add Car Details\n"+
					"2.Remove Car Details\n"+
					"3.main Menu\n");
					
			switch (get_Choice()) {
			case 1:{
				System.out.print("How Many Car Do You Want To Add : ");
				int Count = sc.nextInt();
				while(Count>0)
				{
					Add_Car();
					Count--;
				}
				
				break;
			}
			case 2:{
				Remove_Car();
				break;
			}
			case 3:{
				mainMenu();
				break;
			}
			default :
			{
				addRemove();
			}
			}
		}
		
//--------------SearchCarMenu------------
		public static void searchMenu() 
		{
			System.out.println(	"SEARCH CAR BY : \n"+
				    "1.By Car Id \n"+
					"2.By Car Name \n"+
				    "3.By Car Brand\n"+
					"4.By Car Fuel Type \n"+
				    "5.By Car Price\n"+
					"6.Go To Main Menu\n");
			int k=get_Choice(); 	
			if (k<6) {
				searchCar(k);
			} 
			else if(k==6) {
				mainMenu();
			}
			else if(k>6) {
				searchMenu();
			}
		}
		
//--------------Update Menu-------------
		
		public static void updateMenu() 
		{
			
			updateCarDetails();
			mainMenu();
		}
		
		//---------get the input---------
		

		
}