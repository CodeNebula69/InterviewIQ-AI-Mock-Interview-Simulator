import java.util.List;

public abstract class Question {
    protected String questionText;
    protected List<String> keywords;

    public Question(String questionText, List<String> keywords) {
        this.questionText = questionText;
        this.keywords = keywords;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public abstract String getQuestionType();
}