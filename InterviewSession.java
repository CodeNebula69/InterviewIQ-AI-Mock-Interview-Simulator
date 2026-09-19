import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InterviewSession {

    private Candidate candidate;
    private List<Question> questions;
    private int totalScore = 0;

    public InterviewSession(Candidate candidate,
                            List<Question> questions) {

        this.candidate = candidate;
        this.questions = questions;
    }

    public void startInterview() {

        Scanner sc = new Scanner(System.in);

        String interviewId =
                "INT" + (1000 + (int)(Math.random() * 9000));

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(
                        "dd-MM-yyyy HH:mm:ss");

        System.out.println("\n=================================");
        System.out.println("       INTERVIEW STARTED");
        System.out.println("=================================");

        System.out.println("Interview ID   : "
                + interviewId);

        System.out.println("Candidate Name : "
                + candidate.getName());

        System.out.println("Branch         : "
                + candidate.getBranch());

        System.out.println("Skill          : "
                + candidate.getSkill());

        System.out.println("Date & Time    : "
                + now.format(formatter));

        System.out.println("=================================");

        int questionNumber = 1;

        for (Question q : questions) {

            System.out.println("\n---------------------------------");

            System.out.println("Question "
                    + questionNumber
                    + " of "
                    + questions.size());

            System.out.println("Type : "
                    + q.getQuestionType());

            System.out.println("---------------------------------");

            System.out.println(q.getQuestionText());

            System.out.print("\nYour Answer: ");

            String answer = sc.nextLine();

            int score =
                    EvaluationEngine.evaluateAnswer(
                            q,
                            answer);

            totalScore += score;

            System.out.println();

            if (score >= 85)
                System.out.println(
                        "Feedback : Excellent Answer");

            else if (score >= 70)
                System.out.println(
                        "Feedback : Good Answer");

            else if (score >= 50)
                System.out.println(
                        "Feedback : Average Answer");

            else
                System.out.println(
                        "Feedback : Needs Improvement");

            questionNumber++;
        }

        displayResult();
    }

    private void displayResult() {

        int maxScore = questions.size() * 100;

        double percentage =
                ((double) totalScore /
                        maxScore) * 100;

        System.out.println("\n=================================");
        System.out.println("          FINAL RESULT");
        System.out.println("=================================");

        System.out.println("Candidate Name : "
                + candidate.getName());

        System.out.println("Branch         : "
                + candidate.getBranch());

        System.out.println("Skill          : "
                + candidate.getSkill());

        System.out.println("---------------------------------");

        System.out.println("Total Score : "
                + totalScore
                + "/"
                + maxScore);

        System.out.printf(
                "Percentage  : %.2f%%\n",
                percentage);

        if (percentage >= 85) {

            System.out.println(
                    "Performance : Excellent");

            System.out.println(
                    "Recommendation : Interview Ready");
        }

        else if (percentage >= 70) {

            System.out.println(
                    "Performance : Very Good");

            System.out.println(
                    "Recommendation : Needs More Practice");
        }

        else if (percentage >= 50) {

            System.out.println(
                    "Performance : Good");

            System.out.println(
                    "Recommendation : Improve Technical Skills");
        }

        else {

            System.out.println(
                    "Performance : Needs Improvement");

            System.out.println(
                    "Recommendation : Practice HR and Technical Questions");
        }
    }
}
