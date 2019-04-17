/**
 * Created by макс on 27.02.2019.
 */

import util.Belarus;
import util.Money;

public class Main {
    public static void main(String[] args) {
        Belarus c = new Belarus();

        c.fullInfo();
        c.shortInfo();

        Money.formatMoney(34);
        Money.formatMoney(12);
        Money.formatMoney(71);
        Money.formatMoney(100);
        Money.formatMoney(1);

        Money.isLeapYear(2011);
        Money.isLeapYear(2012);
        Money.isLeapYear(2014);
        Money.isLeapYear(2016);


        int[][] mas = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                mas[i][j] = (int) (Math.random() * 100);
            }
        }

        int[] newMas = Money.linearizeArray(mas);

        int temp = 0;
        for (int n : newMas) {
            temp++;
            System.out.print(n + " ");
            if( temp%5 == 0){
                System.out.println();
            }
        }
    }
}
