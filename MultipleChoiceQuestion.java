import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question{
//    static int nQuestions = 0;
//    static int nCorrect = 0;
//    String question;
//    String correctAnswer;

    // Constructor for creating a new question
    public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        question = query + "\n";
        question += "A. " + a + "\n";
        question += "B. " + b + "\n";
        question += "C. " + c + "\n";
        question += "D. " + d + "\n";
        question += "E. " + e + "\n";
        correctAnswer = answer.toUpperCase();
        nQuestions++;
    }

    // Method to ask the user a question and validate the answer
    String ask(String question) {
        String answer = JOptionPane.showInputDialog(question);
        if (answer == null || answer.trim().equals("")) {
            return ask(question);
        }
        answer = answer.toUpperCase();
        if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
            return answer;
        }
        JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
        return ask(question);
    }
    

//    // Method to ask the question and check the user's answer
//    void check() {
//        String answer = ask(question);
//        if (answer.equals(correctAnswer)) {
//            nCorrect++;
//            JOptionPane.showMessageDialog(null, "Correct!");
//        } else {
//            JOptionPane.showMessageDialog(null, "Sorry, the correct answer is " + correctAnswer);
//        }
//    }
//
//    // Method to display the number of questions and correct answers
//    static void showResults() {
//    	JOptionPane.showMessageDialog(null, "You got " + nCorrect + " out of " + nQuestions + " questions correct.");
//    }
}
