package swproject;

import java.util.ArrayList;
import java.util.Scanner;

interface Notification 
{
    void creat(String type);
	void read(String type);
    void update(String type);
    void delete(String type); 
}

public class NotificationImp implements Notification
{
	Scanner input = new Scanner(System.in);
   String language;
   String subject;
   int userID;
   static int notificationID=0;
   EmailNotify mailnotify=new EmailNotify();
   SMSNotify smsnotify=new SMSNotify();
   ArrayList<String>subjects=new ArrayList<String>();
   ArrayList<String>languages=new ArrayList<String>();
   ArrayList<Integer>notificationIDS=new ArrayList<Integer>();
   public NotificationImp()
   {
	   languages.add("English");
   }
    public NotificationImp(String language, String subject, int userID, int notificationID) {
        this.language = language;
        this.subject = subject;
        this.userID = userID;
        this.notificationID = notificationID;
    }
    public void setLanguage(String language) {
    	
        this.language = language;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public String getLanguage() {
        return language;
    }

    public String getSubject() {
        return subject;
    }

    public int getUserID() {
        return userID;
    }

    public int getNotificationID() {
        return notificationID;
    }
	public void creat(String type) {
		
		notificationID++;
		setNotificationID(notificationID);
		System.out.print("Enter your language : ");
		String lang = input.next();
		languages.add(lang);
		smsnotify.intializphones();
		mailnotify.initialize();
		System.out.println("Enter your Subject : ");
		System.out.println("[1] regist");
		System.out.println("[2] confirm book");
		System.out.println("[3] forget password");
		System.out.println("[4] change password");
		String k = new String();
		int sub = input.nextInt();
		if(sub==1)
		{
			 k="regist";
				if(type=="email")
				{
					String email =new String();
					//email="gh";
					System.out.println("enter your content");
					String cont = new String();
					cont=input.next();
					mailnotify.emailRegister(email, cont);
				}
				else if(type=="phone")
				{
					String phoneOrMail =new String();
					System.out.println("enter your content");
					String cont = new String();
					cont=input.next();
					smsnotify.phoneRegister(phoneOrMail, cont);
				}
		}
		else if(sub==2)
		{
			 k="Confirm booking";
			 if(type=="email")
				{
					String phoneOrMail =new String();
					System.out.println("enter your content");
					String cont = new String();
					cont=input.nextLine();
					String book="Flight 1";
					mailnotify.emailconfirm(phoneOrMail, cont, book);
				}
				else if(type=="phone")
				{
					String phoneOrMail =new String();
					System.out.println("enter your content");
					String cont = new String();
					cont=input.next();
					String book="Flight 1";
					smsnotify.phoneConfirm(phoneOrMail, cont,book);
				}
		}
		else if(sub==3)
		{
			k="forget passward";
			 if(type=="email")
				{
					String phoneOrMail =new String();
					System.out.println("enter your content");
					String cont = new String();
					cont=input.next();
					String pass="qwerty7896";
					mailnotify.emailforgetpassward(phoneOrMail, cont, pass);
				}
				else if(type=="phone")
				{
					String phoneOrMail =new String();
					System.out.println("enter your content");
					String cont = new String();
					cont=input.next();
					String pass="qwerty7896";
					smsnotify.phoneForgetPassword(phoneOrMail, cont,pass);
				}
			
		}
		else if (sub==4)
		{
			k="change passward";
			if(type=="email")
			{
				String phoneOrMail =new String();
				System.out.println("enter your content");
				String cont = new String();
				cont=input.next();
				String pass="qwerty7896";
				mailnotify.emailchangepassward1(phoneOrMail, cont, pass);
			}
			else if(type=="phone")
			{
				String phoneOrMail =new String();
				System.out.println("enter your content");
				String cont = new String();
				cont=input.next();
				String pass="qwerty7896";
				smsnotify.phoneChangePassword(phoneOrMail, cont,pass);
			}
		}
		subjects.add(k);
		notificationIDS.add(notificationID);		
	}
	@Override
	public void read(String type) {
		// TODO Auto-generated method stub

		System.out.println("[1] read notification of register");
		System.out.println("[2] read notification of change password");
		System.out.println("[3] read notification of forget password");
		System.out.println("[4] read confirm booking");
		int choice = input.nextInt();
		
		if(type=="email")
		{
			String cont = new String();
			
			switch(choice)
			{
			case 1:
			{
				if(mailnotify.email_register.isEmpty())
				{
					System.out.println("Array list is empty");
					return;
				}
				String email="norhan@gmail.com";
				mailnotify.emailRegister(email, cont);
				
				break;
			}
			case 2:
			{
				if(mailnotify.email_passwardchange.isEmpty())
				{
					System.out.println("Array list is empty");
					return;
				}
				String email="norhan@gmail.com";
				String pass="koopiuyhg856";
				mailnotify.emailchangepassward1(email, cont, pass);
				break;
			}
			case 3:
			{
				if(mailnotify.email_passwardforget.isEmpty())
				{
					System.out.println("Array list is empty");
					return;
				}
				String email="norhan@gmail.com";
				String pass="koopiuyhg856";
				mailnotify.emailforgetpassward(email, cont, pass);
				break;
			}
			case 4:
			{
				if(mailnotify.email_confirm.isEmpty())
				{
					System.out.println("Array list is empty");
					return;
				}
				String email="norhan@gmail.com";
				String book="Flight 1";
				mailnotify.emailconfirm(email, cont, book);
				break;
			}
			default:
			{
				System.out.println("you entered wrong choice");
				break;
			}
		}
		}
		else if(type=="phone")
		{			
			String cont = new String();
			switch(choice)
			{
			case 1:
			{
				if(smsnotify.sms_register.isEmpty())
				{
					System.out.println("it's empty");
					return;
				}
				String phone="01234567891";
				smsnotify.phoneRegister(phone,cont);
				break;
			}
			case 2:
			{
				if(smsnotify.sms_changePassword.isEmpty())
				{
					System.out.println("it's empty");
					return;
				}
				String phone="01234567891";
				String pass="koopiuyhg856";
				smsnotify.phoneChangePassword(phone,cont,pass);
				break;
			}
			case 3:
			{
				if(smsnotify.sms_ForgetPassword.isEmpty())
				{
					System.out.println("it's empty");
					return;
				}
				String phone="01234567891";
				String pass="koopiuyhg856";
				smsnotify.phoneForgetPassword(phone, cont, pass);
				break;
			}
			case 4:
			{
				if(smsnotify.sms_confirm.isEmpty())
				{
					System.out.println("it's empty");
					return;
				}
				String phone="01234567891";
				String book="Flight 1";
				smsnotify.phoneConfirm(phone, cont, book);
				break;
			}
			default:
			{
				System.out.println("you entered wrong choice");
				break;
			}
			}
		}
		System.out.println("your subject" +subjects.get(subjects.size()-1));
		System.out.println("your language" +languages.get(languages.size()-1));
	}
	@Override
	public void update(String type) {
		// TODO Auto-generated method stub
		System.out.println("[1] update notification of register");
		System.out.println("[2] update notification of change password");
		System.out.println("[3] update notification of forget password");
		System.out.println("[4] update confirm booking");
		int ind=0;
		int choice = input.nextInt();
		if(type=="email")
		{
			System.out.println("Enter the index that you want to change");
			 ind = input.nextInt();
			if(ind>notificationID||ind<0)
			{
				System.out.println("out of range");
				return;
			}
			switch(choice)
			{
			case 1:
			{
				System.out.println("enter what your content");
				String cont = new String();
				cont = input.next();
				mailnotify.email_register.remove(ind);
				mailnotify.email_register.add(ind,cont);
				
				
				break;
			}
			case 2:
			{
		    System.out.println("enter what you want");
			String cont = new String();
			cont = input.next();
			mailnotify.email_passwardchange.remove(ind);
			mailnotify.email_passwardchange.add(ind,cont);
			
			
			
			
				break;
			}
			case 3:
			{
				System.out.println("enter what you want");
				String cont = new String();
				cont = input.next();

				mailnotify.email_passwardforget.remove(ind);
				mailnotify.email_passwardforget.add(ind,cont);
				
				
				
				break;
			}
			case 4:
			{
				System.out.println("enter what you want");
				String cont = new String();
				cont = input.next();
				mailnotify.email_confirm.remove(ind);
				mailnotify.email_confirm.add(ind,cont);
				
				break;
			}
			}
			
		}
		else if(type=="phone")
		{
			
			System.out.println("Enter the index that you want to change");
			 ind = input.nextInt();
			if(ind>notificationID||ind<0)
			{
				System.out.println("out of range");
				return;
			}
			switch(choice)
			{
			case 1:
			{
				System.out.println("enter what your content");
				String cont = new String();
				cont = input.next();
				smsnotify.sms_register.remove(ind);
				smsnotify.sms_register.add(ind,cont);
				
				break;
			}
			case 2:
			{
		    System.out.println("enter what you want");
			String cont = new String();
			cont = input.next();
			smsnotify.sms_changePassword.remove(ind);
			smsnotify.sms_changePassword.add(ind,cont);
			
				break;
			}
			case 3:
			{
				System.out.println("enter what you want");
				String cont = new String();
				cont = input.next();
				smsnotify.sms_ForgetPassword.remove(ind);
				smsnotify.sms_ForgetPassword.add(ind,cont);
				
				break;
			}
			case 4:
			{
				System.out.println("enter what you want");
				String cont = new String();
				cont = input.next();
				smsnotify.sms_confirm.remove(ind);
				smsnotify.sms_confirm.add(ind,cont);			
				break;
			}
			}
			
		}
		System.out.println("enter what your subject");
		String subj = new String();
		subj = input.next();
		subjects.add(ind,subj);
		System.out.println("enter what your language");
		String lang = new String();
		lang = input.next();
		languages.add(ind,lang);
		
		
	}
	@Override
	public void delete(String type) {
		// TODO Auto-generated method stub
		System.out.println("[1] delete notification of register");
		System.out.println("[2] delete notification of change password");
		System.out.println("[3] delete notification of forget password");
		System.out.println("[4] delete confirm booking");
		
		int choice = input.nextInt();
		if(type=="email")
		{
			System.out.println("Enter the index that you want to delete");
			int ind = input.nextInt();
			//System.out.println(notificationID);
			if(ind>notificationID&&ind<0)
			{
				System.out.println("out of range");
				return;
			}
			switch(choice)
			{
			case 1:
			{
				
				mailnotify.email_register.remove(ind);
				break;
			}
			case 2:
			{
				mailnotify.email_passwardchange.remove(ind);
			
				break;
			}
			case 3:
			{
				mailnotify.email_passwardforget.remove(ind);
				break;
			}
			case 4:
			{
				mailnotify.email_confirm.remove(ind);
				
				break;
			}
			}
		}
		else if(type=="phone")
		{
			
			System.out.println("Enter the index that you want to change");
			int ind = input.nextInt();
			
			//System.out.println(notificationID);
			if(ind>notificationID||ind<0)
			{
				System.out.println("out of range");
				return;
			}
			
			switch(choice)
			{
			case 1:
			{
				smsnotify.sms_register.remove(ind);
				
				break;
			}
			case 2:
			{
				smsnotify.sms_changePassword.remove(ind);
			
				break;
			}
			case 3:
			{
				smsnotify.sms_ForgetPassword.remove(ind);
				break;
			}
			case 4:
			{
				smsnotify.sms_confirm.remove(ind);
				
				break;
			}
			}
			}
		
		
	}

    public static void main(String[] args) {
        // TODO code application logic here
    	NotificationImp no= new NotificationImp();
    	no.smsnotify.intializphones();
    	no.mailnotify.initialize();
    	no.update("phone");
    	
    }
	  
}