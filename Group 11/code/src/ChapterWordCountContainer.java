import java.util.ArrayList;

public class ChapterWordCountContainer {
	
	private ChapterWordCount[] chapters;
	
	private ArrayList<Result> results = new ArrayList<Result>();
	
	public ChapterWordCountContainer(ChapterWordCount[] p)
	{
		this.chapters = p;
	}
	public Result[] FindChapterWithMostMatch(QuestionPaperWords [] ListOfQuestions )
	{
		for(int j=0; j < ListOfQuestions.length; ++j) {
			
			String[] WordsOfAQuestion = ListOfQuestions[j].GetQuestionWord()  ; 
			
			
			int max = 0;
			int questionNr = -1;
			String chapterName = "";
			for(int x=0;x<chapters.length;x++)
			{
				ChapterWordCount chapter = this.chapters[x];
				
				int tmpMax = chapter.getWeight(WordsOfAQuestion);
				if (tmpMax > max) {
					max = tmpMax;
					chapterName = chapter.getName();
					questionNr = j;
				}
			}
			
			this.results.add(new Result(questionNr, chapterName));
			
		}
		
		return this.results.toArray(new Result[this.results.size()]);
	}
}
