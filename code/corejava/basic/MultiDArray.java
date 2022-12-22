public class MultiDArray
{
	public static void main(String a[])
	{
		int array[][] = {
						{34, 56, 768},
						{23, 45},
						{54, 67, 89, 34, 768, 23},
						{32, 54, 76}
					}; 

		System.out.println(array.length);    // Rows : 4
		System.out.println(array[2].length); // Column of 2nd Row : 6

		for(int r = 0 ; r<array.length ; r++)
		{
			for(int c = 0 ; c<array[r].length ; c++)
			{
				System.out.print(array[r][c] + "\t");
			}
			System.out.println();
		}


	}
}