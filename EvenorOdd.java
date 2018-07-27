import java.util.*;
import java.lang.*;
import java.io.*;
class Evenorodd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invaild");
		}
		else if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}
