package swproject;

import java.util.ArrayList;
import java.util.Scanner;

public class SMSNotify {

	public static ArrayList<String>sms_register=new ArrayList<String>();
	public static ArrayList<String>sms_confirm=new ArrayList<String>();
    public static ArrayList<String>sms_ForgetPassword=new ArrayList<String>();
    public static ArrayList<String>sms_changePassword=new ArrayList<String>();
    public static void intializphones()
    {
    	String defaltRegist="you registered successfully on our website";
    	String defaltConfirm="your book is confirmed successfully";
    	String defaltChangePassword="your Password is Changed successfully";
    	String defaltForgetPassword="you forget your password I will show you your password";
    	sms_register.add(defaltRegist);
    	sms_confirm.add(defaltConfirm);
    	sms_ForgetPassword.add(defaltForgetPassword);
    	sms_changePassword.add(defaltChangePassword);
    }
    
	public static void phoneRegister(String phone,String cont)
	{
		if(phone.isEmpty())
		{
			if(cont.isEmpty())
			{
				System.out.println("you didn't enter any content");
			}
			else
			{
				sms_register.add(cont);
			}
		}
		else
		{
			System.out.println("your phone number is "+phone+" "+sms_register.get(sms_register.size()-1));
		}
	}
	public static void phoneConfirm(String phone,String cont,String book)
	{
		if(phone.isEmpty())
		{
			if(cont.isEmpty())
			{
				System.out.println("you didn't enter any content");
			}
			else
			{
				sms_confirm.add(cont);
			}
		}
		else
		{
			System.out.println("your phone number is "+phone+" "+sms_confirm.get(sms_confirm.size()-1)+"your book is "+book);
		}
	}
	public static void phoneChangePassword(String phone,String cont,String password)
	{
		if(phone.isEmpty())
		{
			if(cont.isEmpty())
			{
				System.out.println("you didn't enter any content");
			}
			else
			{
				sms_changePassword.add(cont);
			}
		}
		else
		{
			System.out.println("your phone number is "+phone+" "+sms_changePassword.get(sms_changePassword.size()-1)+"your password is "+password);
		}
	}
	
	public static void phoneForgetPassword(String phone,String cont,String passward)
	{
		if(phone.isEmpty())
		{
			if(cont.isEmpty())
			{
				System.out.println("you didn't enter any content");
			}
			else
			{
				sms_ForgetPassword.add(cont);
			}
		}
		else
		{
			System.out.println("your phone number is "+phone+" "+sms_ForgetPassword.get(sms_ForgetPassword.size()-1)+"your password is "+passward);
		}
	}

	public static void main(String[] args) {
        // TODO code application logic here
		intializphones();
		String phone=new String();
		String cont = new String();
	    Scanner input=new Scanner (System.in);
		cont = input.nextLine();
		phoneRegister(phone,cont);
	}
}