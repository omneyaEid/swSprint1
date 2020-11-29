package swproject;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;
public class register 
{
    public register() {}
    Scanner input = new Scanner (System.in);
    private static String phone;
    private static String mail;
    private static String password;
    Email e = new Email();
    SMS s = new SMS();
    static int i=0;
    public SMSNotify smsnotifi= new SMSNotify();
    public static ArrayList<String>mailorphone= new  ArrayList<>();
    public static ArrayList<String>pass= new  ArrayList<>();
    public int check_password(String password)
{
	 boolean hasLetter = false;
        boolean hasDigit = false;
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char x = password.charAt(i);
                if (Character.isLetter(x)) {
                    hasLetter = true;
                }
                else if (Character.isDigit(x)) {
                    hasDigit = true;
                }
                if(hasLetter && hasDigit){
                    break;
                }
            }
            if (hasLetter && hasDigit) {
                System.out.println("STRONG");
                return 1;
                }
            else {
                System.out.println("NOT STRONG");
                return 0;
                }
            }       
        else {
            System.out.println("HAVE AT LEAST 8 CHARACTERS");
            return 0;
          }
    }   
    public String registeration(int choice1)
    {
        //int choice1;
        String choice2 = null;
       // do
        //{
         /* System.out.println("[1]email");
          System.out.println("[2]number");
         choice1 =input.nextInt();
         */
           if(choice1 ==1)
           {
            int check;
            String mail;
            do
            {
                out.println("Please enter your email");
                 mail =input.next();
               
            if(e.isEmail(mail) == false)
            {
                out.println("Enter valid mail");
            }
            else {mailorphone.add(i,mail);break;}
            }while(e.isEmail(mail) == false);
            do {
            out.println("enter your password");
            String password = input.next();
            
            check = check_password(password);
            pass.add(i,password);
            }while(check==0);
                   
                   out.println("you regester with mail ");
                  //notify register with email 
                   return mail;
           }
           if(choice1 ==2)
           {
        	   String phone; 
             do
            {
                out.println("Please enter your phone number");
                 phone =input.next();
                
            if(s.isNumber(phone) == false)
            {
                out.println("Enter valid phone number");
            }
            else {mailorphone.add(i,phone);break;}
            }while(s.isNumber(phone) == false);
             int check;
             
            do {
                
            out.println("enter your password");
            String password = input.next();
            check = check_password(password);
            pass.add(i,password);
            }while(check==0);
                   
                   out.println("you regester with Phone number ");
                  //notify register with phone number  
                  // System.out.println(phone);
                   /*smsnotifi.intializphones();
                   String cont = new String();
                   smsnotifi.phoneRegister(phone,cont);*/
                   return phone;
        }
       // out.println("Do you want to continue(yes/no)");
         //    choice2 = input.next();
             if("yes".equals(choice2)){i++;}
       // }while("yes".equals(choice2));      
			return "";
    }
     public void print_users()
	{
		if(mailorphone.isEmpty()&&pass.isEmpty())
		{
			System.out.println("there are no users\n");
		}
		else {
		for(int j=0;j<mailorphone.size();j++)
		{
			out.println(mailorphone.get(j)+" "+pass.get(j));
                      
		}
		}
	}
}