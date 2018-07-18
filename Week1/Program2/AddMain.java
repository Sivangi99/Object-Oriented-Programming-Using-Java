//This is a program to add two numbers 
class Add
{
	int a=2,b=3,c;
	void sum()
	{
		c=a+b;
		System.out.println("The sum of  "+a+" and "+b+" is "+c);
	}//End of method sum
}//End of class Add

class AddMain
{
	public static void main(String []args)
	{
		Add obj=new Add();//Object creation of class Add
		obj.sum();//Method sum of class Add is invoked here
	}//End of method main
}//End of class AddMain