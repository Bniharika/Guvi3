import java.util.*;
import java.lang.*;
import java.io.*;
class Simpleprogram
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		if(a==0)
		{
			System.out.println("zero");
		}
		else if(a>0)
		{
			System.out.println("positive value");
		}
		else
		{
			System.out.println("negative value");
		}
	}
} 
