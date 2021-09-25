import java.util.Scanner;

class Person
{
  String personName;
  int age;
}

class Student extends Person
{
  String rollNumber;
  int percentageOfMarks;
}

class PGStudent extends Student
{
  String elective;
  int numberOfSubjects;

  PGStudent(String personName,int age,String elective,int percentageOfMarks)
  {
    this.personName=personName;
    this.age=age;
    this.elective=elective;
    this.percentageOfMarks=percentageOfMarks;
  }

  public static void printDesc(PGStudent []a,int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i].percentageOfMarks<a[j].percentageOfMarks)
        {
          PGStudent temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }

    for(int i=0;i<n;i++)
    {
      System.out.println(a[i].personName);
    }
  }

}

public class Q7
{
  public static void main(String args[])
  {
    Scanner input= new Scanner(System.in);

    int n=input.nextInt();
    PGStudent []a=new PGStudent[n];
    input.nextLine();

    for(int i=0;i<n;i++)
    {
      String personName="";
      String age="";
      String elective="";
      String percentageOfMarks="";
      int value=0;
      String data=input.nextLine();
      for(int j=0;j<data.length();j++)
      {
        if(value==0&&data.charAt(j)!=':'&&data.charAt(j)!=' ')
          personName=personName+data.charAt(j);
        if(value==1&&data.charAt(j)!=':'&&data.charAt(j)!=' ')
          age=age+data.charAt(j);
        if(value==2&&data.charAt(j)!=':'&&data.charAt(j)!=' ')
          elective=elective+data.charAt(j);
        if(value==3&&data.charAt(j)!=':'&&data.charAt(j)!=' ')
          percentageOfMarks=percentageOfMarks+data.charAt(j);
        if(data.charAt(j)==':')
          value++;
      }
      a[i] =new PGStudent(personName,Integer.parseInt(age),elective,Integer.parseInt(percentageOfMarks));
    }
    PGStudent.printDesc(a,n);
  }
}
