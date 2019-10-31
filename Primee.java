//import java.util.Scanner;

class Primee
{
	static boolean isPrime(int n)
	{
		int count=2;
	for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			count++;
		}
		    if(count==2)
		    return true;
			else
			return false;
	}
	
public static void main(String[] args)
{
	int n=0;
	int size=7;
	int[] a=new int[size];
	
	for(int i=0;i<a.length;n++)
	{
		if(isPrime(n))
		{
			a[i++]=n;
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
		
}
}

