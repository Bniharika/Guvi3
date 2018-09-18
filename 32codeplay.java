/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
			System.out.print("Yes");
			count=0;
			break;
			}
			else
			count=1;
		}
		if(count==1)
		System.out.print("No");
		
	}
}
