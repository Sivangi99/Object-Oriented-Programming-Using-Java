//1.Program to define a class Item containing code and price.Accept this data for five objects using array of objects.Display code ,price in tabular form and also display total price of all items.
import java.util.Scanner;
class Item
{
	 int price,code;
	Item(int code,int price)
	{
		this.code=code;
		this.price=price;
	}
	public void display()
	{
		System.out.println(code+"\t"+price);
	}
}

class ItemMain
{
	public static void main(String args[])
	{
		int p,c,total=0;
		Scanner sc=new Scanner(System.in);
		Item ob[]=new Item[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Code");
			c=sc.nextInt();
			System.out.println("Enter Price");
			p=sc.nextInt();
			ob[i]=new Item(c,p);
			total=total+ob[i].price;
		}
		System.out.println("Code\tPrice");
		for(int i=0;i<5;i++)
			ob[i].display();
		System.out.println("Total Price= "+total);
	}
}
			
	