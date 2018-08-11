import java.util.Scanner;
class Stack
{
	int size=100;
	int s[]=new int[size];
	int top=-1;
	void push(int d)
	{
		if(top==size-1)
		System.out.println("Overflow!Cannot Push");
		else
		{
		++top;
		s[top]=d;}
	}
	int pop()
	{
		int x=0;
		if(top==-1)
		System.out.println("Underflow!Cannot Pop");
		else
		 x=s[top--];
		return x;
	}
	void display()
	{
		for(int i=0;i<=top;i++)
			System.out.print(s[i]+",");
	}
}
class StackMain
{
	public static void main(String args[])
	{
		Stack ob=new Stack();
		Scanner sc=new Scanner(System.in);
		int ch,x,n;
		while(true)
		{

			System.out.println("Enter 1 to push ,2 to pop,3 to display and 4 to quit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("Enter an element");
				n=sc.nextInt();
				ob.push(n);
				break;
				case 2:
				x=ob.pop();
				System.out.println("The popped element is "+x);
				break;
				case 3:
				ob.display();
				break;
				case 4:
				System.exit(0);
				default:
				System.out.println("Wrong Choice");
			}//End of switch
		}
	}
}
	