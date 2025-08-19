import javax.swing.*;

class c2 {
    public static void main(String[] args) {
        // Create a new JFrame with title "Word Finder"
        JFrame frame = new JFrame("Word Finder");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Label for "Word:"
        JLabel label = new JLabel("Word:");
        label.setBounds(30, 30, 50, 20);
        frame.add(label);

        // Text field for input
        JTextField textField = new JTextField();
        textField.setBounds(80, 30, 150, 20);
        frame.add(textField);

        // Button for "Find Word"
        JButton button = new JButton("Find Word");
        button.setBounds(100, 70, 100, 30);
        frame.add(button);

        // Set frame visibility
        frame.setVisible(true);
    }
}
