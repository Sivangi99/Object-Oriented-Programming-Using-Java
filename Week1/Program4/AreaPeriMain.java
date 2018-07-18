//This is a program to calculate Area and perimeter of various shapes
 class AreaPeri
{
	void area(int s)
	{
		int area=s*s;
		System.out.println("Area of square is "+area);
	}
	void area(double r)
	{
		double area = 3.14*r*r;
		System.out.println("Area of circle is "+area);
	}
	void area(int l,int b)
	{
		int area=l*b;
		System.out.println("Area of rectangle is "+area);
	}
	void area(int a,int b,int c)
	{
		double s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle is "+area);
	}

	void peri(int s)
	{
		int peri=4*s;
		System.out.println("Perimeter of square is "+peri);
	}
	void peri(double r)
	{
		double peri = 2*3.14*r;
		System.out.println("Perimeter of circle is "+peri);
	}
	void peri(int l,int b)
	{
		int peri=2*(l+b);
		System.out.println("perimeter of rectangle is "+peri);
	}
	void peri(int a,int b,int c)
	{
		System.out.println("Perimeter of triangle is "+(a+b+c));
	}
}//End of class AreaPeri
class AreaPeriMain
{
	public static void main(String[]args)
	{
		AreaPeri obj=new AreaPeri();//Object creation of class AreaPeri
		obj.area(4);
		obj.peri(4);
		obj.area(2.5);
		obj.peri(2.5);
		obj.area(2,3);
		obj.peri(2,3);
		obj.area(3,4,5);
		obj.peri(3,4,5);
	}//End of method main
}//End of class AreaPeriMain
		
