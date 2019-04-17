import java.util.Scanner;

/**
 * Created by макс on 27.03.2019.
 */
public class Task4 {
    public static void task(String iskomoe, String delta) {

        int[][] mas = new int[10][5];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                mas[i][j] = (int) (10 * Math.random());
                System.out.print(" " + mas[i][j]);
            }
            System.out.println();
        }

        System.out.println("First round");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (j != 0) {
                    break;
                }
                if (mas[i][j] == Integer.valueOf(iskomoe)) {
                    System.out.println("The coordinates are : [" + i + "][" + j + "]");
                }
            }
        }

        System.out.println("Second round");

        int count = 0;
        loop1:for (int i = 0; i < 10; i++) {
            loop2:for (int j = 0; j < 5; j++) {
                count++;
                if (mas[i][j] == Integer.valueOf(iskomoe)) {
                    System.out.println("Coordinates of item in massive: [" + i + "][" + j + "]\nIteration amount is:" + count + "");
                    break loop2;/* Использование "break loop2" позволяет покинуть цикл "loop2", т.е. найти
                    первое искомое число в строке и выйти из этой строки. Если написать "break loop1", то
                    при нахождении искомого элемента цикл "loop1" будет завершён.
                    */
                }
            }
        }

        System.out.println("Third round");

        Scanner scan = new Scanner(System.in);
        System.out.println("[x-delta;x+delta]\nEnter the number x:");
        int x = scan.nextInt();
        int counter = 0;

        for (int i = 0; i < 10; i++) {
            cont:for (int j = 0; j < 5; j++) {
                if (mas[i][j] >= x - Integer.valueOf(delta) && mas[i][j] <= x + Integer.valueOf(delta)) {
                    continue cont;
                }
                counter++;
            }
        }
        System.out.println("Amount of item which don't fall in massive is:" + counter);
    }
}
