package interview.learning.collection;

import java.util.HashMap;

public class HashMapTest {

	
	public static HashMap<String, String> test()
	{
		
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("1", "hello");
		map.put("2", "hii");
		
		return map;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(test().toString());
	
	}
	
}
