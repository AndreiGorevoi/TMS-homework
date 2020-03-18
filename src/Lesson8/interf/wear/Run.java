package Lesson8.interf.wear;

import Lesson8.interf.wear.coat.BershkaCoat;
import Lesson8.interf.wear.coat.DefactoCoat;
import Lesson8.interf.wear.pants.ZaraPants;
import Lesson8.interf.wear.shoes.KariShoes;

public class Run {
    public static void main(String[] args) {
        Man vasia = new Man(new DefactoCoat(),new ZaraPants(), new KariShoes(), "Vasia");
        vasia.getDressed();
        vasia.getUndressed();
    }
}
