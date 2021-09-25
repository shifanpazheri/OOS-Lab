import java.util.Scanner;

class Car
{
    String modelName;
    String engineNo;
    float basePrice;
    float additionalCharge;

    public Car(String modelName,String engineNo,float basePrice,float additionalCharge)
    {
        this.modelName=modelName;
        this.engineNo=engineNo;
        this.basePrice=basePrice;
        this.additionalCharge=additionalCharge;
    }

    public float totalPrice()
    {
		return basePrice+additionalCharge;
	}
}

class Dealer
{
    String dealerName;
    float discountPercentage;
    Car vechile;

    public Dealer(String dealerName,float discountPercentage,Car vechile)
    {
        this.dealerName=dealerName;
        this.discountPercentage=discountPercentage;
        this.vechile=vechile;
    }

    static void printAll(Dealer []a,int n)
    {
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i].dealerName+" ");
			System.out.print(a[i].discountPercentage+" ");
			System.out.print(a[i].vechile.modelName+" ");
			System.out.print(a[i].vechile.engineNo+" ");
			System.out.print(a[i].vechile.basePrice+" ");
			System.out.println(a[i].vechile.additionalCharge);
		}
	}

	public float onRoadPrice()
	{
		return vechile.totalPrice()*(100-discountPercentage)/100;
	}

	public static void printWithDiscount(Dealer []a,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i].vechile.modelName+" ");
			float price=a[i].vechile.totalPrice();
			System.out.printf("%.0f ",price);
			float onRoad=a[i].onRoadPrice();
			System.out.printf("%.0f\n",onRoad);
		}
	}
}


public class Q5
{
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Dealer []a=new Dealer[n];
        for(int i=0;i<n;i++)
        {
            String modelName=input.next();
            String engineNo=input.next();
            float basePrice=input.nextFloat();
            float additionalCharge=input.nextFloat();
            String dealerName=input.next();
            float discountPercentage=input.nextFloat();
            Car vechile=new Car(modelName,engineNo,basePrice,additionalCharge);
            a[i]=new Dealer(dealerName,discountPercentage,vechile);
        }
        //Dealer.printAll(a,n);
        Dealer.printWithDiscount(a,n);
    }
}
