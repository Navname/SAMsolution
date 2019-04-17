/**
 * Created by макс on 18.03.2019.
 */
public class Main {
    public static void main(String[] args) {
                Pair<String> p1 = new Pair<String>("max", 2015);

                String p1fio = p1.getFio();
                int p1Year=p1.getYear();
                System.out.println(p1fio+ " - FIO\n"+p1Year+" - Year");

                Pair<String> p2 = new Pair<String>("matvey", 1999);
                String p2fio = p2.getFio();
                int p2Year=p2.getYear();
                System.out.println(p2fio+" "+p2Year);

                int[] res=p2.convert(p2fio);
                p2.disconvert(res);

//        PairNew<Integer, String>
//        PairNew<String, String>
    }
}
