import javax.swing.JOptionPane;

public abstract class Question {
	static int nQuestions = 0;
    static int nCorrect = 0;
    String question;
    String correctAnswer;

    void check() {
        String answer = ask(question);
        if (answer.equals(correctAnswer)) {
            nCorrect++;
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, the correct answer is " + correctAnswer);
        }
    }
    
    static void showResults() {
    	JOptionPane.showMessageDialog(null, "You got " + nCorrect + " out of " + nQuestions + " questions correct.");
    }
    abstract String ask(String question2);

}
