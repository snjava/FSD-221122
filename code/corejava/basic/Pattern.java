/*
	1	2	3	4
	1	2	3	4
	1	2	3	4
	1	2	3	4
*/
public class Pattern
{
	public static void main(String args[])
	{
		int i=1;
		do {
			for(int j=1;j<=4;j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
			i++;
		} while(i<=4);
	}
}