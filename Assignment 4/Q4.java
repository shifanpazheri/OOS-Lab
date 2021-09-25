import java.util.Scanner;

class Customer
{
    String customerName;
    String accountNo;
    int currentBalance;
    
    public Customer(String customerName,String accountNo,int currentBalance)
    {
        this.customerName=customerName;
        this.accountNo=accountNo;
        this.currentBalance=currentBalance;
    }
    
    public void availableBalance()
    {
        System.out.print(this.customerName+":");
        System.out.println(this.currentBalance);
    }
}

class Membership extends Customer
{
    String type;

    public Membership(String customerName,String accountNo,int currentBalance)
    {
        super(customerName, accountNo,currentBalance);
       /* this.customerName=customerName;
        this.accountNo=accountNo;
        this.currentBalance=currentBalance;*/
        if(currentBalance<100000)
        {
            this.type="SilverMembership";
        }
        else if(currentBalance>=100000&&(currentBalance<1000000))
        {
            this.type="GoldMembership";
        }
        else
        {
            this.type="PlatinumMembership";
        }
    }
    
    static void printAll(Customer []a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i].customerName+" ");
            System.out.print(a[i].accountNo+" ");
            System.out.println(a[i].currentBalance);
        }
    }
    
    public static String findtype(Customer val)
    {
        if(val.currentBalance<100000)
        {
            return "Silver";
        }
        else if(val.currentBalance>=100000&&(val.currentBalance<1000000))
        {
            return "Gold";
        }
        else
        {
            return "Platinum";
        }
    }
    
    public static int findAmount(Customer val)
    {
        if(val.currentBalance<100000)
        {
            return val.currentBalance*105/100;
        }
        else if(val.currentBalance>=100000&&(val.currentBalance<1000000))
        {
            return val.currentBalance*110/100;
        }
        else
        {
            return val.currentBalance*115/100;
        }
    }
    
    public void availableBalance()
    {
        System.out.print(this.customerName+":");
        System.out.print(this.currentBalance+":");
        System.out.print(Membership.findtype(this)+":");
        System.out.println(Membership.findAmount(this));
    }
    
    static void printMembership(Customer []a,int n)
    {
        for(int i=0;i<n;i++)
        {
            a[i].availableBalance();
        }
    }
}

public class Q4
{
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Customer []a= new Membership[n];
        input.nextLine();
        for(int i=0;i<n;i++)
        {
            String data=input.nextLine();
            String customerName="";
            String accountNo="";
            String currentBalance="";
            int value=0;
            /*System.out.println(data);
            System.out.println(data.length());*/
            for(int j=0;j<data.length();j++)
            {
                if(value==0&&data.charAt(j)!=':')
                    customerName=customerName+data.charAt(j);
                if(value==1&&data.charAt(j)!=':')
                    accountNo=accountNo+data.charAt(j);
                if(value==2&&data.charAt(j)!=':')
                    currentBalance=currentBalance+data.charAt(j);
                if(data.charAt(j)==':')
                    value++;
            }
            /*System.out.print(customerName+" ");
            System.out.print(accountNo+" ");
            System.out.print(currentBalance+" ");*/
            int amount=Integer.parseInt(currentBalance);
            a[i]=new Membership(customerName,accountNo,amount);
        }
        //Membership.printAll(a,n);
        Membership.printMembership(a,n);
    }
}
