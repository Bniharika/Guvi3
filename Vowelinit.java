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
		String ch=sc.next();
		int i,count=0;
		for(i=0;i<ch.length();i++)
		{
			if(ch.charAt(i)=='a'||ch.charAt(i)=='e'||ch.charAt(i)=='i'||ch.charAt(i)=='o'||ch.charAt(i)=='u')
			{
				count++;
				System.out.print("yes");
				break;
			}
		}
			if(count==0)
			{
				System.out.print("no");
			}
		
	}
}
