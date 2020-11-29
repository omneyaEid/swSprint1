package swproject;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class book
{
    int flightID;
    Scanner input = new Scanner (System.in);
     public static ArrayList<Integer>flight_ID= new  ArrayList<>();
     
     public void flightBook ()
     {
         out.println("Enter flight ID you want");
         flightID= input.nextInt();
         flight_ID.add(flightID);
         //notify you are book flightID
          out.println("you booked in flight " + flightID);  
     }
}