import java.util.Arrays;

/**
 * Created by макс on 31.03.2019.
 */
public class Task5 {
    public static void task() {
        int[] mas = new int[4];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (10 + Math.random() * 90);
        }
        System.out.println(Arrays.toString(mas));

        boolean flag = true;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] <= mas[i - 1]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("The massive is increasing");
        } else {
            System.out.println("The massive is not increasing");
        }

    }
}
