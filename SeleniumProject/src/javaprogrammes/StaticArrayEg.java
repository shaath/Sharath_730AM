package javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) 
	{
		int[] sal={30000,40000,50000,60000,70000};

		//Finding the length of the array
		
		System.out.println(sal.length);
		
		//Reading the data from an array
		
//		System.out.println(sal[2]);
		
		for (int i = 0; i < sal.length; i++) 
		{
			System.out.println(sal[i]);
		}
	}

}
