//This is a program to check whether a year is leap or not
class Leap
 {
	int year = 1900;
	void check()
	{
		 if(year % 4 == 0)
      		  {
           			 if( year % 100 == 0)
           			 {
              				  // year is divisible by 400, hence the year is a leap year
               				 if ( year % 400 == 0)
				System.out.println(year + " is a leap year.");
        				else
				System.out.println(year + " is not a leap year.");
       
                                   
                                		 }
           		 	else
                			System.out.println(year + " is  a leap year.");
       		 }
       		 else
           		 System.out.println(year + " is not a leap year.");
	}//End of method check
}//End of class Leap
class LeapMain
{
	public static void main(String []args)
	{
		Leap obj=new Leap();
		obj.check();
	}
}
