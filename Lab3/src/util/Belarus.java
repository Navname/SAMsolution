package util;

import java.util.ArrayList;

/**
 * Created by макс on 27.02.2019.
 */
public final class Belarus {
    public static final String DATE = "19 sept 1991";
    public static final String STOLICA = "Minsk";
    public static final String DEN_ED = "BelRub";

    public static final class Lang {
        public static final String RUSSIA = "Rus";
        public static final String BELARUS = "Bel";
    }

    public static final class Reg {
        public static final class Dist {
            public static final String R1 = "Minsk";
            public static final String R2 = "Vitebsk";
            public static final String R3 = "Gomel";
            public static final String R4 = "Mogilev";
            public static final String R5 = "Grodno";
            public static final String R6 = "Brest";
        }


    }

    public static final class Neight {
        public static final class Sever {
            public static final String LATVIA = "+371";
            public static final String LITHUANIA = "+370";
        }

        public static final class Yg {
            public static final String UKRAINE = "+380";
        }

        public static final class Zapad {
            public static final String POLAND = "+48";
        }

        public static final class Vostok {
            public static final String RUSSIA = "+7";
        }
    }

    ;

    public void fullInfo() {
        System.out.println("fullInfo");
        ArrayList<String> list = new ArrayList<String>();
        list.add(Lang.BELARUS);
        list.add(Lang.RUSSIA);
        list.add(Belarus.DATE);
        list.add(Belarus.STOLICA);
        list.add(Belarus.DEN_ED);
        list.add(Reg.Dist.R1);
        list.add(Reg.Dist.R2);
        list.add(Reg.Dist.R3);
        list.add(Reg.Dist.R4);
        list.add(Reg.Dist.R5);
        list.add(Reg.Dist.R6);
        list.add(Neight.Sever.LATVIA);
        list.add(Neight.Sever.LITHUANIA);
        list.add(Neight.Vostok.RUSSIA);
        list.add(Neight.Yg.UKRAINE);
        list.add(Neight.Zapad.POLAND);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------------------------------------------------------------------");

    }

    public void shortInfo() {
        System.out.println("shortInfo");
        ArrayList<String> list = new ArrayList<String>();
        list.add(Lang.BELARUS);
        list.add(Belarus.DATE);
        list.add(Belarus.STOLICA);
        list.add(Belarus.DEN_ED);
        list.add(Neight.Zapad.POLAND);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------------------------------------------------------------------");
    }
}
