import java.util.Scanner;

class Student
{
    String name;
    int rollno;
    int height;

    Student(String name,int rollno,int height)
    {
        this.name=name;
        this.rollno=rollno;
        this.height=height;
    }

    static void printAll(Student []a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i].name+" ");
            System.out.print(a[i].rollno+" ");
            System.out.println(a[i].height);
        }
    }

    static void sort(Student []a,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i].height==a[j].height&&a[i].name.compareTo(a[j].name)>0)
                {
                    Student temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                if(a[i].height>a[j].height)
                {
                    Student temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    static void findKStudents(Student []a,int n)
    {
        int count=0;
        if(n>=1)
            count++;

        for(int i=1;i<n;i++)
        {
            if(a[i].height!=a[i-1].height&&a[i].height!=a[n-1].height)
            {
                count++;
            }

        }

        for(int i=n-1;i>=1;i--)
        {
            if(a[i].height!=a[i-1].height)
            {
                count++;
                break;
            }
        }

        System.out.println(count);

        if(n>=1)
            System.out.print(a[0].name+",");

        for(int i=1;i<n;i++)
        {
            if(a[i].height!=a[i-1].height&&a[i].height!=a[n-1].height)
            {
                System.out.print(a[i].name+",");
            }

        }

        for(int i=n-1;i>=1;i--)
        {
            if(a[i].height!=a[i-1].height)
            {
                System.out.println(a[i].name);
                break;
            }
        }
    }
}

public class Q3
{
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Student []a=new Student[n];
        input.nextLine();
        for(int i=0;i<n;i++)
        {
            String data=input.nextLine();
            String name="";
            String rollno="";
            String height="";
            int val=-1;
            for(int j=0;j<data.length();j++)
            {
                if(val==0&&data.charAt(j)!=','&&data.charAt(j)!=')')
                {
                    name=name+data.charAt(j);
                }
                if(val==1&&data.charAt(j)!=','&&data.charAt(j)!=')')
                {
                    rollno=rollno+data.charAt(j);
                }
                if(val==2&&data.charAt(j)!=','&&data.charAt(j)!=')')
                {
                    height=height+data.charAt(j);
                }
                if(data.charAt(j)=='(')
                {
                    val=0;
                }
                if(data.charAt(j)==',')
                {
                    val++;
                }
            }
            /*System.out.println("name"+name);
            System.out.println("rollno"+rollno);
            System.out.println("height"+height);*/
            a[i]=new Student(name,Integer.parseInt(rollno),Integer.parseInt(height));
        }
        Student.sort(a,n);
        Student.findKStudents(a,n);
        //Student.printAll(a,n);
    }
}
