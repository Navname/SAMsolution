import java.util.Arrays;
import java.util.List;

/**
 * Created by макс on 05.04.2019.
 */
public class Main {
    public static void main(String[] args) {
        //  Task1   //
        //1.	Написать функциональный интерфейс с методом, который принимает число и возвращает булево значение.
        // Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает true если переданное число
        // делится без остатка на 13.

        Task1 t = (int var) ->
                var % 13 == 0;


        boolean result = t.check(26);
        System.out.println(result);

        //  Task2   //
        // 2.	Написать функциональный интерфейс с методом, который принимает две строки и возвращает тоже строку.
        // Написать реализацию такого интерфейса в виде лямбды, которая возвращает ту строку, которая длиннее.

        Task2 t2;
        t2 = (String s1, String s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            } else if (s2.length() > s1.length()) {
                return s2;
            } else {
                return "Rows are equivalent";
            }
        };

        System.out.println(t2.check("1234567", "1234567"));

        //   Task3  //
        //3.	Написать функциональный интерфейс с методом, который принимает три дробных числа: a, b, c и возвращает
        // тоже дробное число. Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает дискриминант.

        Task3 t3 = (d1, d2, d3) -> d2 * d2 - 4 * d1 * d3;
        System.out.println(t3.check(2.7, 15.4, 7.3));

        //  Task4   //
        //4.	Arrays.asList(«a1», «a4», «a3», «a2», «a1», «a4», «b1», «b2»)
        //•	Найти существуют ли хоть один «a1» элемент в коллекци
        //•	Найти есть ли символ «2» у всех элементов коллекции
        //•	Проверить что не существуют ни одного «a7» элемента в коллекции
        //•	Добавить "_1" к каждому элементу коллекции
        //•	Убрать первый символ и вернуть массив чисел (int[])
        //•	получить все числа, перечисленные через запятую из всех элементов
        //•	Отсортировать коллекцию строк по алфавиту
        //•	Отсортировать коллекцию строк по алфавиту в обратном порядке
        //•	Отсортировать коллекцию строк по алфавиту и убрать дубликаты
        //•	Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты
        //•	Добавить к каждому элементу коллекции _new  с помощью foreach
        //•	Объединить все элементы в одну строку через разделитель: и обернуть тегами <b>… </b>
        //•	Преобразовать в map, сгруппировав по первому символу строк

        List<String> list1 = Arrays.asList("a1", "a4", "a3", "a5", "a1", "a4", "b1", "b2");

        //Predicate <String> s1 = (sp)->sp.equals("a1");
        boolean exist = list1.stream().anyMatch((sp) -> sp.equals("a1"));

        /*
        Predicate <String> s2 = (str)->{
            String[] temp = str.split("");
            for(String tt:temp){
                if(tt.equals("2"))return true;
            }
            return false;
        };
        */

        boolean exist2 = list1.stream().anyMatch((str) -> {
            String[] temp = str.split("");
            for (String tt : temp) {
                if (tt.equals("2")) return true;
            }
            return false;
        });

        System.out.println(exist2);

        boolean exist3 = list1.stream().noneMatch((ss4) -> ss4.equals("a7"));
        System.out.println(exist3);
    }
}
