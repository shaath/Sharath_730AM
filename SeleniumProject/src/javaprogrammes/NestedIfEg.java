package javaprogrammes;

import java.util.Scanner;

public class NestedIfEg {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Value");
		int a=sc.nextInt();
		System.out.println("Enter B value");
		int b=sc.nextInt();
		System.out.println("Enter C Value");
		int c=sc.nextInt();
		
		System.out.println(a+"------"+b+"-------"+ c);
		
		if (a > b & a > c)
		{
			System.out.println("A is greater");
		}
		else if (b > c & b > a) 
		{
			System.out.println(" B is greater");
		}
		else
		{
			System.out.println(" C is greater");
		}

	}

}
