
import javax.swing.JOptionPane;

public class ATM {
    public static void main(String[] args) {
        // Display a welcome message in a dialog box
        String message = "Hazira's Bank ATM Service\n\nWelcome\nHave a nice day! <3";
        JOptionPane.showMessageDialog(null, message, "ATM Welcome", JOptionPane.INFORMATION_MESSAGE);
    }
}