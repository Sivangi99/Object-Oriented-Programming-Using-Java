import java.util.Scanner;
class Root
{
	
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a , b and c of the equation  \n");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		if(b<a||b<c)
			System.out.println("Roots are imaginary");
		else{
		double x1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		double x2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("The roots are "+x1+","+x2);
		}

		
	}
}

class RootMain
{
	public static void main(String []args)
	{
		Root ob=new Root();
		ob.calc();
	}
}