package lesson14;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {
    private JLabel display;
    private JPanel panel;
    private boolean start;
    private String lastCommand;
    private double result;


    public MainPanel() {
        Border solidBorder = BorderFactory.createLineBorder(Color.GRAY, 1);
        display = new JLabel("0");
        display.setPreferredSize(new Dimension(300, 35));
       // display.setBorder(solidBorder);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);

        start = true;
        lastCommand = "=";
        result = 0;

        panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));

        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", command);

        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", command);

        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);

        addButton("0", insert);
        addButton(".", insert);
        addButton("=", command);
        addButton("+", command);

        add(panel, BorderLayout.CENTER);

    }

    private void addButton(String label, ActionListener listener) {
       JButton button = new JButton(label);
       button.setFont(new Font("Arial", Font.BOLD, 14));
       panel.add(button);
       button.addActionListener(listener);
       panel.add(button);
    }

    private class InsertAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();
            if (start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        }
    }

    private class CommandAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (start) {
                if (command.equals("-")) {
                    display.setText(command);
                }
                else lastCommand = command;
            }
            else {
                calculate(Double.parseDouble(display.getText()));
                lastCommand = command;
                start = true;
            }
        }
    }

    public void calculate(double x) {
        if (lastCommand.equals("+")) result += x;
        else if (lastCommand.equals("-")) result -= x;
        else if (lastCommand.equals("*")) result *= x;
        else if (lastCommand.equals("/")) result /= x;
        else if (lastCommand.equals("=")) result = x;
        display.setText("" + result);
    }

}
