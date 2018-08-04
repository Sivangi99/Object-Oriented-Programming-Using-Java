class Pattern2
{
	void print()
    	{
	
  	             for (int i=0; i<=4; i++)
        		{
           			 for (int j=4; j>i; j--)
	 			 System.out.print(" ");
			for(int l=i;l>1;l--)
				System.out.print(l);
			for(int m=1;m<=i;m++)
				System.out.print(m);
                 			System.out.println();
		}
                     }
    }
class Pattern2Main
{
	public static void main(String args[])
	{
		Pattern2 ob=new Pattern2();
		ob.print();
	}
}

