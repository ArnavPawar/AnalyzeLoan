import java.text.DecimalFormat;
import java.util.*;
public class Payment
{
   double payment;
   double principle;
   double annualrate;
   double newbalance;
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
        newbalance=principle+interest-payment;
            
        System.out.println("Month"+ "  Principle" + "   Interest" + "  Payment" + "   newbalance");//sets up the columns
        DecimalFormat df = new DecimalFormat("$0.00");        
        while(newbalance>payment)
        {   
            System.out.format("%-6s %-11s %-9s %-9s %-9s%n",months,df.format(principle),df.format(interest),df.format(payment), df.format(newbalance));//new format
           
            //System.out.println(months+"   "+df.format(principle)+"     "+df.format(interest)+"     "+df.format(monthlyrate)+"     "+df.format(newbalance)+"    ");
            interest=principle*monthlyrate;
            newbalance=principle+interest-payment;
            months++;
            principle=newbalance;
            totalinterest+=interest;     
        }          
        interest = principle* monthlyrate;
        newbalance = principle + interest - payment;
         if (0 > newbalance) {
         System.out.format("%-6s %-11s %-9s %-9s %-9s%n",months,df.format(principle),df.format(interest),df.format(payment), df.format(0.00));
            
        }
        
       
        
        
        System.out.println(df.format(totalinterest)+" will now be your total interest");//finds the total interest
     }
}

