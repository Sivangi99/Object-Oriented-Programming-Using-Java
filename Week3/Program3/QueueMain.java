import java.util.Scanner;
class Queue
{
	int size=100;
	int s[]=new int[size];
	int front=-1,rear=-1;
	void enqueue(int d)
	{
		if(rear==size-1)
		System.out.println("Overflow!Cannot insert");
		else
		{
			if(front==-1)
				front++;
			s[++rear]=d;
		}
	}
	int deque()
	{
		int x=0;
		if(front==rear+1)
		return -1;
		else
		 x=s[front++];
		return x;
	}
	void display()
	{
		for(int i=front;i<=rear;i++)
			System.out.print(s[i]+",");
	}
}
class QueueMain
{
	public static void main(String args[])
	{
		Queue ob=new Queue();
		Scanner sc=new Scanner(System.in);
		int ch,x,n;
		while(true)
		{

			System.out.println("Enter 1 to enqueue ,2 to deque,3 to display and 4 to quit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("Enter an element");
				n=sc.nextInt();
				ob.enqueue(n);
				break;
				case 2:
				x=ob.deque();
				if(x==-1)
				System.out.println("Underflow!Cannot Pop");
				else
				System.out.println("The dequed element is "+x);
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
	