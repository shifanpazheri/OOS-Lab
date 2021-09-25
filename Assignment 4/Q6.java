import java.util.Scanner;

class Employee
{
  String employeeId;
  String employeeName;
  int salary;

  Employee(String employeeId,String employeeName)
  {
    this.employeeId=employeeId;
    this.employeeName=employeeName;
  }

  public int calculateSalary()
  {
    return salary;
  }

  public static void printAllSalary(Employee []a,int n)
  {
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i].calculateSalary());
    }
  }

  public int getBasicPay()
  {
    return 0;
  }

  public int getHourlyWages()
  {
    return 0;
  }

  public int getHoursWorked()
  {
    return 0;
  }

  public static void searchEmployee(Employee []a,int n,String searchEmployeeId)
  {
    int flag=0;
    for(int i=0;i<n;i++)
    {
      if(a[i].employeeId.equals(searchEmployeeId))
      {
        flag=1;
        System.out.print(a[i].employeeId+" ");
        System.out.print(a[i].employeeName+" ");
        System.out.println(a[i].calculateSalary());
      }
    }
    if(flag==0)
      System.out.println(-1);
  }

}


class PermanentEmployee extends Employee
{
  int basicPay;
  int pfAmount;

  public PermanentEmployee(String employeeId,String employeeName,int basicPay)
  {
    super(employeeId,employeeName);
    this.salary=calculateSalary();
    this.basicPay=basicPay;
    this.pfAmount=(int)(basicPay*12/100);
  }

  public int calculateSalary()
  {
    return basicPay-pfAmount;
  }

  public int getBasicPay()
  {
    return basicPay;
  }

}


class TemporaryEmployee extends Employee
{
  int hourlyWages;
  int hoursWorked;

  public TemporaryEmployee(String employeeId,String employeeName,int hourlyWages,int hoursWorked)
  {
    super(employeeId,employeeName);
    this.salary=calculateSalary();
    this.hourlyWages=hourlyWages;
    this.hoursWorked=hoursWorked;
  }

  public int calculateSalary()
  {
    return hourlyWages*hoursWorked;
  }

  public int getHourlyWages()
  {
    return hourlyWages;
  }

  public int getHoursWorked()
  {
    return hoursWorked;
  }

}

public class Q6
{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    Employee []a= new Employee[n];
    for(int i=0;i<n;i++)
    {
      int type=input.nextInt();
      String employeeId=input.next();
      String employeeName=input.next();
      if(type==1)
      {
        int basicPay=input.nextInt();
        a[i]=new PermanentEmployee(employeeId,employeeName,basicPay);
        //System.out.println("basicPay"+a[i].getBasicPay());//-> we need to give a function in superclass tooo..
      }
      else if(type==2)
      {
        int hourlyWages=input.nextInt();
        int hoursWorked=input.nextInt();
        a[i]=new TemporaryEmployee(employeeId,employeeName,hourlyWages,hoursWorked);
        //System.out.println("hourlyWages"+a[i].getHourlyWages());//-> we need to give a function in superclass tooo..
      }
      //System.out.println(a[i].calculateSalary());
    }
    //Employee.printAllSalary(a,n);
    String searchEmployeeId=input.next();
    Employee.searchEmployee(a,n,searchEmployeeId);
  }
}
