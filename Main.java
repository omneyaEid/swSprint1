package swproject;

import java.util.ArrayList;
import java.util.Scanner;

//import tester.foo;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	Scanner input = new Scanner(System.in);
    	NotificationImp no= new NotificationImp();
    	no.smsnotify.intializphones();
    	no.mailnotify.initialize();
    	int role=0;
    	String type="";
    	int choice;
    	System.out.println("[1] administirtor");
    	System.out.println("[2] user");
    	System.out.println("enter your role");
    	 role= input.nextInt();
    	if(role==1)
    	{
    		
        	do {
        	System.out.println("[1] create");
        	System.out.println("[2] update");
        	System.out.println("[3] read");
        	System.out.println("[4] Delete");
        	System.out.println("[5] Exit");
        	System.out.println("please chooce what do you whant");
        	 choice= input.nextInt();
        	
        	switch(choice)
        	{
        	case 1:
        	{
        		System.out.println("do you whant send notification in email or sms");
            	System.out.println("[1]email");
            	System.out.println("[2]phone");        	
            	int choice2= input.nextInt();
            	
            	if( choice2==1) {
            		type="email";
            		no.creat(type);
            	}
            	else if(choice2==2){
            		type="phone";
            		no.creat(type);
            	}
        		break;
        	}
        	case 2:
        	{
        		System.out.println("do you whant send notification in email or sms");
            	System.out.println("[1]email");
            	System.out.println("[2]phone");      	
            	int choice2= input.nextInt();

            	if( choice2==1) {
            		type="email";
            		no.update(type);
            	}
            	else if(choice2==2){
            		type="phone";
            		no.update(type);
            	}
        		break;
        	}
        	case 3:
        	{
        		System.out.println("do you whant send notification in email or sms");
            	System.out.println("[1]email");
            	System.out.println("[2]phone");      	
            	int choice2= input.nextInt();

            	if( choice2==1) {
            		type="email";
            		no.read(type);
            	}
            	else if(choice2==2){
            		type="phone";
            		no.read(type);
            	}
        		break;
        	}
        	case 4:
        	{
        		System.out.println("do you whant send notification in email or sms");
            	System.out.println("[1]email");
            	System.out.println("[2]phone");      	
            	int choice2= input.nextInt();

            	if( choice2==1) {
            		type="email";
            		no.delete(type);
            	}
            	else if(choice2==2){
            		type="phone";
            		no.delete(type);
            	}
        		break;
        	}
        	case 5:
        	{
        		System.out.println("Good bye");
        		break;
        	}
        	}
        	
        	}while(choice!=5);
        	
        	
        	
        	
    	}else if(role==2) {
    		int choice1,choice2 = 0;

            SMSNotify smsnotifi= new SMSNotify();
            smsnotifi.intializphones();
        	String check;
        	do {
        	System.out.println("[1] Register");
        	System.out.println("[2] Login");
            System.out.println("[3] book flight");
        	System.out.println("[4] logout");
        	choice1 =input.nextInt();
        	switch(choice1)
        	{
        	case 1:
        	{
            	register r = new register();
                System.out.println("[1]email");
                System.out.println("[2]number");
                choice2 = input.nextInt();
                
                if(choice2== 1)
                   {
                	check=r.registeration(choice2);
                	
                   }
                else if(choice2==2)
                {
                	String cont = new String();
                	check=r.registeration(choice2);
                	smsnotifi.phoneRegister(check,cont);
                	
                }
                break;
        	}
        	case 2:
        	{
        		Login_User l = new Login_User();
        	        l.login();
        		break;
        	}
        	case 3:
        	{
        		book b = new book();
                    b.flightBook();
        	}
            case 4 :
            {
                System.out.println("EXIT");
        		break;
            }
        	}
        	}while(choice1!=4);
            
            }   
    	}
    	
    	
    	
    
}