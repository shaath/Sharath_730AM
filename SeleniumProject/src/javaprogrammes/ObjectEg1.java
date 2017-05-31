package javaprogrammes;

public class ObjectEg1 {

	public static void main(String[] args) 
	{
		Object[] x={"Selenium",'M',true,50000,444.44};
		
		System.out.println(x.length);
		
		for (Object data : x) 
		{
			System.out.println(data);
		}

	}

}
