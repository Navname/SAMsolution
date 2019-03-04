package com.company;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String contin = "y";
        while (contin.equals("y")) {
            System.out.print("Enter the number of task from Lab1:");
            String choice = scan.next();
            switch (choice) {
                case "1":
                    task1();
                    break;
                case "2":
                    task2();
                    break;
                case "3":
                    task3();
                    break;
                case "4":
                    task4();
                    break;
                case "5":
                    task5();
                    break;
                case "6":
                    task6();
                    break;
                case "7":
                    task7();
                    break;
                case "8":
                    task8();
                    break;
            }
            System.out.println("Will you select some other task?(Press 'y' for select)");
            contin = scan.next();
        }
        System.out.println("The end of the first lab!");
    }

    private static void task8() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        int length = scan.nextInt();
        System.out.print("Enter the width of rectangle:");
        int width = scan.nextInt();
        System.out.print("Enter the outline symbol:");
        String out = scan.next();
        System.out.print("Enter the inner symbol:");
        String in = scan.next();
        String[][] mas = new String[width][length];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || j == 0 || i == mas.length - 1 || j == length - 1) {
                    mas[i][j] = out;
                } else {
                    mas[i][j] = in;
                }
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void task7() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A:= ");
        int a = scan.nextInt();
        System.out.print("Enter B:= ");
        int b = scan.nextInt();
        if (a >= b) {
            System.out.println("Input error!");
        } else {
            int temp = b - a + 1;
            int[] mas = new int[temp];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = a++;
                int m = mas[i];// The variable check how much times the number will be output.
                while (m != 0) {
                    System.out.print(mas[i]);
                    m--;
                }
                System.out.println();
            }
        }
    }


    private static void task6() {
        Scanner scan = new Scanner(System.in);
        String str = "y";
        while (str.equals("y")) {
            System.out.println("Enter the ticket's number:");
            int ticket = scan.nextInt();
            int length = String.valueOf(Math.abs(ticket)).length();// Find out amount of numeral in the number.
            if (length == 6) {
                String[] tickArr = String.valueOf(ticket).split("");
                int sum1 = 0, sum2 = 0;
                for (int i = 0, j = 3; i < 3; i++, j++) {
                    sum1 += Integer.valueOf(tickArr[i]);
                    sum2 += Integer.valueOf(tickArr[j]);
                }
                if (sum1 == sum2) {
                    System.out.println("Your ticket is lucky!");
                    break;
                } else {
                    System.out.println("This ticket isn't lucky, will you check other ticket?(Press 'y' for agree)");
                    str = scan.next();

                }
            } else {
                System.out.println("The number of ticket is incorrect! " +
                        "\nWill you check other ticket?(Press 'y' for agree)");
                str = scan.next();
            }
        }
        System.out.println("The end of program.");
    }


    private static void task5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        List<Integer> arr = new ArrayList<Integer>();
        int count = 0;
        double sum = 0;
        while (scan.hasNextInt()) {
            int temp = scan.nextInt();
            if (temp != 0) {
                arr.add(temp);
                count++;
                sum += temp;
            } else break;
        }
        double aver = sum / count;
        System.out.println("\nAmount=" + count + "\nSum=" + sum + "\nAverage=" + aver);
    }

    private static void task4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a deposit:");
        double deposit = scan.nextDouble();
        double finalDeposit = deposit * 2;
        System.out.println("Enter the size of interest rate in %:");
        double rate = scan.nextDouble();
        rate /= 100;
        int count = 0;
        // Keeping money in the bank while the sum of deposit and rates is less, or equals than two deposits.
        while (deposit <= finalDeposit) {
            deposit = deposit + (deposit * rate);
            count++;
        }
        System.out.println("After " + count + " months your deposit will be: " + deposit);
    }

    private static void task3() {
        // Create array with the output units.
        String[] mas = {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"
                , "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"
                , "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"
                , "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number (from 100 to 999):");
        String num = scan.next();
        // Create an array from input number.
        String[] numArr = num.split("");
        int[] numInt = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            numInt[i] = Integer.valueOf(numArr[i]);
        }
        // If the number ends with two zeros.
        if (numInt[1] == numInt[2] && numInt[1] == 0) {
            for (int i = 1; i < 10; i++) {
                if (numInt[0] == i) {
                    System.out.println("Your number is:" + mas[i - 1]);
                }
            }
        } else
            // If there are numbers like 11, 12, 15, 17...:
            if (numInt[1] == 1 && numInt[2] != 0) {
                for (int i = 1; i < 10; i++) {
                    for (int j = 1; j < 10; j++) {
                        if (numInt[0] == i && numInt[2] == j) {
                            System.out.println("Your number is:" + mas[i - 1] + " " + mas[j + 8]);
                        }
                    }
                }
            } else {
                for (int e = 1; e < 10; e++) {
                    for (int i = 1; i < 10; i++) {
                        // If number ends by zero.
                        if (numInt[0] == e && numInt[1] == i && numInt[2] == 0) {
                            System.out.println("Your number is:" + mas[e - 1] + " " + mas[i + 17]);
                        }
                        for (int j = 1; j < 10; j++) {
                            if (numInt[0] == e && numInt[1] == i && numInt[2] == j) {
                                // Other numbers.
                                System.out.println("Your number is:" + mas[e - 1] + " " + mas[i + 17] + " " + mas[j + 26]);
                            }
                        }
                    }
                }
            }


    }


    private static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coordinates of the three points one by one, after comma (x1,y1),(x2,y2),(x3,y3). \nFor example 0,1,3,5,9,0  :");
        String points = scan.nextLine();
        String[] pArr;
        pArr = points.split(",");// Splitting the "nextLine" and put it in array.
        Integer[] temp = new Integer[pArr.length];
        Integer[] pArrInt = stringToInt(pArr, temp);// Converting string array to int array.
        BigDecimal[] tempD = new BigDecimal[pArr.length / 2];
        BigDecimal[] D = D(pArrInt, tempD);// Getting the distances between points.
        for (int i = 1; i <= D.length; i++) {
            System.out.println(" D[" + i + "]=" + D[i - 1]);
        }
        Double square = square(D);
        System.out.println("Square:" + square);
        System.out.println("The end.");

    }

    // Method which convert string to int.
    public static Integer[] stringToInt(String[] arr, Integer[] arr2) {
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.valueOf(arr[i]);
        }
        return arr2;
    }

    // Method for getting distances.
    public static BigDecimal[] D(Integer[] arg, BigDecimal[] D) {
        System.out.println("Distances:");
        for (int i = 0, j = 0, e = 1; i <= arg.length / 2 && j < D.length - 1 && e < arg.length - 1; i += 2, j++, e += 2) {
            D[j] = new BigDecimal(sqrt(pow((arg[i + 2] - arg[i]), 2) + pow((arg[e + 2] - arg[e]), 2)));
        }
        D[D.length - 1] = new BigDecimal(sqrt(pow((arg[arg.length - 2] - arg[0]), 2) + pow((arg[arg.length - 1] - arg[1]), 2)));
        return D;
    }

    public static Double square(BigDecimal[] dist) {
        BigDecimal p = new BigDecimal(0);
        for (int i = 0; i < dist.length; i++) {
            p = p.add(dist[i]);
        }
        BigDecimal temp = new BigDecimal(2);
        System.out.println("Perimetr=" + String.valueOf(p));
        p = p.divide(temp);
        BigDecimal s = p.multiply(p.subtract(dist[0]).multiply(p.subtract(dist[1])).multiply(p.subtract(dist[2])));
        Double str = Double.valueOf(String.valueOf(s));
        str = sqrt(str);
        return str;
    }


    private static void task1() {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("e")) {
            System.out.print("Enter the temperature in Fahrenheits: ");
            int tempF = scan.nextInt();
            // Write this formula  Cels=(Far-32)*5/9  for Decimal variables.
            BigDecimal tempC = new BigDecimal(tempF - 32).multiply(new BigDecimal(5).divide(new BigDecimal(9), 4, BigDecimal.ROUND_HALF_UP));
            System.out.println("The temperature in Celsius: " + tempC.setScale(0, BigDecimal.ROUND_HALF_UP));
            System.out.println("Want to continue?(Press 'e' to exit): ");
            answer = scan.next();
        }
    }
}
