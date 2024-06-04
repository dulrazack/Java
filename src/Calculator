import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private double firstNumber = 0;
    private double secondNumber = 0;
    private String operator = "";
    private boolean isOperatorClicked = false;

    public Calculator() {
        // Set up the frame
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create display field
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        // Create panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        // Button labels
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        // Add buttons to panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        // Add panel to frame
        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
            if (isOperatorClicked) {
                display.setText(command);
                isOperatorClicked = false;
            } else {
                display.setText(display.getText() + command);
            }
        } else if (command.equals("C")) {
            display.setText("");
            firstNumber = 0;
            secondNumber = 0;
            operator = "";
        } else if (command.equals("=")) {
            secondNumber = Double.parseDouble(display.getText());
            switch (operator) {
                case "+":
                    display.setText(String.valueOf(firstNumber + secondNumber));
                    break;
                case "-":
                    display.setText(String.valueOf(firstNumber - secondNumber));
                    break;
                case "*":
                    display.setText(String.valueOf(firstNumber * secondNumber));
                    break;
                case "/":
                    if (secondNumber != 0) {
                        display.setText(String.valueOf(firstNumber / secondNumber));
                    } else {
                        display.setText("Error");
                    }
                    break;
            }
            firstNumber = 0;
            secondNumber = 0;
            operator = "";
        } else {
            if (!operator.isEmpty()) {
                return;
            }
            firstNumber = Double.parseDouble(display.getText());
            operator = command;
            isOperatorClicked = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
