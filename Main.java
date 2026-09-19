import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AI Interview Simulator =====");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter Skill: ");
        String skill = sc.nextLine();

        Candidate candidate =
                new Candidate(name, branch, skill);

        candidate.displayDetails();

        List<Question> questions =
                QuestionBank.getQuestions();

        InterviewSession session =
                new InterviewSession(candidate, questions);

        session.startInterview();
    }
}