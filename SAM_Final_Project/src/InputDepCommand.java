import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputDepCommand extends JDialog {
    private JLabel label = new JLabel("Enter deposit:");
    private JTextField text = new JTextField();
    private JButton button = new JButton("Enter");
    private String answer = "";
    private Double bank;

    public InputDepCommand(Double bank) {
        this.setTitle("Deposit");
        this.setBounds(300, 200, 270, 150);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.bank = bank;

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 1, 3, 3));
        container.add(label);
        container.add(text);
        container.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer = text.getText();
                if (bank < Double.valueOf(answer)) {
                    JOptionPane.showMessageDialog(null, "There is not enough money in the bank!", "Deposit's answer", JOptionPane.PLAIN_MESSAGE);
                    answer = "0";
                } else {
                    JOptionPane.showMessageDialog(null, "Bet made successfully!\nGood luck!", "Deposit's answer", JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                }
            }
        });
    }

    public Double getAnswer() {
        return Double.valueOf(answer);
    }
}
