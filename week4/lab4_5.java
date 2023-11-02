import  java.util.*;

class Account
{
  public double Acct_Bal;
  
  public Account(double min_bal)
  {
    if(min_bal>1000.0)
      Acct_Bal=min_bal;
  }
  
  public String Bank_Name;
  public String Branch_Name;
  public String Acct_Name;
  public int Acct_No;
  public double Acct_Bal;
  public String Acct_Address;
  
  void credit(double amt)
  {
    Acct_Bal+=amt;
    System.out.println("Amount Credited Successfully");
  }
  
  void debit(double amt)
  {
    if(amt>Acct_Bal)
      System.out.println("Debit amount exceeded account balance");
    else
      Acct_Bal-=amt;
  }
  
  double getBalance()
  {
    return Acct_Bal;
  }
  
  boolean exit()
  {
    return true;
  }
}

class lab4_5
{
  public static void main(String args[])
  {
     HashMap<String,Integer> SBI;
     Scanner sc=new Scanner(System.in);
     
     Account acc1=new Account(1100.0);
     acc1.Bank_Name="SBI";
     acc1.Branch_Name="Basar";
     acc1.Acct_No=12345671;
     acc1.Acct_Address="Mudole";
     SBI.put(acc1.Branch_Name,acc1.Acct_No);
     
     Account acc2=new Account(2200.0);
     acc2.Bank_Name="SBI";
     acc2.Branch_Name="Basar";
     acc2.Acct_No=12345672;
     acc2.Acct_Address="Bidrelli";
     SBI.put(acc2.Branch_Name,acc2.Acct_No);
     
     Account acc3=new Account(5000.0);
     acc3.Bank_Name="SBI";
     acc3.Branch_Name="NZB";
     acc3.Acct_No=12345673;
     acc3.Acct_Address="Jankampet";
     SBI.put(acc3.Branch_Name,acc3.Acct_No);
     
     Account acc4=new Account(7000.0);
     acc4.Bank_Name="SBI";
     acc4.Branch_Name="NZB";
     acc4.Acct_No=12345674;
     acc4.Acct_Address="NZB";
     SBI.put(acc4.Branch_Name,acc4.Acct_No);
     
     
     
     while(true)
     {
       System.out.print("Enter username: ");
       String username=sc.next();
       
       System.out.print("Enter password: ");
       int password=sc.nextInt();
       
       
       
