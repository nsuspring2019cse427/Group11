import java.util.*;
public class AllocateQuestionsToChapters {
	private ChapterWordCount[] listOfChapterWordCount;
	private QuestionPaperWords[] qpWords;
	
	public AllocateQuestionsToChapters(File f, File[] x)
	{
		this.listOfChapterWordCount  = new ChapterReader(x).GetChapterWiseWordFrequency();
		this.qpWords  = new QuestionPaperWords(f).GetQuestionwiseWords();
		
		
		String words[] = qpWords[i].GetWordsOfaQuestion();
		String Chaptername = Chapters.FindChapterWithMostMatch(words,listOfChapterWordCount);
		
		File tmpDir = new File("chapter_"+ Chaptername+"questions"+".txt");
		  boolean exists = tmpDir.exists();


		  if(exists=true)
		  {

			  FileWriter writer = new FileWriter(tmpDir, true);
			  PrintWriter output = new PrintWriter(writer);
			  //System.out.println(sb+""+i);
			  output.print(words);
			  output.close();

		  }
		  else
		  {
			  File file = new File("chapter_"+Chaptername+" "+"questions"+".txt");
			  FileWriter writer = new FileWriter(file, true);
			  PrintWriter output = new PrintWriter(writer);
			  //System.out.println(sb+""+i);
			  output.print(words);
			  output.close(); 
		  }
	

}
