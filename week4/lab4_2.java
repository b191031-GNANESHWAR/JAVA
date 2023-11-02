import java.util.*;

class Person
{
   public String name;
   public String address;
   
   
   String getName()
   {
     return name;
   }
   String getAddress()
   {
     return address;
   }
   void setAddress(String address)
   {
     address=address;
   }
}

class Student extends Person
{
   List<String> courses=new ArrayList<>();
   List<Integer> grades=new ArrayList<>();
   
   public Student(String name,String address)
   {
     this.name=name;
     this.address=address;
   }
   
   public void addCourseGrade(String course,int grade)
   {
     if(this.courses.size()==30)
       System.out.println("Can't be added");
       
     else{
     this.courses.add(course);
     this.grades.add(grade);
     System.out.println("added Successfully");
     }
   }
   
   public void printGrades()
   {
     for(int i=0;i<this.grades.size();i++)
       System.out.println(this.grades.get(i));
   }
   
   public double getAverageGrade()
   {
     int sum=0;
     for(int i=0;i<this.grades.size();i++)
       sum+=this.grades.get(i);
       
     double avg=(sum/this.grades.size());
     return avg;
   }
}

class Teacher extends Person
{
   List<String> courses=new ArrayList<>();
   
   Teacher(String name,String address)
   {
     this.name=name;
     this.address=address;
   }
   
   boolean addCourse(String course)
   {
      for(int i=0;i<this.courses.size();i++)
      {
        if(this.courses.get(i)==course)
          return false;
      }
      this.courses.add(course);
      return true;
   }
   
   boolean removeCourse(String course)
   {
      for(int i=0;i<this.courses.size();i++)
      {
        if(this.courses.get(i)==course)
        {
          this.courses.remove(i);
          return true;
        }
      }
      return false;
   }
}

class lab4_2
{
  public static void main(String args[])
  {
    Student stu=new Student("Hari","Hyd");
    stu.addCourseGrade("OOP",9);
    stu.addCourseGrade("FLAT",8);
    stu.printGrades();
    stu.getAverageGrade();
    
    Teacher tch=new Teacher("Santhosh","Mdk");
    if(tch.addCourse("FLAT")==true)
      System.out.println("Course added Succsfully");
    else
      System.out.println("Course can't be added");
      
    if(tch.removeCourse("OOP")==true)
      System.out.println("Course removed Succsfully");
    else
      System.out.println("Course doesn't exist");
  }
}
   
   
