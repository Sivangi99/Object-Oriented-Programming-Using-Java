//This is a program to display whether a number is odd or even
class Display
{
	int n=5;
	void disp()
	{
		if(n%2==0)
		System.out.println("The number "+n+" is even");
		else
		System.out.println("The number "+n+" is odd");
	}//End of method disp
}//End of class Display
class DisplayMain
{
	public static void main(String []args)
	{
		Display obj=new Display();
		obj.disp();
	}//End of method main
}//End of class DisplayMain
 
