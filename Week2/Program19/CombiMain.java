
class Combi
{
	void calc()
	{
		System.out.println("The combinations are :");
		for(int i=1;i<=3;i++)
		{
			System.out.println();
			for(int j=1;j<=3;j++)
			{
				for(int k=1;k<=3;k++)
				{
					System.out.print(i+",");
					System.out.print(j+",");
					System.out.print(k+",");
				}
				
			}
		}
	}

		
}
class CombiMain
{
	public static void main(String args[])
	{
		Combi ob=new Combi();
		ob.calc();
	}
}			