/**
 * Created by макс on 19.04.2019.
 */
public abstract class Command {
    public Authorization authorization;
    public Bookmaker bookmaker;
    public String login;
    public String password;


    Command(Authorization authorization) {
        this.authorization = authorization;
    }

    Command(Bookmaker bookmaker) {
        this.bookmaker = bookmaker;
    }

    public abstract String execute();
}
