package org.banking.core;

public class CAccount{
	
	public int accNr;
	public String user;
	public double balance = 0;
	public int[] transactions;
	public int transCounter= 1;
	
	public CAccount(int accountNumber, String userName){
		accNr= accountNumber;
		user=userName;
		
	}
	
	public CAccount(int accountNumber, String userName, double startBalance){
		accNr= accountNumber;
		user=userName;
		balance = startBalance;
		
	}
	
	public void Deposit(int value){
		balance+=value;
		Transactions(value);

		
	}
	
	public void Withdraw(int value){
		if (balance>=value){
			balance-=value;
			Transactions(-value);		
		}
		System.out.println("Balance too low!");
	}
	
	public void Transactions(int value){
		
		int[] tempTransaction = new int[transCounter];
		if(transactions !=null){
			for(int i = 0; i < transactions.length; i++){
				tempTransaction[i] = transactions[i];
			}		
		}
//		for (int i = 0; i < tempTransaction.length; i++){
//			if(tempTransaction[i] == null){
//				tempTransaction[i]=value;
//			}
//		}
		tempTransaction[transCounter-1]= value;
		transCounter++;
		transactions=tempTransaction;
		
		
	}
	
	public void PrintAccount(){
		System.out.println("Name: "+user+ " || Accountnumber: "+accNr);
		System.out.println("Transactions:");
		if(transactions !=null){
			for (int t: transactions){
				System.out.println(t);
			}
		}
		else {System.out.println("No transactions");}
		System.out.println("Balance: "+balance);
				
	}

	
	//Setters
	public void setUserName(String newName){
		user=newName;
	}
	
	public void setAccountNr(int newAccNr){
		accNr=newAccNr;
	}
	public void setBalance(double newBalance){
		balance=newBalance;
	}
	
	
	//Getters
	public int getAccountNr(){
		return accNr;
	}
	public double getBalance(){
		return balance;
	}
	public String getUser(){
		return user;
	}
	
	
	
}