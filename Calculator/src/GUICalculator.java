import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUICalculator extends JFrame implements ActionListener {
    private JTextField inputField;
    private double num1, num2, result;
    private char operator;

    public GUICalculator() {
        setTitle("Simple GUI Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.BOLD, 24));
        inputField.setEditable(false);
        inputField.setHorizontalAlignment(JTextField.RIGHT);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 24));
            button.addActionListener(this);
            panel.add(button);
        }

        setLayout(new BorderLayout());
        add(inputField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
            inputField.setText(inputField.getText() + command);
        } else if (command.charAt(0) == 'C') {
            inputField.setText("");
            num1 = num2 = result = 0;
            operator = '\0';
        } else if (command.charAt(0) == '=') {
            num2 = Double.parseDouble(inputField.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(this, "Error: Division by zero is undefined.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
            }

            inputField.setText(String.valueOf(result));
        } else {
            if (!inputField.getText().isEmpty()) {
                num1 = Double.parseDouble(inputField.getText());
                operator = command.charAt(0);
                inputField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUICalculator().setVisible(true);
            }
        });
    }
}
