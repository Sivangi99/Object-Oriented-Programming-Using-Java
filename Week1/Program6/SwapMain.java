//This is a program to swap two numbers without using third variable
class Swap
{
	int a=5,b=8;
	void swap()
	{
		System.out.println("Before Swapping a= "+a+", b= "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping a= "+a+", b= "+b);
	}//End of method swap
}//End of class Swap
class SwapMain
{
	public static void main(String []args)
	{
		Swap obj= new Swap();//object creation of class Swap
		obj.swap();//method swap of class Swap is invoked here
	}//End of method main
}//End of class SwapMain

