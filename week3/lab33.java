import java.util.*;

public class lab33
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Enter any text: ");
      String text=sc.next();
      
      System.out.print("Enter alpha to find freq: ");
      char ch=sc.next().charAt(0);
      
      int index = text.indexOf(ch);
      int count=0;
      while(index !=-1)
      {
        count++;
        index = text.indexOf(ch, index+1);
      }
      System.out.println("Freq: "+count);
   }
}
