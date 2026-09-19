public class EvaluationEngine {

    public static int evaluateAnswer(Question question, String answer) {

        answer = answer.toLowerCase();

        // ----------------------------
        // 1. Keyword Matching (50 Marks)
        // ----------------------------

        int keywordMatches = 0;

        for (String keyword : question.getKeywords()) {
            if (answer.contains(keyword.toLowerCase())) {
                keywordMatches++;
            }
        }

        int keywordScore =
                (keywordMatches * 50) / question.getKeywords().size();

        // ----------------------------
        // 2. Answer Length (25 Marks)
        // ----------------------------

        int lengthScore;

        if (answer.length() > 80) {
            lengthScore = 25;
        }
        else if (answer.length() > 40) {
            lengthScore = 15;
        }
        else {
            lengthScore = 5;
        }

        // ----------------------------
        // 3. Sentence Quality (25 Marks)
        // ----------------------------

        String[] words = answer.trim().split("\\s+");

        int sentenceScore;

        if (words.length >= 15) {
            sentenceScore = 25;
        }
        else if (words.length >= 8) {
            sentenceScore = 15;
        }
        else {
            sentenceScore = 5;
        }

        // ----------------------------
        // Score Breakdown
        // ----------------------------

        System.out.println("\n----- Evaluation Report -----");
        System.out.println("Keyword Score : " + keywordScore + "/50");
        System.out.println("Length Score  : " + lengthScore + "/25");
        System.out.println("Quality Score : " + sentenceScore + "/25");

        int finalScore =
                keywordScore +
                lengthScore +
                sentenceScore;

        System.out.println("Final Score   : " + finalScore + "/100");

        return finalScore;
    }
}