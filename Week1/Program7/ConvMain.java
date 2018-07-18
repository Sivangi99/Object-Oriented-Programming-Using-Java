//This is a program to convert miles to kilometers 
class Conv
{
	double m=10,km;
	void cal()
	{
		km=m*1.60934;
		System.out.println("Distance in miles = "+m+",Corresponding value in kilometers= "+km);
	}//End of method cal
}//End of class conv
class ConvMain
{
	public static void main(String []args)
	{
		Conv obj=new Conv();
		obj.cal();
	}//End of method main
}//End of class ConvMain 