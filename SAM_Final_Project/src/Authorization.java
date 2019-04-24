import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by макс on 18.04.2019.
 */
public class Authorization extends JFrame {
    private JLabel labelEmpty = new JLabel("");
    private JLabel label = new JLabel("Login:");
    private JLabel label2 = new JLabel("Password:");
    private JTextField login = new JTextField();
    private JTextField password = new JTextField();
    private JButton enter = new JButton("Enter");
    private Authorization authorization;

    public Authorization() {
        super("Authorization");
        this.setBounds(300, 200, 270, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 3, 3));
        container.add(label);
        container.add(login);
        container.add(label2);
        container.add(password);
        container.add(labelEmpty);
        authorization = this;

        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeAuthorization(new AuthorizationCommand(authorization));
            }
        });
        container.add(enter);
    }

    private void executeAuthorization(Command command) {

        if (command.execute().equals("true")) {
            Bookmaker bookmaker = new Bookmaker(getLogin(), getPassword());
            bookmaker.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Login or password is incorrect", "Authorization's answer", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public String getLogin() {
        return login.getText();
    }

    public String getPassword() {
        return password.getText();
    }
}
