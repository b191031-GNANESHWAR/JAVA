import java.util.*;

class Dog
{
   String name,breed,color,type;
   double height;
   
   public Dog(String name,String breed,String color,String type,double height)
   {
      this.name=name;
      this.breed=breed;
      this.color=color;
      this.type=type;
      this.height=height;
   }
   
   String getName()
   {
      return name;
   }
   
   String getBreed()
   {
      return breed;
   }
   
   String getColor()
   {
      return color;
   }
   
   String getType()
   {
     return type;
   }
   
   double getHeight()
   {
      return height;
   }
}


public class SuggestDog
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     
     Dog snoopy=new Dog("snoopy","pomerian","white","gaurd",1);
     Dog rocky=new Dog("rocky","lab","brown","sniffer",3);
     Dog snowy=new Dog("snowy","g.sheperd","black","sheperd",4);
     
     System.out.print("Choose any parameter :\n 1.breed\n 2.color\n 3.type\n 4.height\n Input: ");
     
     int choice=sc.nextInt();
     
     switch(choice)
     {
       case 1:
              System.out.print("Enter breed : ");
              String breed=sc.next();
              
              if(breed==snoopy.getBreed())
              {
                 System.out.println(snoopy.getName());
             
              }
              
              if(breed==rocky.getBreed())
              {
                 System.out.println(rocky.getName());
                
              }
                 
              if(breed==snowy.getBreed())
              {
                 System.out.println(snowy.getName());
                
              }
              break;
              
       case 2:
              System.out.print("Enter color : ");
              String color=sc.next();
              
              if(color==snoopy.getColor())
              {
                 System.out.println(snoopy.getName());
                
              }
              
              if(color==rocky.getColor())
              {
                 System.out.println(rocky.getName());
                
              }
                 
              if(color==snowy.getColor())
              {
                 System.out.println(snowy.getName());
                
              }
              break;
              
       case 3:
              System.out.print("Enter type : ");
              String type=sc.next();
              
              if(type==snoopy.getType())
              {
                 System.out.println(snoopy.getName());
                 ;
              }
              
              if(type==rocky.getType())
              {
                 System.out.println(rocky.getName());
                 
              }
                 
              if(type==snowy.getType())
              {
                 System.out.println(snowy.getName());
                
              }
              break;
              
       case 4:
              System.out.print("Enter height : ");
              double height=sc.nextDouble();
              
              if(height==snoopy.getHeight())
              {
                 System.out.println(snoopy.getName());
                
              }
              
              if(height==rocky.getHeight())
              {
                 System.out.println(rocky.getName());
                 
              }
                 
              if(height==snowy.getHeight())
              {
                 System.out.println(snowy.getName());
                 
              }
              break;
              
       default:
               System.out.println("Dog not found!");
     }
     
   }
}
     
     
     
