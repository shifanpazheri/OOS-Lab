import java.util.Scanner;

interface SortVotes
{
  public void ascendDisplay();
  public void descendDisplay();
}

class ElectionPost implements SortVotes
{
  String nameOfthePost;
  int n;
  String []listOfCandidates;
  int [] voteCount;
  int m;
  String []votesEntered;

  ElectionPost(String nameOfthePost)
  {
    this.nameOfthePost=nameOfthePost;
  }

  public void initList(int n)
  {
    listOfCandidates=new String[n];
    voteCount=new int[n];
    this.n=n;
  }

  public void initVotes(int m)
  {
    votesEntered=new String[m];
    this.m=m;
  }

  public void display()
  {
    System.out.println(nameOfthePost);
    String []temp=new String[n];

    for(int i=0;i<n;i++)
    {
      temp[i]=listOfCandidates[i];
    }

    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(temp[i].compareTo(temp[j])>0)
        {
          String swapVar=temp[i];
          temp[i]=temp[j];
          temp[j]=swapVar;
        }
      }
    }

    for(int i=0;i<n;i++)
    {
      System.out.println(temp[i]);
    }
  }

  public void displayVote()
  {
    for(int i=0;i<n;i++)
    {
      System.out.println(listOfCandidates[i]+" "+voteCount[i]);
    }
  }

  public void ascendDisplay()
  {
    String []temp=new String[n];
    int []tempCount=new int[n];

    for(int i=0;i<n;i++)
    {
      temp[i]=listOfCandidates[i];
      tempCount[i]=voteCount[i];
    }

    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(tempCount[i]>tempCount[j])
        {
          String swapVar=temp[i];
          temp[i]=temp[j];
          temp[j]=swapVar;
          int swapVarCount=tempCount[i];
          tempCount[i]=tempCount[j];
          tempCount[j]=swapVarCount;
        }
      }
    }

    for(int i=0;i<n;i++)
    {
      System.out.println(temp[i]+" - "+tempCount[i]);
    }
  }

  public void descendDisplay()
  {
    String []temp=new String[n];
    int []tempCount=new int[n];

    for(int i=0;i<n;i++)
    {
      temp[i]=listOfCandidates[i];
      tempCount[i]=voteCount[i];
    }

    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(tempCount[i]<tempCount[j])
        {
          String swapVar=temp[i];
          temp[i]=temp[j];
          temp[j]=swapVar;
          int swapVarCount=tempCount[i];
          tempCount[i]=tempCount[j];
          tempCount[j]=swapVarCount;
        }
      }
    }

    for(int i=0;i<n;i++)
    {
      System.out.println(temp[i]+" - "+tempCount[i]);
    }
  }

}

public class Q4
{
  public static void main(String []args)
  {
    Scanner input =new Scanner(System.in);

    String pos=input.nextLine();
    ElectionPost election=new ElectionPost(pos);

    int n=input.nextInt();
    input.nextLine();
    election.initList(n);

    for(int i=0;i<n;i++)
    {
      String name=input.nextLine();
      election.listOfCandidates[i]=new String();
      election.listOfCandidates[i]=name;
      election.voteCount[i]=0;
    }

    election.display();

    int m=input.nextInt();
    input.nextLine();
    election.initVotes(m);

    for(int i=0;i<m;i++)
    {
      String name=input.nextLine();
      election.votesEntered[i]=new String();
      election.votesEntered[i]=name;
      for(int j=0;j<n;j++)
      {
        if(name.equals(election.listOfCandidates[j]))
        {
          election.voteCount[j]+=1;
        }
      }
    }

    //election.displayVote();
    election.ascendDisplay();
    election.descendDisplay();
  }
}
