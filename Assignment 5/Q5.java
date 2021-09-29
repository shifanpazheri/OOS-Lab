import java.util.Scanner;

abstract class Student
{
  String name;
  String roll;
  public abstract int getFeeDetails();
  public abstract void setFeeDetails(int fee);
  public static void printAll(Student []a,int n)
  {
    for(int i=0;i<n;i++)
    {
      System.out.print(a[i].name);
      System.out.print(a[i].roll);
      System.out.println(a[i].getFeeDetails());
    }
  }
  public static void search(Student []a,int n,String searchRoll)
  {
    for(int i=0;i<n;i++)
    {
      if(a[i].roll.equals(searchRoll))
      {
        System.out.println(a[i].getFeeDetails());
        break;
      }
    }
  }
}

class Undergraduate extends Student
{
  int fee;
  Undergraduate(String name,String roll,int fee)
  {
    this.name=name;
    this.roll=roll;
    this.fee=fee;
  }
  public int getFeeDetails()
  {
    return fee;
  }
  public void setFeeDetails(int fee)
  {
    this.fee=fee;
  }
}

class Postgraduate extends Student
{
  int fee;
  Postgraduate(String name,String roll,int fee)
  {
    this.name=name;
    this.roll=roll;
    this.fee=fee;
  }
  public int getFeeDetails()
  {
    return fee;
  }
  public void setFeeDetails(int fee)
  {
    this.fee=fee;
  }
}

public class Q5
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
    int ugFee=input.nextInt(),pgFee=input.nextInt();
    int n=input.nextInt();
    Student []a=new Student[n];
    for(int i=0;i<n;i++)
    {
      String name=input.next();
      String roll=input.next();
      String dept=input.next();
      if(dept.equals("UG"))
      {
        a[i]=new Undergraduate(name,roll,ugFee);
      }
      else
      {
        a[i]=new Postgraduate(name,roll,pgFee);
      }
    }
    //Student.printAll(a,n);
    String searchRoll=input.next();
    Student.search(a,n,searchRoll);
  }
}
