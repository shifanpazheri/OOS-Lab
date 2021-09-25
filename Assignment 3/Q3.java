import java.util.Scanner;
import java.util.*;

class DepartmentMeetingScheduler
{
	String meetingTitle;
	String meetingDate;
	String meetingStartTime; 
	String meetingEndTime;
	String meetingDescription;
	
	DepartmentMeetingScheduler(String meetingTitle,String meetingDate,String meetingStartTime,String meetingEndTime,String meetingDescription)
	{
		this.meetingTitle=meetingTitle;
		this.meetingDate=meetingDate;
		this.meetingStartTime=meetingStartTime; 
		this.meetingEndTime=meetingEndTime;
		this.meetingDescription=meetingDescription;
	}
	
	void print()
	{
		System.out.println("On "+this.meetingDate+",from "+this.meetingStartTime+" to "+this.meetingEndTime+" : "+this.meetingTitle+" : "+this.meetingDescription);
	}
	
	static boolean checkTime(String a,String b,String p,String q)
	{
		int aTime=Integer.parseInt(a.substring(0,2))*60+Integer.parseInt(a.substring(3,5));
		int bTime=Integer.parseInt(b.substring(0,2))*60+Integer.parseInt(b.substring(3,5));
		int pTime=Integer.parseInt(p.substring(0,2))*60+Integer.parseInt(p.substring(3,5));
		int qTime=Integer.parseInt(q.substring(0,2))*60+Integer.parseInt(q.substring(3,5));
		
		/*System.out.print("a - "+aTime+" ");
		System.out.print("b - "+bTime+" ");
		System.out.print("p - "+pTime+" ");
		System.out.print("q - "+qTime+" ");*/
		
		if(bTime<pTime||qTime<aTime)
		{
			return false;
		}
		return true;
	}
	
	static boolean search(ArrayList<DepartmentMeetingScheduler>task,int n,String meetingDate,String meetingStartTime,String meetingEndTime)
	{
		for(int i=0;i<n;i++)
		{
			if(task.get(i).meetingDate.equals(meetingDate))
			{
				if(DepartmentMeetingScheduler.checkTime(task.get(i).meetingStartTime,task.get(i).meetingEndTime,meetingStartTime,meetingEndTime))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	static void printAll(ArrayList<DepartmentMeetingScheduler> task,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("On "+task.get(i).meetingDate+",from "+task.get(i).meetingStartTime+" to "+task.get(i).meetingEndTime+" : "+task.get(i).meetingTitle+" : "+task.get(i).meetingDescription);
		}
	}
}

public class Q3
{
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		ArrayList<DepartmentMeetingScheduler> task= new ArrayList<DepartmentMeetingScheduler>(10000);
		int taskNo=0;
		
		//1. Schedule Meeting
        //2. List Meetings
		System.out.println("1. Schedule Meeting");
		System.out.println("2. List Meetings\n");
		
		while(true)
		{
			System.out.print("Enter your choice : ");
			int choice=input.nextInt();
			//System.out.println("");
			
			if(choice==3)
			{
				break;
			}
			if(choice==1)
			{
				System.out.print("Title - ");
			    String temp=input.nextLine();
				String meetingTitle=input.nextLine();
				System.out.print("Date - ");
				String meetingDate=input.next();
				System.out.print("Start time - ");
				String meetingStartTime=input.next(); 
				System.out.print("End time - ");
				String meetingEndTime=input.next();
				System.out.print("Description - ");
				temp=input.nextLine();
				String meetingDescription=input.nextLine();
				if(DepartmentMeetingScheduler.search(task,taskNo,meetingDate,meetingStartTime,meetingEndTime))	
				{
					DepartmentMeetingScheduler tempVar=new DepartmentMeetingScheduler(meetingTitle,meetingDate,meetingStartTime,meetingEndTime,meetingDescription);
					task.add(tempVar);
					System.out.println("Scheduled successfully\n");
					taskNo++;
					//task[taskNo-1].print();
					
				}
				else
				{
					System.out.println("Collision! Already another meeting is scheduled\n");
				}
			}
			if(choice==2)
			{
				DepartmentMeetingScheduler.printAll(task,taskNo);
			}
		}
	}
}

