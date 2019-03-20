import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QuestionPaperWords {
	private File file;
	private String[] k;
	public QuestionPaperWords(File x)
	{
		this.file = x;
	}
	
	public QuestionPaperWords()
	{
	}


	public QuestionPaperWords[] GetQuestionwiseWords() throws IOException 
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
					  String parags[]=sb.toString().split("[\\s]+");
					  
					  QuestionWordCount.AddQuestionWord(parags);
					  
					  ListOfQuestionWords.add(QuestionWordCount);
					  sb = new StringBuilder();
					  
				  } else {
					  sb.append(line);
					  
				  }
				  
				  line = br.readLine();

			  }	
			  
	
	
	
		}
		finally {
		}
		return ListOfQuestionWords.toArray(new QuestionPaperWords[ListOfQuestionWords.size()]);
	}
	
	public void  AddQuestionWord(String[]  p)
	{
		
		this.k =p;
	}
	public String[] GetQuestionWord()
	{
		return k;
	}
	
}

