package javaprogrammes;

import java.util.ArrayList;

public class ArraylistEg {

	public static void main(String[] args)
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Write the data
		x.add("Selenium");
		x.add("UFT");
		x.add("Manual");
		x.add("UFT");
		x.add('M');
		x.add(2, true);
		
		System.out.println(x.size());

		//Reading the data from Arraylist
//		System.out.println(x.get(2));
		
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
		}
	}

}