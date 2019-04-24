import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by макс on 19.04.2019.
 */
public class AuthorizationCommand extends Command {
    public AuthorizationCommand(Authorization authorization) {
        super(authorization);
    }

    @Override
    public String execute() {
        String flag = "false";

        try (BufferedReader in = new BufferedReader(new FileReader("E:\\SAM solutions\\Examples\\Users.txt"))) {
            String[] user = new String[4];
            String line;

            loop:
            while ((line = in.readLine()) != null) {
                user = line.split(" ");

                for (int i = 0; i < user.length; i++) {

                    if (authorization.getLogin().equals(user[1]) && authorization.getPassword().equals(user[2])) {
                        flag = "true";
                        break loop;
                    } else {
                        flag = "false";
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return flag;
    }
}
