package swproject;

import static java.lang.System.out;
import java.util.Scanner;
public class Login_User 
{
    Scanner input = new Scanner (System.in);
    register reg = new register();
    public void login()
    {
        String mail;
        String phone;
        boolean done=false;
        out.println("how do you want to log in");
        out.println("[1]mail");
        out.println("[2]phone number");
      
       int morp = input.nextInt();
       if(morp == 1){
           String password = null ;
            out.println("Enter your mail");
            mail = input.next();  
            
            out.println("[1]Enter your password");
            out.println("[2]forget your password");
            int choice = input.nextInt();
            switch(choice)
    		{
    		  case 1 :
                      {
                        out.println("Enter your password");
                         password = input.next();
                        int s = reg.mailorphone.size();
                        
                        out.println(s);
                        for (int y=0;y<s;y++)
                        {                      
                            String m = reg.mailorphone.get(y);
                            String p = reg.pass.get(y);
                        	if(m.contains(mail) && p.contains(password))
                        	{
                                    out.println("you are logged in now");
                        		 done=true;	
                        	}
                        }
                        if(done==false)
                        {
                        	System.out.println("Mail or Password are wrong ,Try again if you want");
                        }
                        break;
                      }
                      case 2 :
                      {
                         int s = reg.mailorphone.size();
                          for (int y=0;y<s;y++)
                        {
                           String m = reg.mailorphone.get(y);
                           
                            if(m.equals(mail))
                            {
                                int x = reg.mailorphone.indexOf(m);
                                 String p = reg.pass.get(x);
                                 out.println("your password is" + p);
                            }	
                        }                        
                      }
             }   
            
        } 
        
       else if (morp ==2)
       {
           String password = null;
    	   out.println("Enter your phone");
           phone = input.next(); 
           
           out.println("[1]Enter your password");
           out.println("[2]forget your password");
           int choice = input.nextInt();
           switch(choice)
   		   { 
   		      case 1 :
                     {
                       out.println("Enter your password");
                        password = input.next();
                        int s = reg.mailorphone.size();
                        
                        out.println(s);
                        for (int y=0;y<s;y++)
                        {
                           // out.println("you are in for loop");
                            String m = reg.mailorphone.get(y);
                            String p = reg.pass.get(y);
                        	if(m.contains(phone) && p.contains(password))
                        	{
                                    out.println("you are logged in now");
                        		 done=true;	
                        	}
                        }
                        if(done==false)
                        {
                        	System.out.println("phone or Password are wrong ,Try again if you want");
                        }
                        break;
                      }
                      case 2 :
                      {
                         //notify forget password
                          int s = reg.mailorphone.size();
                          for (int y=0;y<s;y++)
                        {
                           String m = reg.mailorphone.get(y);
                           
                            if(m.equals(phone))
                            {
                                int x = reg.mailorphone.indexOf(m);
                                 String p = reg.pass.get(x);
                                 out.println("your password is" + p);
                            }
                           
                            
                        	
                        }
                          
                         
                      }
             }   
            
        } 
    }
}