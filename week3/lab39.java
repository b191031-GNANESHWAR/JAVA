import java.util.*;

public class lab39
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Enter string in lowercase: ");
      String s=sc.next();
      
      System.out.println("UpperCase:         "+ s.toUpperCase());
      System.out.println("Back To LowerCase: "+ s.toLowerCase());
   }
} 
