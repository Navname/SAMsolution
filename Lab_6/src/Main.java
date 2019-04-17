/**
 * Created by макс on 12.03.2019.
 */

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        task6();
    }

    private static void task6() {
    }

    private static void task5() {
        try (BufferedReader br = new BufferedReader(new FileReader("C://Practice//notes.txt"))) {
            int c;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void task4() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C://Practice//notes.txt"));
            int c;

            while ((c = br.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static void task3() {
        try {
            FileInputStream fin = new FileInputStream("C://Practice//notes.txt");
            System.out.printf("File size: %d bytes \n", fin.available());

            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void task2() {

        try {
            FileInputStream fin = new FileInputStream("C://Practice//notes2.txt");
            System.out.printf("File size: %d bytes \n", fin.available());

            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Not found!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void task1() {
        ArrayList<String> arr = new ArrayList<String>();
        Collections.addAll(arr, "hello", "world", "mouse", "chair", null, "free", null, "window");

        for (int i = 0; i < arr.size(); i++) {

            try {
                System.out.println(arr.get(i) + " " + arr.get(i).hashCode());
            } catch (NullPointerException e) {
                System.out.println("Null linked");
            }
        }
    }
}
