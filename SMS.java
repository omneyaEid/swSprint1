package swproject;
public class SMS 
{
    public boolean isNumber(String number)        
    {
         char ch1 = number.charAt(0);
          char ch2 = number.charAt(1);
        if(number.length()==11 && ch1=='0' && ch2=='1')
        {   
            return true;
        }
        else
        {
            return false;
        }
        
    }

    
}
