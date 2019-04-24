import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;

/**
 * Created by макс on 19.04.2019.
 */
public class MakeABetCommand extends Command {

    public MakeABetCommand(Bookmaker bookmaker) {
        super(bookmaker);
    }

    @Override
    public String execute() {
        for (int i = 1; i < bookmaker.getMap().size() + 1; i++) {

            Container container = bookmaker.getMyContainer();
            Map map = bookmaker.getMap();
            Integer indexInContainer = (Integer) map.get(i);
            JRadioButton radioButton = (JRadioButton) container.getComponent(indexInContainer);

            if (radioButton.isSelected()) {
                Double coefficient = Double.valueOf(radioButton.getText());
                InputDepCommand dialog = new InputDepCommand(bookmaker.getBank());

                dialog.setModal(true);
                dialog.show();

                Double deposit = dialog.getAnswer();
                String newBank = String.valueOf(bookmaker.getBank() - deposit);

                try (BufferedReader in = new BufferedReader(new FileReader("E:\\SAM solutions\\Examples\\Users.txt"))) {
                    String[] user;
                    String line;

                    while ((line = in.readLine()) != null) {

                        user = line.split(" ");

                        if (bookmaker.getLogin().equals(user[1]) && bookmaker.getPassword().equals(user[2])) {
                            try (RandomAccessFile f = new RandomAccessFile("E:\\SAM solutions\\Examples\\Users.txt", "rw")) {

                                Double nBank = Double.valueOf(newBank);
                                int value = (int) (Math.random() * 100);
                                System.out.println("Coefficient: " + coefficient + "\nValue: " + value);

                                if (value > 50) {
                                    newBank = String.valueOf((deposit * coefficient) + nBank + deposit);
                                    JOptionPane.showMessageDialog(null, "Congratulations, you won!", "Game", JOptionPane.PLAIN_MESSAGE);
                                }
                                if (value <= 50) {
                                    JOptionPane.showMessageDialog(null, "Sorry, you lose.", "Game", JOptionPane.PLAIN_MESSAGE);
                                }
                                f.writeBytes(user[0] + " " + user[1] + " " + user[2] + " " + newBank + " # ");

                                JLabel bankLabel = (JLabel) container.getComponent(11);
                                bankLabel.setText("Bank: " + newBank);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                dialog.dispose();
            }
        }
        return "true";
    }
}
