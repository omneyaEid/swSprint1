package swproject;
import java.util.regex.Pattern;
public class Email 
{
    public  boolean isEmail(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$";                   
        Pattern p = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return p.matcher(email).matches(); 
    } 
}
