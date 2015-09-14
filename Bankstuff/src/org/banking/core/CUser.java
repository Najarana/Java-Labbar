package org.banking.core;

public class CUser {

	public String userName;
	public CAccount[] userAccounts;
	
	public CUser(String name, CAccount account) {
		
		userName = name;
		userAccounts = new CAccount[]{account};
		
				
	}

	public CUser(String name){
		
	}
	
	public int createAccount(int accCounter){
		CAccount[] temp = new CAccount[userAccounts.length +1];
		CAccount user = new CAccount(accCounter, userName);
		temp[userAccounts.length] = user;
		accCounter++;
		userAccounts=temp;
		return accCounter;
	}
}
