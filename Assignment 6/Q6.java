import java.util.Scanner;

interface Borrowable
{
  public  void checkin(Book []library,int n,String id,String user);
  public  void checkOut(Book []library,int n,String id);
}

class Book implements Borrowable
{

  String bookID;
  String title;
  String author;
  String catagory;
  String status;
  String borrowedUser;

  Book(String bookID,String title,String author,String catagory)
  {
    this.bookID=bookID;
    this.title=title;
    this.author=author;
    this.catagory=catagory;
    this.status="Available";
    this.borrowedUser="";
  }

  public void display(Book []library,int n)
  {
    for(int i=0;i<n;i++)
    {
      if(library[i].catagory.equals("TextBook"))
      {
        if(library[i].status.equals("Available"))
        {
            System.out.println(library[i].catagory+": "+library[i].bookID+": "+library[i].title+": "+library[i].author+": "+library[i].status);
        }
        else
        {
            System.out.println(library[i].catagory+": "+library[i].bookID+": "+library[i].title+": "+library[i].author+": Borrowed by "+library[i].borrowedUser);
        }
      }
      else
      {
        System.out.println(library[i].catagory+": "+library[i].bookID+": "+library[i].title+": "+library[i].author);
      }
    }
  }

  public  void checkin(Book []library,int n,String id,String user)
  {
    for(int i=0;i<n;i++)
    {
      if(id.equals(library[i].bookID))
      {
        if(library[i].catagory.equals("ReferenceBook"))
        {
          System.out.println("Cannot be borrowed");
          break;
        }
        library[i].status="Borrowed";
        library[i].borrowedUser=user;
        break;
      }
    }
  }

  public void checkOut(Book []library,int n,String id)
  {
    for(int i=0;i<n;i++)
    {
      if(id.equals(library[i].bookID))
      {
        if(library[i].catagory.equals("ReferenceBook"))
        {
          System.out.println("Invalid");
          break;
        }
        library[i].status="Available";
        library[i].borrowedUser="";
        break;
      }
    }
  }

}


public class Q6
{
  public static void main(String []args)
  {
    Scanner input=new Scanner(System.in);
    Book []library=new Book[99999];
    int noOfBooks=0;

    while(true)
    {
      System.out.print("Enter your choice: ");
      String choice=input.nextLine();
      if(choice.equals("1"))
      {
        System.out.println("Enter ID, Title and Author (Line by line)");
        String bookID=input.nextLine();
        String title=input.nextLine();
        String author=input.nextLine();
        String catagory="ReferenceBook";
        library[noOfBooks++]=new Book(bookID,title,author,catagory);
      }
      if(choice.equals("2"))
      {
        System.out.println("Enter ID, Title and Author (Line by line)");
        String bookID=input.nextLine();
        String title=input.nextLine();
        String author=input.nextLine();
        String catagory="TextBook";
        library[noOfBooks++]=new Book(bookID,title,author,catagory);
      }
      if(choice.equals("3"))
      {
        System.out.print("Enter Book ID:");
        String id=input.nextLine();
        System.out.print("Enter Username: ");
        String user=input.nextLine();
        library[0].checkin(library,noOfBooks,id,user);
      }
      if(choice.equals("4"))
      {
        System.out.print("Enter Book ID:");
        String id=input.nextLine();
        library[0].checkOut(library,noOfBooks,id);
      }
      if(choice.equals("5"))
      {
        library[0].display(library,noOfBooks);
      }
      if(choice.equals("6"))
      {
        break;
      }
    }
  }
}
