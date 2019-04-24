import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by макс on 19.04.2019.
 */

public class Bookmaker extends JFrame {
    private JLabel labels;
    private JButton makeBetButton = new JButton("Make a Bet!");
    private JRadioButton radioButton = new JRadioButton();
    private ButtonGroup group = new ButtonGroup();
    private Container myContainer;
    private String bank = "";
    private Integer rows = 3;
    private String login;
    private String password;
    private Map<Integer, Integer> map = new HashMap<>();

    public Bookmaker(String login, String password) {
        super("Bookmaker");
        this.setBounds(300, 200, 1000, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.login = login;
        this.password = password;

        try (BufferedReader in = new BufferedReader(new FileReader("E:\\SAM solutions\\Examples\\Events.txt"))) {
            String[] event = new String[5];
            String line;

            myContainer = new Container();
            myContainer = this.getContentPane();
            myContainer.setLayout(new GridLayout(rows, 6, 3, 3));
            Bookmaker bookmaker = this;
            int numberOfRadioButton = 0;

            Integer index = 0;
            while ((line = in.readLine()) != null) {
                event = line.split("#");

                for (int i = 0; i < event.length; i++) {

                    if (i == 3 || i == 4) {
                        numberOfRadioButton++;
                        radioButton = new JRadioButton(event[i]);
                        group.add(radioButton);
                        myContainer.add(radioButton);
                        map.put(numberOfRadioButton, index);
                    } else {
                        labels = new JLabel(event[i]);
                        myContainer.add(labels);
                    }
                    index++;
                }

                if (index == 5) {
                    makeBetButton = new JButton("Make a Bet!");
                    myContainer.add(makeBetButton);
                    index++;
                } else {
                    if (index != 11 && (index - 1) % 5 == 0) {
                        labels = new JLabel("");
                        myContainer.add(labels);
                        index++;
                    }
                }
                if (index == 11) {

                    try (BufferedReader in2 = new BufferedReader(new FileReader("E:\\SAM solutions\\Examples\\Users.txt"))) {
                        String[] user;
                        String line2;

                        while ((line2 = in2.readLine()) != null) {

                            user = line2.split(" ");
                            if (login.equals(user[1]) && password.equals((user[2]))) {
                                bank = user[3];
                            }
                        }

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    labels = new JLabel("Bank: " + bank);
                    myContainer.add(labels);
                    index++;
                }
            }

            makeBetButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    executeCommand(new MakeABetCommand(bookmaker));
                }
            });
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Double getBank() {

        try (BufferedReader in2 = new BufferedReader(new FileReader("E:\\SAM solutions\\Examples\\Users.txt"))) {
            String[] user;
            String line2;

            while ((line2 = in2.readLine()) != null) {

                user = line2.split(" ");
                if (login.equals(user[1]) && password.equals((user[2]))) {
                    bank = user[3];
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return Double.valueOf(bank);
    }

    public Container getMyContainer() {
        return myContainer;
    }

    public Map getMap() {
        return map;
    }

    private void executeCommand(Command command) {
        if (command.execute().equals("true")) System.out.println(command + " is execute!");
    }

}
