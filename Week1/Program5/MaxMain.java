//This is a program to find maximum of three numbers.
class Max
{
	int a=2,b=6,c=4,max;
	void calc()
	{
		max=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("The maximum of "+a+","+b+" and "+c+" is "+max);
	}//End of method calc
}//End of class Max
class MaxMain
{
	public static void main(String []args)
	{
		Max obj=new Max();
		obj.calc();
	}
}