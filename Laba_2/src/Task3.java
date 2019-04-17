import java.util.Scanner;

/**
 * Created by макс on 17.03.2019.
 */
public class Task3 {
    public static void task() {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Vvedite chislo:");
            String in = scan.next();

            try {
                int a = Integer.valueOf(in);
                boolean temp = true;

                for (int i = 2; i < a; i++) {

                    if (a % i == 0) {
                        temp = false;
                        break;
                    }
                }

                if (!temp) {
                    System.out.println("Chislo " + a + " -ne prostoe");

                } else {
                    System.out.println("Chislo " + a + " -prostoe");
                }
            }
            catch (java.lang.NumberFormatException e){
                System.out.println("Konec");
                break;
            }
        }
    }
}
