package swproject;
import java.util.ArrayList;

public class EmailNotify {
	
	static ArrayList<String>email_register=new ArrayList<String>();
	static ArrayList<String>email_confirm=new ArrayList<String>();
	static ArrayList<String>email_passwardforget=new ArrayList<String>();

	static ArrayList<String>email_passwardchange=new ArrayList<String>();
	
	public static void initialize () {

    	String defaltRegist="you registered successfully on our website";
    	String defaltConfirm="your book is confirmed successfully";
    	String defaltChangePassword="your Password is Changed successfully";
    	String defaltForgetPassword="you forget your password I will show you your password";
    	email_register.add(defaltRegist);
    	email_confirm.add(defaltConfirm);
    	email_passwardforget.add(defaltForgetPassword);
    	email_passwardchange.add(defaltChangePassword);
	}
	
	public static void emailRegister(String email,String cont)
	{
		if(email.isEmpty())
		{
			if(cont.isEmpty())
			{
				System.out.println("you didn't enter any content");
			}
			else
			{
				email_register.add(cont);
			}
		}
		else
		{
			System.out.println("your phone number is "+email+" "+email_register.get(email_register.size()-1));
		}
	}
	public static void emailconfirm(String email,String cont,String book)
	{
		if(email.isEmpty())
		{
			if(cont.isEmpty())
			{
				System.out.println("you didn't enter any content");
			}
			else
			{
				email_confirm.add(cont);
			}
		}
		else
		{
			System.out.println("your phone number is "+email+" "+email_confirm.get(email_confirm.size()-1)+"your book is "+book);
		}
	
	}
	public static void emailchangepassward1(String email,String cont,String passward)
	{
		if(email.isEmpty())
		{
			if(cont.isEmpty())
			{
				System.out.println("you didn't enter any content");
			}
			else
			{
				email_passwardchange.add(cont);
			}
		}
		else
		{
			System.out.println("your phone number is "+email+" "+email_passwardchange.get(email_passwardchange.size()-1)+"your password is "+passward);
		}

	}
	public static void emailforgetpassward(String email,String cont,String passward)
	{
	if(email.isEmpty())
	 {
		if(cont.isEmpty())
		{
			System.out.println("you didn't enter any content");
		}
		else
		{
			email_passwardforget.add(cont);
		}
	}
	else
	{
		System.out.println("your phone number is "+email+" "+email_passwardforget.get(email_passwardforget.size()-1)+"your password is "+passward);
	}
	
	}
	public static void main(String[] args) {
        // TODO code application logic here
		System.out.println("kk");
		EmailNotify M =new EmailNotify();
		//M.emailRegister("JKKKJKJKJ");
	}
	
	
}