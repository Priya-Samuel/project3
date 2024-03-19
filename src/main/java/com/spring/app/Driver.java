package com.spring.app;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.app.Account;
 
public class Driver {
public static Account loadAccount()
{
//fill the code
ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
return context.getBean("accountObj",Account.class);}

public static void main(String[] args) 
{
	//fill the code
	Account a = loadAccount();
	if(a!=null) {
		System.out.println("Account number:"+a.getAccNumber());
		System.out.println("Account holder name:"+a.getAccHolderName());
		System.out.println("Balance:"+a.getAccBalance());
		System.out.println("Loan Type:"+a.getLoanInfo().getLoanType());
		System.out.println("Loan amount:"+a.getLoanInfo().getLoanAmount());
	}

}	 	  	    	    		        	 	



}
		