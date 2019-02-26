package project;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class TableHash {
	
	//public static Hashtable<String, Integer> ar;
	
	public static Hashtable<String, Integer> hm = new Hashtable<String, Integer>(); 
	
	public static void putifAbsent(String k, int v)
	{
		hm.putIfAbsent(k, v);
		
	}
	public static int get(String k)
	{
		
		return hm.get(k) ;
	}
	
	public static void Hash(String key, int value)
	{
		hm.put(key, value);

	}
	
	public static void print()
	{
		System.out.print(hm);
	}
}
