import java.util.Scanner;

interface ShapeArea
{
  public int area(int r);
}

class Circle implements ShapeArea
{
  public int area(int r)
  {
    return (int)(3.14*r*r);
  }
}

class Square implements ShapeArea
{
  public int area(int r)
  {
    return r*r;
  }
}

public class Q3
{
  public static void main(String []args)
  {
    Scanner input=new Scanner(System.in);
    String shape=input.next();
    if(shape.equals("Circle"))
    {
      ShapeArea shapeof=new Circle();
      int r=input.nextInt();
      System.out.println(shapeof.area(r));
    }
    if(shape.equals("Square"))
    {
      ShapeArea shapeof=new Square();
      int r=input.nextInt();
      System.out.println(shapeof.area(r));
    }
  }
}
