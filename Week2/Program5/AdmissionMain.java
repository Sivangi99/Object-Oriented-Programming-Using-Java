import java.util.Scanner;
class Admission
{
	
	void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for Maths \n");
		int m=sc.nextInt();
		System.out.println("Enter marks for Physics \n");
		int p=sc.nextInt();
		System.out.println("Enter marks for Chemistry \n");
		int c=sc.nextInt();
		int total=m+p+c;
		int total_mp=m+p;
		if(m>=60&&p>=50&&c>=40&&total>=200||total_mp>=150)
				System.out.println(" Eligible");
		else
				System.out.println("Not eligible");
		

		
		
	}
}

class AdmissionMain
{
	public static void main(String []args)
	{
		Admission ob=new Admission();
		ob.calc();
	}
}