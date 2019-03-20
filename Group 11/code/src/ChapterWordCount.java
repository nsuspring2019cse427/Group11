import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.*;

public class ChapterWordCount {
	private String chapterName;
	 private LinkedHashMap<String, Integer> h = new LinkedHashMap();
	
	public ChapterWordCount(String chapterName) {
		this.chapterName = chapterName;
	}
	
	public String getChapterName() {
		return this.chapterName;
	}
	
	public void addCount(String word)
	{
		
		h.putIfAbsent(word,0);
		 
		 if((h.get(word))>=0)
		 {
			 int u = h.get(word);
			 u++;
			 h.put(word,u);
		 }
		
	}
	
	public int getCount(String word) {
		if (h.containsKey(word))
		
		return h.get(word);
		else
			return 0;
		
	}
	
	public int getWeight(String[] words) {
		int sum = 0;
		for(int i = 0; i < words.length; ++i) {
			sum += this.getCount(words[i]);
		}
		return sum;
	}
	
	public String getName() {
		return this.chapterName;
	}
	
}
