import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            // Step 1: Ask the user to input their name
            String name = JOptionPane.showInputDialog(null, "What is your name?", "Input", JOptionPane.QUESTION_MESSAGE);

            // If user cancels input dialog, exit program
            if (name == null) {
                break;
            }

            // Step 2: Ask for confirmation
            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want your name to be shown?",
                    "Confirmation",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            // Step 3: Show name if confirmed
            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Message", JOptionPane.INFORMATION_MESSAGE);
                break; // Exit after showing name
            } else if (confirm == JOptionPane.CANCEL_OPTION || confirm == JOptionPane.CLOSED_OPTION) {
                break; // Exit program
            }
            // If "No", the loop continues, and user is asked again
        }
    }
}
