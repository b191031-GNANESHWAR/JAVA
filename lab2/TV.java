public class TV{
   
    public int channel,volume;
    public boolean on;
    
    public void TV()
    {
      this.channel=0;
      this.volume=0;
      this.on=false;
    }
    
    public void turnOn()
    {
      this.on=true;
      System.out.println("TV : ON");
    }
    public void turnOff()
    {
      this.on=false;
      System.out.println("TV : OFF");
    }
    
    public void setChannel(int newch)
    {
      this.channel=newch;
      System.out.println("Channel :"+channel);
    }
    public void setVolume(int newvol)
    {
      this.volume=newvol;
      System.out.println("Volume :"+volume);
    }
    
    public void channelUp()
    {
      this.channel++;
      System.out.println("Channel :"+channel);
    }
    public void channelDown()
    {
      this.channel--;
      System.out.println("Channel :"+channel);
    }
    
    public void volumeUp()
    {
      this.volume++;
      System.out.println("Volume :"+volume);
    }
    public void volumeDown()
    {
      this.volume--;
      System.out.println("Volume :"+volume);
    }
    
    public static void main(String args[])
    {
       TV remote=new TV();
       
       remote.turnOn();
       remote.setChannel(20);
       remote.setVolume(10);
       remote.channelUp();
       remote.channelDown();
       remote.volumeUp();
       remote.volumeDown();
       
       remote.setChannel(15);
       remote.volumeDown();
    }
}
    
