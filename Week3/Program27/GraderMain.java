import java.util.Scanner;
class Grader
{
	int score;
	Grader (int s)
	{
		score=s;
	}
	char letterGrade()
	{
		char grade;
		grade=(score>=90&&score<100)?'O':(score>=80&&score<90)?'E':(score>=70&&score<80)?'A':(score>=60&&score<70)?'B':(score>=50&&score<60)?'C':'F';
		return grade;
	}
}
class GraderMain
{
	public static void main(String args[])
	{
		int score;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Score");
		score=sc.nextInt();
		if(score<0||score>100)
			System.out.println("Invalid Input");
		else
		{
			Grader ob=new Grader(score);
			char gr=ob.letterGrade();
			System.out.println("The Grade is "+gr);
		}
	}
}

		
