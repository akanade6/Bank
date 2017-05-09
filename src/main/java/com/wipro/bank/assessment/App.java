package com.wipro.bank.assessment;


import java.util.ArrayList;
import java.util.List;

import com.wipro.bank.entity.Account;

public class App 
{

	public static final List<Account> accounts = new ArrayList<Account>();

	private List<Account> emp2;


	public Account getAccountDetailsByID(int id)
	{
		Account emp1=null;
		for(Account e:accounts)
		{
			if(e.getAccountID()==id){
				emp1=e;
			}

		}
		System.out.println(emp1);
		return emp1;
		



	}

	public List<Account> getAccountDetailsByBalance(double amount)
	{
		return emp2;
	


	}

	public static void main( String[] args )
	{

		


	}
}
