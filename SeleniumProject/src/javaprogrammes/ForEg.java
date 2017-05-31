package javaprogrammes;

public class ForEg 
{

	public static void main(String[] args) 
	{
		
		
		for(int i=1; i <= 100 ; i=i+1)
		{
			System.out.println(i);
			if (i==50)
			{
				break;
			}
		}
		System.out.println("***");
		
		for (int i = 100; i > 0; i--)
		{
			System.out.println(i);
		}
	}

}
