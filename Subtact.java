import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Subtact
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int hr,min;
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		hr=Math.abs(n1-m1);
		min=Math.abs(n2-m2);
		System.out.println(hr+" "+min);
		
	}
}
