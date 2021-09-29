import java.util.Scanner;

class Rectangle
{
  int lenght;
  int breadth;

  public Rectangle(int lenght,int breadth)
  {
    if(lenght>breadth)
    {
      this.lenght=lenght;
      this.breadth=breadth;
    }
    else
    {
      this.lenght=breadth;
      this.breadth=lenght;
    }
  }

  public int area()
  {
    return lenght*breadth;
  }

  public int perimeter()
  {
    return 2*(lenght+breadth);
  }

}

class Square extends Rectangle
{
  Square(int base)
  {
    super(base,base);
  }
}

public class Q3
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
    String data=input.nextLine();
    Scanner newLine=new Scanner(data);
    int x=newLine.nextInt();
    if(newLine.hasNextInt())
    {
      int y=newLine.nextInt();
      Rectangle rec=new Rectangle(x,y);
      System.out.println("Rectangle Perimeter "+rec.perimeter());
      System.out.println("Rectangle Area "+rec.area());
    }
    else
    {
      Square sqr=new Square(x);
      System.out.println("Square Perimeter "+sqr.perimeter());
      System.out.println("Square Area "+sqr.area());
    }
  }
}
