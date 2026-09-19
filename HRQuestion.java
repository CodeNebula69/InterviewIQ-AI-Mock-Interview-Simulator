import java.util.List;

public class HRQuestion extends Question {

    public HRQuestion(String questionText, List<String> keywords) {
        super(questionText, keywords);
    }

    @Override
    public String getQuestionType() {
        return "HR";
    }
}