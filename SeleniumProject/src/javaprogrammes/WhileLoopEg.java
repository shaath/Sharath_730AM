package javaprogrammes;

public class WhileLoopEg {

	public static void main(String[] args) 
	{
		int j=1;
		
		while(j<=500)
		{
			System.out.println(j);
			
			j++;
			if (j==100)
			{
				break;
			}
		}

	}

}
