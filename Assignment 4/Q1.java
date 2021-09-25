import java.io.*;
import java.lang.*;
import java.util.Scanner;

class bitwise
{
    static int and(int a,int b,int c)
    {
        int ans=(a&b)&c;
        return ans;
    }
    static int and(int a,int b)
    {
        int ans=(a&b);
        return ans;
    }
}


public class Q1
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String data=input.nextLine();
        Scanner newline=new Scanner(data);
        int a=newline.nextInt();
        int b=newline.nextInt();
        int c;
        if(newline.hasNextInt())
        {
            c=newline.nextInt();
            System.out.println(bitwise.and(a,b,c));
        }
        else
        {
            System.out.println(bitwise.and(a,b));
        }
    }
    
}
