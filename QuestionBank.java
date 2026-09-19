import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionBank {

    public static List<Question> getQuestions() {

        List<Question> questions = new ArrayList<>();

        questions.add(new TechnicalQuestion(
                "What is OOP?",
                Arrays.asList("object", "class", "inheritance", "polymorphism")
        ));

        questions.add(new TechnicalQuestion(
                "What is Inheritance?",
                Arrays.asList("parent", "child", "reuse", "extends")
        ));

        questions.add(new HRQuestion(
                "Tell me about yourself.",
                Arrays.asList("student", "skills", "education")
        ));

        questions.add(new HRQuestion(
                "Why should we hire you?",
                Arrays.asList("skills", "hardworking", "team")
        ));

        return questions;
    }
}