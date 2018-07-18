//This is a program which calculates Grade as per Percentage given.
class Grade
{
	int Percentage=5;
	char Grade;
	void calc()
	{
		if(Percentage>=90)
		 Grade='A';
		else if(Percentage>=80)
		 Grade= 'B';
		else if(Percentage>=70)
		 Grade= 'C';
		else if(Percentage>=60)
		 Grade= 'D';
		else if(Percentage>=40)
		 Grade= 'E';
		else
		 Grade= 'F';
		System.out.println("Percentage = "+Percentage+" Grade = "+Grade);
	}
}
class GradeMain
{
	public static void main(String []args)
	{
		Grade obj=new Grade();
		obj.calc();
	}
}

	
