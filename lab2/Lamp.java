import java.util.*;

public class Lamp
{
    boolean cond;
    String type;
    
    public Lamp(String str,boolean state)
    {
        this.type=str;
        this.cond=state;
    }
    
    void turnOff()
    {
        if(cond==true)
          System.out.println("prev_status: ON");
        else
          System.out.println("prev_status: OFF");
        this.cond=false;
        System.out.println("curr_status: OFF");
    }
    
    void turnOn()
    {
        if(cond==true)
          System.out.println("prev_status: ON");
        else
          System.out.println("prev_status: OFF");

        this.cond=true;
        System.out.println("curr_status: ON");
    }
    
    
    public static void main(String args[]){
        Lamp led=new Lamp("led",false);
        Lamp  halogen=new Lamp("halogen",false);
         
        led.turnOn();
        halogen.turnOn();
        led.turnOff();
        halogen.turnOff();

    }
}
