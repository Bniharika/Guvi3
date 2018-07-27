import java.util.*;
import java.lang.*;
import java.io.*;
class Repeat
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int n=sc.nextInt();
		int sum=0,i;
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
	}
}
