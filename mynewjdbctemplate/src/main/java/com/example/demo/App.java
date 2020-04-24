package com.example.demo;

import java.sql.SQLException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.bean.Account;
import com.example.demo.bean.AccountType;
import com.example.demo.bean.ToDo;
import com.example.demo.repo.ToDoRepository;
import com.example.demo.repo.ToDoRepositoryImpl;
import com.example.demo.service.AccountService;
import com.example.demo.service.AccountServiceImpl;
import com.example.demo.service.ToDoService;
import com.example.demo.service.ToDoServiceImpl;

public class App 
{

	
	
	
	public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService service=context.getBean("accountServiceImpl",AccountServiceImpl.class);
		 Account account=context.getBean("account",Account.class); 
		 Scanner sc=new Scanner(System.in);
		 
		//without jdbc template
		/*
		 * ToDoService service=context.getBean("toDoServiceImpl",ToDoServiceImpl.class);
		 * ToDo todo=context.getBean("toDo",ToDo.class);
		 * todo.setTodoID(UUID.randomUUID().toString()); todo.setTodoName("testing");
		 * todo=service.createToDo(todo); System.out.println(todo);
		 
		 
		 */
		
		//with jdbc template
				/*
				 * ToDoService service=context.getBean("toDoServiceImpl",ToDoServiceImpl.class);
				 * ToDo todo=context.getBean("toDo",ToDo.class); String
				 * str[]=UUID.randomUUID().toString().split("-"); todo.setTodoID(str[0]);
				 * todo.setTodoName("testing"); todo=service.createToDo(todo);
				 * System.out.println(todo);
				 * 
				 * 
				 * 
				 */
				
		System.out.println("do you want enter? select 1 for yes 2 for no");
		int ch =sc.nextInt();
		while(ch==1)
		{
	
		 System.out.println("1.createaccount\n2.listalldetails\n3.findbyaccountnumbern"
		 		+ "\n4.find by amount\n5.updatebalance\n6.deletebyid\n7.exit");
	
		 int choice =sc.nextInt();
		 switch(choice)
		 {
		 case 1:
			// creating an Account
			 
			  String str[]=UUID.randomUUID().toString().split("-");
			  account.setAccountNumber(str[0]);
			  account.setAccountType("CREDIT_CARD");
			  account.setInitialBalance(100000);
			  
			  account=service.createAccount(account); 
			  System.out.println(account);
			  break;
		 case 2:
			 		//listing the Account 
				
				  List<Account> list=service.getAllAccountDetails();
				  Iterator<Account> i=list.iterator(); 
				  while(i.hasNext())
				  {
					  Account account2=i.next();
					  System.out.println(account2);
				  }
				  break;
		 case 3:
			 //Finding the account by account number
			 
			 account=service.findByAccountNumber("a27433c3");
			 System.out.println(account);
			 break;
		 case 4:
			// find by amount
				
				  List<Account> l=service.findByAmount(5000); for(Account a:l) {
				  System.out.println(a); }
				 break;
		 case 5:
			//update balance
			 service.updateBalance("a27433c3", 200000);
			 break;
		 case 6:
			//delete by id
			 try
			 {
			
			 service.deleteById(sc.next());
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			
			break;
				
		 case 7:break;	
		
			 	
				  }
		 }
		
    }
}
