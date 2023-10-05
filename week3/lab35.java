import java.util.*;

public class lab35
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Enter string : ");
      String s=sc.next();
      
      int n=s.length(),vowelCount=0;
      
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
        {
           System.out.print(s.charAt(i)+" ");
           vowelCount++;
        }
     }
     
     System.out.println("\nNo of vowels : "+vowelCount);
     System.out.println("No of consonants: "+(n-vowelCount));
   }
}
