import java.util.Scanner;

/**
 * Created by макс on 27.03.2019.
 */
public class Task6 {
    public static void task() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of lines in massive:");
        int index = scan.nextInt();
        String[][] mas = new String[index][index];

        int temp = 0;         //счётчик заполняющий пробелами строку слева
        int pmet = index - 1;   //счётчик заполняющий пробелами строку справа

        for (int i = 0; i < index; i++) {

            for (int j = 0; j < index; j++) {

                mas[i][j] = "*";//по умолчанию записываем '*'

                // Первую и последнюю строки не проверяем. Если j меньше или больше счётчиков, то записываем " ".
                if (i != 0 && i != index - 1 && (j < temp || j > pmet)) {
                    mas[i][j] = " ";
                }

                System.out.print(" " + mas[i][j]);
            }

            //проверки индексов элементов массива для изменения его заполнения
            if (i < (index - 1) / 2) {
                temp++;
                pmet--;
            } else if (i == (index - 1) / 2 && index % 2 == 0) {
                    temp = temp;
                    pmet = pmet;
                } else {
                    temp--;
                    pmet++;
                }
            System.out.println();
        }
    }
}

