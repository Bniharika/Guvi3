import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int l=sc.nextInt();
	   int w=sc.nextInt();
	   int h=sc.nextInt();
	   int SA = 2 * (l * w + l * h + w * h);
	   int Volume = l * w * h;
	   System.out.print(SA+" "+Volume);
	   
	}
}
