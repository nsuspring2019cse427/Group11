import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ChapterReader {
	private File[] listOfFiles;
	private ChapterWordCount[] l;
	
	public ChapterReader(File[] x)
	{		
		this.listOfFiles = x;
	}

	public ChapterWordCount[] GetChapterWiseWordFrequency() throws FileNotFoundException {
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
		this.l = listofchapterwords.toArray(new ChapterWordCount[listofchapterwords.size()]);
		return this.l;
	}
	
	private String getChapterName(String fileName) {
		return fileName;
	}
}

//
//
//
//
//
//ChapterWordCount[] listOfChapterWordCount = new ChapterReader(listOfFiles).GetChapterWiseWordFrequency();
//
//
//ChapterWordCountContainer container = new ChapterWordCountContainer (listOfChapterWordCount);
//QuestionPaperWords[] qpWords = new QuestionPaperWords(qpFile).GetQuestionwiseWords();
////String[] wordsInQp = qpWords.getAllWords();
//
////String chapter = container.FindChapter(wordsInQp);
//AllocateQuestionsToChapters



