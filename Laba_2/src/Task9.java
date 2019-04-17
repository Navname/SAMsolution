/**
 * Created by макс on 02.04.2019.
 */
public class Task9 {
    public static String task() {
        String[] map={"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
        String[] color={"Hearts","Spades","Clubs","Diamonds"};

        return map[(int)(Math.random()*13)]+" of "+color[(int)(Math.random()*4)];
    }
}
