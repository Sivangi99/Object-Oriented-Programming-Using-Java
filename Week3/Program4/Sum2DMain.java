import java.util.Scanner;
class Sum2D
{
	void calc()
	{
		int a[][],b[][],r,c,sum[][];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		r=sc.nextInt();
		c=sc.nextInt();
		a=new int[r][c];
		b=new int[r][c];
		sum=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element for 1st matrix");
				a[i][j]=sc.nextInt();
				System.out.println("Enter element for 2nd matrix");
				b[i][j]=sc.nextInt();
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("The resultant sum matrix is ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
		System.out.println();
		}
	}
}
class Sum2DMain
{
	public static void main(String args[])
	{
		Sum2D ob=new Sum2D();
		ob.calc();
	}
}
