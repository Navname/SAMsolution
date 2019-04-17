package util;

/**
 * Created by макс on 27.02.2019.
 */
public class Money {
    public Money() {
    }

    public static void formatMoney(int money) {
        if (money < 0) {
            System.out.println("Input  is incorrect!");
            return;
        }
        if ((money % 100 >= 10) && (money % 100 <= 19)) {
            System.out.println(money + " rublei");
            return;
        }
        if (money % 10 == 1) {
            System.out.println(money + " rubl");
            return;
        }
        if ((money % 10 >= 2) && (money % 10 <= 4)) {
            System.out.println(money + " rublya");
            return;
        }
        System.out.println(money + " rublei");
    }

    public static void isLeapYear(int year) {
        if (year % 4 == 0) {
            if ((year % 400 == 0) || (year % 100 != 0)) {
                System.out.println(year + " Yes");
            } else {
                System.out.println(year + " No");
            }
        } else {
            System.out.println(year + " No");
        }
    }

    public static int[] linearizeArray(int[][] mas) {
        int[] newMas = new int[mas.length * mas[0].length];
        int temp = 0;
        for (int i = 0; i < mas.length; i++)
            for (int j = 0; j < mas[i].length; j++) {
                newMas[temp] = mas[i][j];
                temp++;
            }
        return newMas;
    }
}