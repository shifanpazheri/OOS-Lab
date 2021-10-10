import java.util.Scanner;
import java.util.Arrays;

interface OrderStudents
{
  public  void OrderByRollno(Student []stud,int n);
  public  void OrderByName(Student []stud,int n);
}

class Student implements OrderStudents
{
  String name;
  int rollno;
  String address;

  Student(String name,int rollno,String address)
  {
    this.name=name;
    this.rollno=rollno;
    this.address=address;
  }

  static void display(Student []stud,int n)
  {
    for(int i=0;i<n;i++)
    {
      System.out.print(stud[i].rollno+" ");
      System.out.print(stud[i].name+" ");
      System.out.println(stud[i].address);
    }
  }

    public  void OrderByName(Student []stud,int n)
    {
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(stud[i].name.compareTo(stud[j].name)>0)
          {
            Student temp=stud[i];
            stud[i]=stud[j];
            stud[j]=temp;
          }
        }
      }
    }


    public  void OrderByRollno(Student []stud,int n)
    {
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(stud[i].rollno>stud[j].rollno)
          {
            Student temp=stud[i];
            stud[i]=stud[j];
            stud[j]=temp;
          }
        }
      }
    }

}

public class Q5
{
  public static void main(String []args)
  {
    Scanner input =new Scanner(System.in);
    int n=input.nextInt();
    Student []stud=new Student[n];

    for(int i=0;i<n;i++)
    {
      int rollno=input.nextInt();
      String name=input.next();
      String address=input.next();

      stud[i]=new Student(name,rollno,address);
    }
    System.out.printf("//Sorted by Rollno\n");
    stud[0].OrderByRollno(stud,n);
    Student.display(stud,n);
    System.out.printf("\n//Sorted by Name\n");
    stud[0].OrderByName(stud,n);
    Student.display(stud,n);
  }
}
