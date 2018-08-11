/*
**4.Define a class Circle which contains
**Two private instance variables :radius (of type double) and color (of type string),
**Initialize the variables radius and color with default value of 1.0 and “red”,respectively using default constructor.
**Include a second constructor that will use the default value for color and sets the radius to the value passed as parameter.
**Two public methods : getRadius() and getArea() for returning the radius and area of the circle.
**Invoke the above methods and constructors in the main.
*/
import java.io.*;
class Circle
{
	 private double radius;
	private String color;
	
	Circle()
	{
		radius=1.0;
		color="Red";
	}	
	Circle(double radius)
	{
		this.radius=radius;
		color="Red";
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return (3.14*radius*radius);
	}
}

class CircleMain
{
	public static void main(String args[])throws IOException
	{
		
		double rad,area;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Circle ob1=new Circle();
		Circle ob2=new Circle(7.0);
		rad=ob1.getRadius();
		area=ob1.getArea();
		System.out.println("Radius +"rad+" Area="+area);
		rad=ob2.getRadius();
		area=ob2.getArea();
		System.out.println("Radius +"rad+" Area="+area);
		
		
	}
}
			
	