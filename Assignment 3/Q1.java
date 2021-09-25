import java.util.Scanner;

class ReverseMain
{
	static void reverseList(Node head,int dummy)
	{
		dummy++;
		if(head.next!=null)
			reverseList(head.next,dummy+1);
		//dummy--;
		if(dummy!=1)
			System.out.print(head.data+"->");
		else
			System.out.print(head.data);
	}
}

class Node
{
	char data;
    Node next;
    
    Node(char value)
    {
		this.data=value;
		this.next=null;
	}
	
	static void insert(Node head,char value)
	{
		Node temp=new Node(value);
		while(head.next!=null)
		{
			head=head.next;
		}
		head.next=temp;
	}
	
	static void reverseprint(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	static void print(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
}

public class Q1
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of nodes:");
		int n=input.nextInt();
		//System.out.println("");
		System.out.print("Enter the data in Node1 :");
		char c=input.next().charAt(0);
		//System.out.println("");
		Node head=new Node(c);
		
		for(int i=0;i<n-1;i++)
		{
			System.out.print("Enter the data in Node1 :");
			c=input.next().charAt(0);
			//System.out.println("");
			Node.insert(head,c);
		}
		
		/*Node.insert(head,'b');
		Node.insert(head,'c');
		Node.insert(head,'d');
		Node.insert(head,'e');*/
		//System.out.println(head->data);
		//Node.print(head);
		System.out.println("The reversed list is:");
		ReverseMain.reverseList(head,0);
	}
}
