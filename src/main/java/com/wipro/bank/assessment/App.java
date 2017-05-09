package com.wipro.bank.assessment;


import java.util.ArrayList;
import java.util.List;

import com.wipro.bank.entity.Account.Account;

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
		emp2 =new ArrayList<Account>();          
		for(Account e:accounts){                 
			if(e.getBalance()>=amount){                     
				emp2.add(e);
			}
		}
		if(emp2.size()==0){
			emp2=null;
		}
		System.out.println(emp2);
		return emp2;


	}

	public static void main( String[] args )
	{

		accounts.add(new Account(1,"acc1",101.11));
		accounts.add(new Account(2,"acc2",201.13));
		accounts.add(new Account(3,"acc3",301.22));
		accounts.add(new Account(4,"acc4",401.55));
		accounts.add(new Account(5,"acc5",501.77));
		accounts.add(new Account(6,"acc6",601.22));
		accounts.add(new Account(7,"acc7",701.11));
		accounts.add(new Account(7,"acc8",801.99));

		App temp = new App();
		temp.getAccountDetailsByID(1);
		temp.getAccountDetailsByBalance(501.77);


	}
}
