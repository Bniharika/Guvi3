import java.util.*;
import java.lang.*;
import java.io.*;
class Count
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		int count=0;
		while(a !=0)
		{
			a=a/10;
			++count;
		}
		System.out.println(count);
	}
}
