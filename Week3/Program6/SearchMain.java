import java.util.Scanner;
class Search
{
	void search()
	{
		int a[],size,flag=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		size=sc.nextInt();
		a=new int[size];
		for( i=0;i<size;i++)
		{
			System.out.println("Enter an element");
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the element to be searched ");
		int n=sc.nextInt();
		for( i=0;i<size;i++)
		{
			if(a[i]==n)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		System.out.println("Element found at position "+(i+1));
		else
		System.out.println("Not found");
		
	}
}
class SearchMain
{
	public static void main(String args[])
	{
		Search ob=new Search();
		ob.search();
	}
}
