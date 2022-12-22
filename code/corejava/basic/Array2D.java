public class Array2D
{
	public static void main(String args[])
	{
		/*
		double percent[][]; // Declaring  Array
		percent = new double[3][5]; // Instantiation of array

		percent[0][0] = 67.65;  // Initialization
		percent[0][1] = 87.15;
		percent[0][2] = 61.45;
		percent[0][3] = 77.12;
		percent[0][4] = 59.31;

		percent[1][0] = 61.61;
		percent[1][1] = 82.11;
		percent[1][2] = 63.41;
		percent[1][3] = 74.11;
		percent[1][4] = 55.31;

		percent[2][0] = 57.65;
		percent[2][1] = 67.15;
		percent[2][2] = 81.45;
		percent[2][3] = 97.12;
		percent[2][4] = 89.31;
		*/
		double percent[][] = { 
						{76, 78, 45, 78, 56}, 
						{76, 89, 56, 98, 56}, 
						{88, 66, 89, 98, 67}
					};


		System.out.println(percent.length); // row count : 3
		System.out.println(percent[1].length); // column count of 1st row : 5


		for(int r=0;r<=2;r++) {     // row
			for(int c=0;c<=4;c++) {  // column
				System.out.print(percent[r][c] + "\t");
			}
			System.out.println();
		}

		
		
	}
}