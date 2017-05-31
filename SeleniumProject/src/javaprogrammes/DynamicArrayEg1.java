package javaprogrammes;

public class DynamicArrayEg1 {

	public static void main(String[] args)
	{
		Object[] x=new Object[5];
		
		System.out.println(x.length);
		
		//Writing the data into array
		
		x[1]="Selenium";
		x[3]=40000;
		x[1]="QEdge";
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
		
	}

}
