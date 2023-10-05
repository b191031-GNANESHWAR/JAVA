import java.util.*;

public class lab32
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Enter 2 strings : ");
      String str1=sc.next();
      String str2=sc.next();
      
      if(str1.equals(str2)==true)
        System.out.println("Equal");
      else
        System.out.println("Not Equal");
        
     if(str1.equalsIgnoreCase(str2)==true)
       System.out.println("Equal");
     else
        System.out.println("Not Equal");
   }
}
