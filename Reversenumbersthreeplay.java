import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String b=sc.nextLine();
		for(int i=b.length()-1;i>=0;i--)
		{
			System.out.print(b.charAt(i));
		}
	}
}
