public class IfCondition
{
	public static void main(String ar[])
	{
		double percent = 80;
		if(percent>=40 && percent<=100) 
		{
			System.out.println("Congrats... You are Pass!!");
			if(percent>=75 && percent<=100)
			{
				System.out.println("You got a Distinction");
			}
			else if(percent>=60 && percent<75) 
			{
				System.out.println("You got a 1st Class");
			}
			else if(percent>=50 && percent<60) 
			{
				System.out.println("You got a 2nd Class");
			}
			else
			{		
				System.out.println("YOu got a Pass Class");
			}
		}
		else if(percent>=0 && percent<40)
		{
			System.out.println("Sorry..!! You are Fail..!!");
		}
		else
		{
			System.out.println("Invalid Percentage...!!!");
		}
	}
}