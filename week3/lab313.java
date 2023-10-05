import java.util.*;

public class lab313
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter no.of trials :");
      int n=sc.nextInt();
      
      Random rand = new Random();
      int success_count=0;
      while(n-->0)
      {
         int rand1 = rand.nextInt(6)+1;
         int rand2 = rand.nextInt(6)+1;
         
         if(rand1==rand2) 
         {
           System.out.println(rand1+"  "+rand2);
           success_count++;
         }
     }
     System.out.println("Successful attempts: "+success_count);
   }
} 
