/*
Create an array which can hold the 5 students 4 subject marks.
Print the Marks of every student in table format along with the percent.
	Also Print the Grade of the Student.
	And Also print the Highest Percentage. 
*/

public class Array2DTask
{
	public static void main(String ar[])
	{
		int marks[][] = {
					{76, 78, 65, 66},
					{89, 87, 56, 76},
					{88, 66, 51, 82},
					{81, 52, 74, 84},
					{55, 56, 73, 72}
			};	

			double max=0;	

			for(int r = 0; r<marks.length ; r++) {
				double percent = 0;
				double sum = 0;
				for(int c = 0; c<marks[r].length ; c++) {
					System.out.print(marks[r][c] +"\t");
					sum = sum + marks[r][c];
				}
				percent = (sum/400)*100;
				System.out.print(percent+"%");
				
				if(percent>max){
					max = percent;
				}				

				//Grad Calculation

				System.out.println();
			}
			
			System.out.println(max);
	}
}
