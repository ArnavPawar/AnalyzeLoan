/**
 * Arnav Pawar
 */
import java.text.DecimalFormat;
import java.util.*;
public class Payment
{
   double payment;
   double principle;
   double annualrate;
   double newbalence;
   double monthlyrate;   
   double interest;
  
   
   
    public void questions()
    //prints questions
    {
        Scanner console = new Scanner(System.in);
        System.out.print("What is your principle ");
        principle= console.nextDouble();
        System.out.print("What is your annual interest rate ");
        annualrate= console.nextDouble();
        System.out.print("What is your Monthly Payment ");
        payment= console.nextDouble();       
    }
    public void analysis()
     {//prints the data for the question
        questions();
        
        double totalinterest = 0;
        int months=1;
        monthlyrate=annualrate/1200;
        
        interest=principle*monthlyrate;
        newbalence =principle+interest-payment;
            
        System.out.println("Month"+ "  Principle" + "   Interest" + "  Payment" + "   NewBalence");//sets up the collums
        DecimalFormat df = new DecimalFormat("$0.00");        
        while(newbalence>payment)
        {   
            System.out.format("%-6s %-11s %-9s %-9s %-9s%n",months,df.format(principle),df.format(interest),df.format(payment), df.format(newbalence));//new format
           
            //System.out.println(months+"   "+df.format(principle)+"     "+df.format(interest)+"     "+df.format(monthlyrate)+"     "+df.format(newbalence)+"    ");
            interest=principle*monthlyrate;
            newbalence =principle+interest-payment;
            months++;
            principle=newbalence;
            totalinterest+=interest;     
        }          
        interest = principle * monthlyrate;
        newbalence = principle + interest - payment;
         if (0 > newbalence) {
         System.out.format("%-6s %-11s %-9s %-9s %-9s%n",months,df.format(principle),df.format(interest),df.format(payment), df.format(0.00));
            
        }
        
       
        
        
        System.out.println(df.format(totalinterest)+" will now be your total intrest");//finds the total intrest
     }
}