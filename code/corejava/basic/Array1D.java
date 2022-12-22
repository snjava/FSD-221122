public class Array1D
{
	public static void main(String args[])
	{
		/*
		double percent[]; // Declaration of Array
		percent = new double[10]; // Instantiation of array
		percent[0] = 77.88; //initialization of array
		percent[1] = 72.81;
		percent[2] = 62.11;
		percent[3] = 72.51;
		percent[4] = 45.81;
		percent[5] = 76.41;
		percent[6] = 65.22;
		percent[7] = 89.81;
		percent[8] = 55.90;
		percent[9] = 67.31;
		*/

		double percent[] = {77.88, 72.81, 62.11, 72.51, 45.81, 76.41, 65.22, 89.81, 55.90, 67.31};

		System.out.println(percent); // [D@762efe5d

		System.out.println(percent.length); // you can get the total number of values in array
		
		System.out.println("---------Normal For Loop---------------"); 
		for(int i=0; i<percent.length ; i++)
		{
			System.out.println(percent[i]);
		}

		System.out.println("---------Enhance For Loop---------------");
		for(double p :  percent) 
		{
			System.out.println(p);
		} 

		
	}
}