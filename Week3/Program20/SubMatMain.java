import java.util.Scanner;
class SubMat
{
	void sub()
	{
		int a[][],b[][],sub[][],r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		r=sc.nextInt();
		c=sc.nextInt();
		a=new int[r][c];
		b=new int[r][c];
		sub=new int[r][c];

		for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
		{	System.out.println("Enter an element for Array1");
			a[i][j]=sc.nextInt();
		}
		}
		for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
		{	System.out.println("Enter an element for Array2");
			b[i][j]=sc.nextInt();
		}
		}
		for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
		{	
			sub[i][j]=a[i][j]-b[i][j];
		}
		}

		System.out.println("The Resultant Matrix after subtraction is ");
		for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
		{	
		
				System.out.print(sub[i][j]+" ");
		}
				System.out.println();
		}
		
	}
}
class SubMatMain
{
	public static void main(String args[])
	{
		SubMat ob=new SubMat();
		ob.sub();
	}
}
