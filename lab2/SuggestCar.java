import java.util.*;

class Car 
{
    public String company;
    public double mileage;
    public double speed;
    public String color;

   
    public Car(String company, double mileage, double speed, String color)
    {
        this.company = company;
        this.mileage = mileage;
        this.speed = speed;
        this.color = color;
    }

 
    public String getCompany() {
        return company;
    }

    public double getMileage() {
        return mileage;
    }

    public double getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }
}


public class SuggestCar
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
         
        Car car1 = new Car("Toyota", 30.0, 65.0, "Silver");
        Car car2 = new Car("Honda", 35.0, 60.0, "Blue");
        Car car3 = new Car("Ford", 25.0, 70.0, "Red");
        
        double mileage,speed;
        System.out.print("Enter your preferred mileage & speed : ");
        mileage=sc.nextDouble();
        speed=sc.nextDouble();
       
        if (car1.getMileage() >= mileage && car1.getSpeed() >= speed)
            System.out.println("Suggested Car : "+car1.getCompany());
            
        else if (car2.getMileage() >= mileage && car2.getSpeed() >= speed)
            System.out.println("Suggested Car : "+car2.getCompany());
            
        else if (car3.getMileage() >= mileage && car3.getSpeed() >= speed)
            System.out.println("Suggested Car : "+car3.getCompany());
            
        else
            System.out.println("No Car found with ur preferences!");
    }
}
