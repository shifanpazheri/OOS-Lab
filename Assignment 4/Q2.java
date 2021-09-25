import java.io.*;
import java.lang.*;
import java.util.Scanner;

class shape
{
    static void area(double a,double b,double c)
    {
        double s=(a+b+c)/2;
        double ans=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print("Triangle:");
        System.out.printf("%.2f",ans);
    }
    static void area(double a,double b)
    {
        double ans=a*b;
        System.out.print("Rectangle:");
        System.out.printf("%.2f",ans);
    }
    static void area(double a)
    {
        double ans=3.14159*a*a;
        System.out.print("Circle:");
        System.out.printf("%.2f",ans);
    }
}


public class Q2
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String data=input.nextLine();
        Scanner newline=new Scanner(data);
        double a=newline.nextDouble();
        double b,c;
        if(newline.hasNextDouble())
        {
			b=newline.nextDouble();
			if(newline.hasNextDouble())
			{
				c=newline.nextDouble();
				shape.area(a,b,c);
			}
            else
            {
				shape.area(a,b);
			}
        }
        else
        {
            shape.area(a);
        }
    }
    
}

