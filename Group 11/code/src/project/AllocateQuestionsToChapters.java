import java.util.*;
public class AllocateQuestionsToChapters {
	private ChapterWordCount[] listOfChapterWordCount;
	private QuestionPaperWords[] qpWords;
	
	public AllocateQuestionsToChapters(File f, File[] x)
	{
		this.listOfChapterWordCount  = new ChapterReader(x).GetChapterWiseWordFrequency();
		this.qpWords  = new QuestionPaperWords(f).GetQuestionwiseWords();
		
		

	}

	public 
}
