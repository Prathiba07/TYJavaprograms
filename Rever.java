import java.util.*;

class Rever
{
public static void main(String[] args)
{
Scanner s=new Scanner (System.in);
System.out.println("enter size");
int size=s.nextInt();

int[] a=new int[size];

System.out.println("enter elements");
for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	
int[] b=new int[size];
	for(int j=0,i=size-1;j<b.length;i--,j++)
	{
		b[i]=a[j];
	}
        for(int j=0;j<b.length;j++)
		{
		System.out.println(b[j]);
		}

}
}