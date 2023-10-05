import java.util.*;

public class lab37
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Enter string : ");
      String s=sc.next();
      String new_str="";
      int n=s.length();
      
      for(int i=0;i<n;i++)
      {
        char ch=s.charAt(i);
        new_str=ch+new_str;
      }
      System.out.println("Reversed string : "+ new_str);
   }
}
