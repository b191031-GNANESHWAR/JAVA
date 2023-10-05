import java.util.*;

public class lab31
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Enter 2 strings : ");
      String str1=sc.next();
      String str2=sc.next();
      
      if(str1.compareTo(str2)==0)
        System.out.println("Equal");
      else
        System.out.println("Not Equal");
   }
}
