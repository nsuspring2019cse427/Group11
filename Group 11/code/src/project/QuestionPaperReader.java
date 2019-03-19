import java.util*;
public class Questionpaperwords {
	private File file;
public Questionpaperwords(File x)
{
	this.file = x;
}
public String GetWordsOfASingleQuestion() 
{
	BufferedReader br = new BufferedReader(new FileReader(this.file));
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
		  }
		  else 
		  {
			 
			  sb.append(line);
			  line = br.readLine();
			  //System.out.println(line);
		  }
}

}
	
