package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.*;

public class PP {

	public static void main(String[] args)throws java.lang.Exception,FileNotFoundException
	{
		File fr = new File("C:\\Users\\User\\eclipse-workspace\\project\\chapters");
		 File[] listOfFiles = fr.listFiles();
		 @SuppressWarnings("unchecked")
		 LinkedHashMap<String, Integer> h[] = new LinkedHashMap[listOfFiles.length];
		
		
		for (int i = 0; i<listOfFiles.length;i++)
		{
			h[i] = new LinkedHashMap<String, Integer>();
			//BufferedReader s = new BufferedReader(new FileReader(listOfFiles[i]));
			Scanner s = new Scanner(listOfFiles[i]).useDelimiter(" +");
			//System.out.println(listOfFiles[i].getName());
			int poi= 0;
			
			while (s.hasNextLine())
			{
				
				String mn = s.next();
			    h[i].putIfAbsent(mn,poi);
			 
				 if((h[i].get(mn))>=0)
				 {
					 int u = h[i].get(mn);
					 u++;
					 h[i].put(mn,u);
				 }
				 
				
				
			 }
		
		//System.out.print(h[i]);
		}
		
		//System.out.println(h[1]);
		
	
		

		BufferedReader br = new BufferedReader(new FileReader("questionpaper.txt"));
			try {
			    StringBuilder sb = new StringBuilder();
			    String line = br.readLine();
			    //System.out.println(line);
			   
			  while (line!= null) 
			  {
				 
				  if(line.isEmpty() )
				  {
					  sb.append(line);
					  //System.out.println(sb);
					  String parags[]=sb.toString().split("[\\s]+");
					  int [][] matrix = new int [listOfFiles.length][parags.length];
					  for(int chapters=0;chapters<listOfFiles.length;chapters++) 
					  {

						  for (int word =0;word<parags.length;word++)
						  {
							  if(h[chapters].get(parags[word].toString()) == null)
							  {

								  matrix[chapters][word]= 0;
								  
							  }
							  else
								  matrix[chapters][word]=h[chapters].get(parags[word].toString());
							  //System.out.println(parags[word].toString());
						  }
					  }
					 
					  int[] rowSum = new int[matrix.length];
					  for(int a = 0; a<matrix.length;a++)
					  {
						  rowSum[a] = 0;  //<= initialize value

						  for(int j = 0; j<matrix[a].length; j++)
						  {
							  rowSum[a] += matrix[a][j];    //<= sum of row
						  }
					  }
					  //System.out.println(rowSum);
					  int max = rowSum[0];
					  int index = 0;

					  for (int x = 0; x < rowSum.length; x++) 
					  {
						  if (max < rowSum[x]) 
						  {
							  max = rowSum[x];
							  index = x;
						  }
					  }
					  //System.out.println(max);
					  System.out.println(index);

					 File tmpDir = new File("chapter_"+ index+"questions"+".txt");
					  boolean exists = tmpDir.exists();


					  if(exists=true)
					  {

						  FileWriter writer = new FileWriter(tmpDir, true);
						  PrintWriter output = new PrintWriter(writer);
						  //System.out.println(sb+""+i);
						  output.print(sb);
						  output.close();

					  }
					  else
					  {
						  File file = new File("chapter_"+ index+" "+"questions"+".txt");
						  FileWriter writer = new FileWriter(file, true);
						  PrintWriter output = new PrintWriter(writer);
						  //System.out.println(sb+""+i);
						  output.print(sb);
						  output.close(); 
					  }



					  sb.delete(0,sb.length());
					  line=br.readLine();
					  


				  }

				  else 
				  {
					 
					  sb.append(line);
					  line = br.readLine();
					  //System.out.println(line);
				  }


			  }
			 
			}
			    finally {
			   br.close();
			}
	
	
		
		
	}
	
	

}
