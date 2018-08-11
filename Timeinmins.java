import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
int min=sc.nextInt();
System.out.println(min);
int hr=0,min1=0;
if(min>0)
{
if(min<60)
{
	min1=min;
}
else if(min>60)
{
	hr=min/60;
	min1=min%60;
}
System.out.println(hr+":"+min1);
}
		else
		{
			System.out.println("invalid input\n");
		}
    }
}
