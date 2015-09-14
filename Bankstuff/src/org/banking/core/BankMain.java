package org.banking.core;

import java.util.Scanner;

public class BankMain {
	public static Scanner s = new Scanner(System.in);
	public static Scanner i = new Scanner(System.in);
	public static int accCounter = 1;
	static CAccount[] accounts = new CAccount[50];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mainMenu();
		
		CUser
//		CAccount user = new CAccount(115, "Marco");
//		accounts[0] = user;
//		user = new CAccount(110, "Marco");
//		accounts[1] = user;
//		
//		accounts[0].Deposit(100);
//		accounts[0].Withdraw(50);
//		accounts[0].Deposit(500);
//		
//		accounts[1].Deposit(25);
//		accounts[1].Withdraw(10);
//		accounts[1].Deposit(510);
//		//user.PrintAccount();
//		
//		for (int i = 0; i<accounts.length; i++){
//			if(accounts[i] != null){accounts[i].PrintAccount();}	
//		}
//			
//		//System.out.println("");
	}
	
	public static void newAccount(){
		
		System.out.println("Create new account: ");
		System.out.print("Enter name: ");
		String name = s.nextLine();
		CAccount user = new CAccount(accCounter, name);
		accounts[accCounter-1] = user;
		accCounter++;
		
				
	}
	
	public static void getUserAccounts(String user){
			for(CAccount a : accounts){
				 if(a !=null && a.getUser().equals(user)){
					 //int accNr = a.getAccountNr();
					 System.out.println("Account: " +a.getAccountNr());
				 }
			 }
		
	}
	
	public static void mainMenu(){
		int choice;
		int value;
		int accNr;
		do{
			System.out.println("Welcome to McBank");
			System.out.println("What would you like to do today?");
			System.out.println("1. Start new Account");
			System.out.println("2. Search user accounts");
			System.out.println("3. Deposit: ");
			System.out.println("4. Withdraw: ");
			System.out.println("5. AccountLog");
			System.out.println("6. Quit");
			choice = i.nextInt();
			switch(choice){
			case 1:
				newAccount();				
				break;
			
			case 2:
				System.out.print("Enter name of user: ");
				getUserAccounts(s.nextLine());
				break;
				
			case 3:
				System.out.print("Enter accountnumber: ");
				accNr = i.nextInt();
				System.out.print("Enter amount for deposit: ");
				value = i.nextInt();
				accounts[accNr-1].Deposit(value);
				break;
			
			case 4:
				System.out.print("Enter accountnumber: ");
				accNr = i.nextInt();
				System.out.print("Enter amount for withdrawal: ");
				value = i.nextInt();
				accounts[accNr-1].Withdraw(value);
				
				break;
			
			case 5:
				System.out.print("Enter accountnumber: ");
				accNr = i.nextInt();
				accounts[accNr-1].PrintAccount();
				break;
				
			case 6:
				System.exit(0);
				break;
			}
			
		}while (choice != 6);

	}
}