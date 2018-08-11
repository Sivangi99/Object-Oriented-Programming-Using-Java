//3.Program to define a class employee with data members empid,name and salary.Accept data for 5 objects and print it.
import java.io.*;
class Employee
{
	 int empid;
	String name;
	double salary;
	Employee(int empid,String name,double salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println(empid+"\t"+name+"\t"+salary);
	}
}

class EmployeeMain
{
	public static void main(String args[])throws IOException
	{
		int id;
		String name;
		double sal;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Employee ob[]=new Employee[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter EmpId");
			id=Integer.parseInt(br.readLine());
			System.out.println("Enter Name");
			name=br.readLine();
			System.out.println("Enter Salary");
			sal=Double.parseDouble(br.readLine());
			ob[i]=new Employee(id,name,sal);
			
		}
		System.out.println("EmpId\tName\tSalary ");
		for(int i=0;i<5;i++)
		ob[i].display();
		
	}
}
			
	