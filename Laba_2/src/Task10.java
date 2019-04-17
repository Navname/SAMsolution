/**
 * Created by макс on 03.04.2019.
 */
public class Task10 {
    public static void task() {
        String[] mas = new String[52];
        int count = 0;

        for (int j = 0; j < mas.length; j++) {

            String temp = Task9.task();

            for (int i = 0; i < mas.length; i++) {

                if (temp.equals(mas[i])) {
                    temp = Task9.task();
                    i = -1;
                }

            }
            mas[j] = temp;

            System.out.print(j + " " + mas[j] + "   ");
            count++;

            if (count % 13 == 0) {
                System.out.println();
            }
        }
    }
}
