//2.Program to define class Tender containing data members cost and company name.Accept data for five objects and display company name for which cost is minimum.
import java.io.*;
class Tender
{
	 int cost;
	String company_name;
	Tender(int cost,String company_name)
	{
		this.cost=cost;
		this.company_name=company_name;
	}
	public void display()
	{
		System.out.println(company_name);
	}
}

class TenderMain
{
	public static void main(String args[])throws IOException
	{
		int c,min=999999,pos=0;
		String name;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Tender ob[]=new Tender[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Cost");
			c=Integer.parseInt(br.readLine());
			System.out.println("Enter Company Name");
			name=br.readLine();
			ob[i]=new Tender(c,name);
			
		}
		for(int i=0;i<5;i++)
		{
			if(ob[i].cost<min)
			{
				min=ob[i].cost;
				pos=i;
			}
		}
		System.out.print("Company with minimum cost is ");
		ob[pos].display();
		
	}
}
			
	