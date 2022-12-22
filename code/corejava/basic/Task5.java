/*
WAP to define two numbers, and one of the following operators +, -, *, /. Perform the given operation and display result.
*/

public class Task5
{
	public static void main(String args[])
	{
		int a = 20;
		int b = 5;
		char ch = '/';
		int ans = 0;
		if(ch=='+') {
			ans = a+b;
		}
		else if(ch=='-') {
			ans = a-b;
		}
		else if(ch=='*') {
			ans = a*b;
		}
		else if(ch=='/') {
			ans = a/b;
		}
		System.out.println(ans);
	}
}