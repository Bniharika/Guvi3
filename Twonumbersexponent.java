import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int power=1;
		while(m !=0)
		{
			power *=n;
			--m;
		}
		System.out.print(power);
	}
	
}
