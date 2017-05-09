package com.wipro.bank.assessment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wipro.bank.assessment.App;
import com.wipro.bank.entity.Account;


public class AppTest{
       
       App app=null;
       
       @Before
       public void  before(){
                           
              app=new App();
       }
       
       @After
       public void after(){
              app=null;
              
              
       }
       @Test
       public void getAccountDetailsByIDTest(){
              
               assertEquals(App.accounts.get(0),app.getAccountDetailsByID(1));             
               
               
        }
       @Test
       public void getAccountDetailsByBalanceTest(){
              List<Account> acc=new ArrayList<Account>();
              acc.add(App.accounts.get(0));
              acc.add(App.accounts.get(1));
          
              assertNotNull(app.getAccountDetailsByBalance(750.00));
              
        }
       
}
