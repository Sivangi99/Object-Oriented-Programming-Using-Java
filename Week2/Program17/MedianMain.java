import java.util.Scanner;
class Median
{
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		int n,arr[],median;
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements ");
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		if(n%2!=0)
			median=arr[(n)/2];//For n=odd , Median = (n+1)/2th obseravtion.Since array index starts from 0 here we have n/2
		else
			median=arr[((n-1)/2)+1];//For n=even,Median =(n/2 +1)th observation.Since array index starts from 0 here we have( (n-1)/2+1)
		System.out.println("The Median is "+median);
	}
}
class MedianMain
{
	public static void main(String args[])
	{
		Median ob=new Median();
		ob.calc();
	}
}			