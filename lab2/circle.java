import java.util.*;

class Circle
{
  public int radius;
  
  public Circle(int radius)
  {
    this.radius=radius;
  }
  
  void getArea()
  {
    System.out.println("Area : "+Math.PI*radius*radius);
  }
  
  void getPerimeter()
  {
    System.out.println("Perimeter : "+2*Math.PI*radius);
  }

}

public class circle
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      
      Circle obj1=new Circle(5);
      obj1.getArea();
      obj1.getPerimeter();
      
      Circle obj2=new Circle(10);
      obj2.getArea();
      obj2.getPerimeter();
      
      Circle obj3=new Circle(15);
      obj3.getArea();
      obj3.getPerimeter();
   }
}
        

