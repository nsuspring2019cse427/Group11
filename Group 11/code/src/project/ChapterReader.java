import java.io.File;
import java.util.Scanner;

public class ChapterReader {
	private File[] listOfFiles;
	private ChapterWordCount[] l;
	public ChapterReader(File[] x )
	{
		
		this.listOfFiles = x;
	}

	public ChapterWordCount[] GetChapterWiseWordFrequency() {
		ArrayList<ChapterWordCount> listofchapterwords = new ArrayList<ChapterWordCount>();
		for(int x = 0; x < this.listOfFiles.length; ++x) {
			File file = this.listOfFiles[x];
			
			ChapterWordCount wordCount = new ChapterWordCount(this.getChapterName(file.getName()));
			
			Scanner s = new Scanner(file).useDelimiter(" +");
			//System.out.println(listOfFiles[i].getName());
			
			
			while (s.hasNextLine())
			{
				
				String mn = s.next();
			    //h[i].putIfAbsent(mn,poi);
			    wordCount.addCount(mn);
			 }
			listofchapterwords.add(wordCount);
		}
		this.l= listofchapterwords;
		return listofchapterwords.toArray();
	}
	
	private String getChapterName(String fileName) {
		
	}
}

public String FindChapterWithMostMatch(String [] x, ChapterWordCount[] o)
{
	
}



ChapterWordCount[] listOfChapterWordCount = new ChapterReader(listOfFiles).GetChapterWiseWordFrequency();


ChapterWordContainer container = new ChapterWordContainer(listOfChapterWordCount);
QuestionPaperWords[] qpWords = new QuestionPaperWords(qpFile).GetQuestionwiseWords();
//String[] wordsInQp = qpWords.getAllWords();

//String chapter = container.FindChapter(wordsInQp);
AllocateQuestionsToChapters



