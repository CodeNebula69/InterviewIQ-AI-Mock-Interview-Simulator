import java.util.List;

public class TechnicalQuestion extends Question {

    public TechnicalQuestion(String questionText, List<String> keywords) {
        super(questionText, keywords);
    }

    @Override
    public String getQuestionType() {
        return "Technical";
    }
}