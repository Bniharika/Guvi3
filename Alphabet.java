import java.util.*;
import java.lang.*;
import java.io.*;
class Vowel
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=sc.next().charAt(0);
		if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
