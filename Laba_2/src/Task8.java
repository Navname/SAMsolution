import java.util.Arrays;

/**
 * Created by макс on 02.04.2019.
 */
public class Task8 {
    public static void task() {
        int[] mas = new int[4];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (10 + Math.random() * 90);
        }
        System.out.println(Arrays.toString(mas));

        boolean flag = true;
        int i=1;

        do{
            if (mas[i] <= mas[i - 1]) {
                flag = false;
                break;
            }
            i++;
        }while(i<mas.length);

        if (flag) {
            System.out.println("The massive is increasing");
        } else {
            System.out.println("The massive is not increasing");
        }
    }
}
