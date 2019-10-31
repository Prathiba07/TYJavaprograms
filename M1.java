public class M1
{
	static void swapOne( )
	{
		int a=10,b=20;
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		System.out.println("the values are: a= "+a+"  and b="+b);
	}
	static void swapTwo( )
	{
	int temp,a=10,b=10;
	temp=a;
	a=b;
	b=temp;
	System.out.println("the values are: "+a+"and"+b);
	}
	
	public static void main(String[] args)
	{
		M1.swapOne();
		
	}
	
	public static void main(String arg1)
	{
		M1.swapTwo();	
	}
}