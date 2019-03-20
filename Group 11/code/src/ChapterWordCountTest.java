import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChapterWordCountTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	

	@Test
	public void FindChapterWithMostMatch_case_result() {
		ChapterWordCount[] chapters = new ChapterWordCount[2];
		chapters[0] = new ChapterWordCount("Chapter 1");
		chapters[0].addCount("Hello");
		chapters[0].addCount("Hello");
		chapters[0].addCount("World");
		chapters[0].addCount("World");
		
		chapters[1] = new ChapterWordCount("Chapter 2");
		chapters[1].addCount("Hello");
		chapters[1].addCount("Hello");
		chapters[1].addCount("myself");
		
		ChapterWordCountContainer container = new ChapterWordCountContainer(chapters);
		
		QuestionPaperWords[] qpWords = new QuestionPaperWords[1];
		
		qpWords[0] = new QuestionPaperWords();
		String[] questionWords = {"Hello", "myself"};
		qpWords[0].AddQuestionWord(questionWords);
		
		
		Result[] results = container.FindChapterWithMostMatch(qpWords);
		
		assertEquals(1, results.length);
		
		assertEquals(0, results[0].getQuestionNumber());
		assertEquals("Chapter 2", results[0].getChapterName());
		
		
	}
}
