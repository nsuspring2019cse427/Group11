import java.util*;
public class Questionpaperwords {
	private File file;
public QuestionPaperReader(File x)
{
	this.file = x;
}
public QuestionPaperWords[] GetQuestionwiseWords() 
{
	
	ArrayList<QuestionPaperWords> ListOfQuestionWords = new ArrayList<QuestionPaperWords>();
	BufferedReader br = new BufferedReader(new FileReader(this.file));
	try {
	    StringBuilder sb = new StringBuilder();
	    String line = br.readLine();
	    //System.out.println(line);
	   
	  while (line!= null) 
	  {
		  QuestionPaperWords QuestionWordCount = new QuestionPaperWords();
		  if(line.isEmpty() )
		  {
			  sb.append(line);
			  //System.out.println(sb);
			  String parags[]=sb.toString().split("[\\s]+");
			  for (int i=0; i<parags.length;i++) {
				  QuestionWordCount.AddQuestionWord(parags[i]);
			  }
			  ListOfQuestionWords.add(QuestionWordCount);
			  
		  }
		  else 
		  {
			 
			  sb.append(line);
			  line = br.readLine();
			  //System.out.println(line);
		  }
}
	  return ListOfQuestionWords.toArray();

}
	
