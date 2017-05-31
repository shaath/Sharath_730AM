package javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashseteg {

	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<String>();
		
		s.add("Selenium");
		s.add("UFT");
		s.add("Boll");
		s.add("Apple");
		s.add("Apple");
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String text=it.next();
			System.out.println(text);
		}
	}

}
