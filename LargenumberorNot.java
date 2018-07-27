import java.util.*;
import java.lang.*;
import java.io.*;
class Large
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		System.out.println("enter c value");
		int c=sc.NextInt();
		if(a>b)
		{
			System.out.println(a+"is large");
		}
		else if(b>c)
		{
			System.out.println(b+" is large");
		}
		else
		{
			System.out.println(c+" is large");
		}
	}
}
		
