
public class Result {
	private int questionNumber;
	private String chapterName;
	
	public Result(int questionNumber, String chapterName) {
		this.questionNumber = questionNumber;
		this.chapterName = chapterName;
	}
	
	public int getQuestionNumber() {
		return this.questionNumber;
	}
	
	public String getChapterName() {
		return this.chapterName;
	}
}
