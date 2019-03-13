package project;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*public class Allimplentations {
	package project;

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.PrintWriter;
	import java.util.Scanner;
	import java.util.regex.*;

	public class PP {

		public static void main(String[] args)throws java.lang.Exception
		{
			//TableHash k = new TableHash();
			
		  //k.Hash();
		 
			/*Scanner sc=new Scanner(new FileReader("questionpaper.txt")).useDelimiter("[\\r\\n]+");
			//FileWriter filewriter;
			String paragraph = null;
			int i = 0;
			while (sc.hasNext()) {
				
				
			paragraph = sc.next();
			System.out.println(paragraph+i);
			i++;
			
			}*/
			
			//System.out.println(paragraph);
			//while(sc.hasNextLine()){
				//filewriter=new FileWriter("para"+ i +".txt");
				//filewriter.write(sc.nextLine());
				//filewriter.close();
				//System.out.println("para"+i+"="+sc.nextLine());
				//i++;
			
			//System.out.println(sc.nextLine());
			//System.out.println(sc.nextLine());	
		
		
			
			/*try{
				BufferedReader bf = new BufferedReader(new FileReader("questionpaper.txt"));
				String line = bf.readLine();
				while (line!=null)
				{
					//System.out.println(line + "1");
					line = bf.readLine();
				}
				System.out.println(line);
			}
				catch (Exception e)
				{
					e.printStackTrace();
				}
		

			
			
			
			 BufferedReader br = new BufferedReader(new FileReader("questionpaper.txt"));
				try {
				    StringBuilder sb = new StringBuilder();
				    String line = br.readLine();
				    int i =0;
				   
				  while (line!= null) {
					 
					  if(line.isEmpty() )
					  {
				    	  sb.append(line);
				    	 if(sb.toString().matches(".*\\bspeed\\b.*")|| sb.toString().matches(".*\\benergy\\b.*") )
				    	 {
				    		 File file = new File("Paragraph_"+ i+".txt");
						       FileWriter writer = new FileWriter(file, true);
						      PrintWriter output = new PrintWriter(writer);
						        //System.out.println(sb+""+i);
						        output.print(sb);
				      
				    		
				    		    
				    		    
						        output.close();
						      i++;
				                
				    	 }
				    	  sb.delete(0,sb.length());
			    	       line=br.readLine();
				    	        
				    	
				      }
				  
				   
				  
				    	else {
				    		
				    		//sb.append(System.lineSeparator());
				       
				       sb.append(line);
				       line = br.readLine();
				    	}
				      
				    	
				   }
				    System.out.println(sb);
				    			    //Split the content of the file into an array of paragraphs

				    //String parags[]= sb.toString().split("[\\r\\n]+"); 
				   //System.out.println(parags);
				   // Write every paragraph to a new file
				    //for (int i=0; i<parags.length;i++) {
				    	
				    	//System.out.println(i+parags[i]);
				    	
				      //  File file = new File("Paragraph_"+i+".txt");
				      //  FileWriter writer = new FileWriter(file, true);
				      //  PrintWriter output = new PrintWriter(writer);
				      //  output.print(parags[i]);
				      //  output.close();
				   //}
				}
				    finally {
				   br.close();
				}
				
				
		
	}
	
	
	public static void Hash() throws FileNotFoundException{

	 Scanner sc = new Scanner (new FileReader("chapterone.txt"));
	 int i=0;
	 while(sc.hasNextLine())
	 {
		 
		 String k = sc.next();
		 
		 hm.putIfAbsent(k,""+i);
		 if(Integer.parseInt(hm.get(k))>=0)
		 {
			 int u = Integer.parseInt(hm.get(k));
			 u++;
			 hm.put(k,""+u);
		 }
				
		 
		
		
	 }
	 sc.close();

	 
	 //System.out.println(hm);
	 
 
 

 // Printing the Hashtable 
// System.out.println(hm.get(1));
	}
	}*/

/*public static void HashtheChapters() throws FileNotFoundException
{
File fr = new File("C:\\Users\\User\\eclipse-workspace\\project\\chapters");
 File[] listOfFiles = fr.listFiles();
 @SuppressWarnings("unchecked")
 Hashtable<String, Integer> h[] = new Hashtable[listOfFiles.length];

 //TableHash p[] = new TableHash[listOfFiles.length];
 
for (int i = 0; i<listOfFiles.length;i++)
{
	h[i] = new Hashtable<String, Integer>();
	
	
	//p[i] = new TableHash();
	
	Scanner s = new Scanner(listOfFiles[i]);
	System.out.println(listOfFiles[i].getName());
	int poi= 0;
	while (s.hasNextLine())
	{
		
		String mn = s.next();
		
		 
		 h[i].putIfAbsent(mn,poi);
		// System.out.println(p);
		 
		 if((h[i].get(mn))>=0)
		 {
			 //System.out.println(poi);
			 int u = h[i].get(mn);
			 u++;
			 h[i].put(mn,u);
		 }
		
	}
	
	System.out.println(h[i]);
}
//System.out.println(p[1]);
}*/


		




/*public static void Hashthequestion(String line)
{
StringBuilder l = new StringBuilder();
TableHash p = new TableHash();
l.append(line);
String parags[]=l.toString().split("[\\s]+");
for (int i =0;i<parags.length;i++)
{
	String mn = parags[i].toString();
	System.out.println(mn+"\n");
	p.hm.put(mn, "0");

}
}*/

