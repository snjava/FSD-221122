/*

* * 5 * *
 * * * * 
  * 3 *
   * *
    1
   * *
  * 3 *
 * * * *
* * 5 * *

*/

public class Pattern1
{
	public static void main(String args[])
	{
		int n = 7;
		for(int r = n; r>=1; r--)
		{
			for(int s=r; s<n ; s++)
			{
				System.out.print(" ");
			}
			int center = (r/2)+1;
			for(int c = 1; c<=r; c++)
			{
				
				if((r%2 != 0) && center == c)
				{
					System.out.print(r+" ");
				}
				else
				{
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}

		for(int r=2; r<=n ; r++)
		{
			for(int s=r; s<n ; s++)
			{
				System.out.print(" ");
			}
			int center = (r/2)+1;
			for(int c = 1; c<=r ; c++) {
				if((r%2 != 0) && center == c)
				{
					System.out.print(r+" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}









	}
}