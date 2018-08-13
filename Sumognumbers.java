import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int total=0,count=1;
		while(count<=n)
		{
			total =total + count;
			count++;
		}
		System.out.print(total);
	}
}
