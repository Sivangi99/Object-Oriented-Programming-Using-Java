//This is a program to convert temperature from celsius to fahrenheit and vice-versa
class Convert
{
	double c=100.0,f=100.0,convf,convc,convc2;
	void conv()
	{
		convf=c*9/5+32;
		convc=(5.0/9)*(f-32);
		convc2=(5*(f-32))/9;
		System.out.println("Temperature in celsius = "+c+ ",Converted value in fahrenheit = "+convf );
		System.out.println("Temperature in fahrenheit = "+f+ ",Converted value in celsius = "+convc);
		System.out.println("Temperature in fahrenheit = "+f+ ",Converted value in celsius = "+convc2);
	}//End of method conv
}//End of class Convert
class ConvertMain
{
	public static void main(String []args)
	{
		Convert obj= new Convert();//object creation of class Convert
		obj.conv();//method conv of class Convert is invoked here
	}//End of method main
}//End of class ConvertMain
