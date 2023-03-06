import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

	

	@Override
	String ask(String question) {
		String answer = JOptionPane.showInputDialog(question);
        if (answer == null || answer.trim().equals("")) {
            return ask(question);
	}
        if (answer.equals("f") || answer.equals("F") || answer.equals("false") || answer.equals("False") || answer.equals("FALSE") 
        || answer.equals("n") || answer.equals("N") || answer.equals("no") || answer.equals("No") || answer.equals("NO"))
        	return "FALSE";
        else if (answer.equals("t") || answer.equals("true") || answer.equals("True") || answer.equals("TRUE") || answer.equals("T") || answer.equals("y") 
        || answer.equals("yes") || answer.equals("Y") || answer.equals("Yes") || answer.equals("YES")) {
            return "TRUE";
        
        }
        
        
        JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
        return ask(question);
    }
	

}
