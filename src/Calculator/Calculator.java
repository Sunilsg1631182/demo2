package Calculator;

public class Calculator {
	static int a;
	static int b;
	
	public static void  add(int a,int b)
	{
	
		int sum=0;
		sum=a+b;
		System.out.println("sum="+sum);
		
	}
	
	public static void sub( int a,int b)
	{
		int sub=0;
		sub=a-b;
		System.out.println("sub="+sub);
		
	}
	public static void div(int a,int b)
	{
		float div=0;
		div=a/b;
		System.out.println("div="+div);
		
	}
	
	public static void main(String[] args)
	{
		 add(5,6);
		 sub(6,4);
		 div(4,2);
		
	}
	
	
}
