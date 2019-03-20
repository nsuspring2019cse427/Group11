import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fr = new File("C:\\Users\\User\\eclipse-workspace\\project\\chapters");
		 File[] listOfFiles = fr.listFiles();
		 
		 ChapterReader Reader = new ChapterReader(listOfFiles);
		 ChapterWordCount[] ChapterWords = Reader.GetChapterWiseWordFrequency();
		 File questions = new File("C:\\Users\\User\\git-projects\\javaproject\\QuestionPaperSegragator\\src\\questionpaper.txt");
		 QuestionPaperWords QuestionReader = new QuestionPaperWords(questions);
		 ChapterWordCountContainer container = new ChapterWordCountContainer(ChapterWords);
		 Result[] results =  container.FindChapterWithMostMatch(QuestionReader.GetQuestionwiseWords());
		 PrintResults(results);
		 
		 
	}
	private static void PrintResults(Result[] r)
	{
		for(int i = 0; i<r.length;i++)
		{
			System.out.println("For"+r[i].getQuestionNumber()+"chapter"+r[i].getChapterName());
		}
	}
}

