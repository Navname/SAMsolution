/**
 * Created by макс on 17.03.2019.
 */


public class Main {
    public static void main(String[] args) {

        /*
        Для запуска из командной строки:
        E:\Laba_2\src\com\company>javac Main.java
        E:\Laba_2\src>java.exe com.company.Main [номер задания(для 4-го задания передать 3 параметра)]
         */

        for (String arg : args) {
            System.out.println("Parametr = " + arg);
        }
        if (args.length > 0) {
            switch (args[0]) {
                case "1":
                    Task1.task();
                    break;
                case "2":
                    Task2.task();
                    break;
                case "3":
                    Task3.task();
                    break;
                case "4":
                    Task4.task(args[1], args[2]);
                    break;
                case "5":
                    Task5.task();
                    break;
                case "6":
                    Task6.task();
                    break;
                case "7":
                    Task7.task();
                    break;
                case "8":
                    Task8.task();
                    break;
                case "9":
                    System.out.println(Task9.task());
                    break;
                case "10":
                    Task10.task();
                    break;
            }

        }
    }
}
