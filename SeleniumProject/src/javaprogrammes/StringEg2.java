package javaprogrammes;

public class StringEg2 {

	public static void main(String[] args)
	{
		String x="QEdge";// egdEQ
		
		int rc=x.length();
		
		for (int i = 0; i < rc; i++)
		{
			System.out.println(x.charAt(i));
			
		}
		System.out.println("****");
		
		for (int i = rc-1; i >= 0; i--)
		{
			System.out.print(x.charAt(i));
		}
	}

}
