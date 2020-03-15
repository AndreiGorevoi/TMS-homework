package Lesson8.interf.wear;

import Lesson8.interf.wear.coat.ICoat;
import Lesson8.interf.wear.pants.IPants;
import Lesson8.interf.wear.shoes.IShoes;

public class Man {
    private String name;
    private ICoat coat;
    private IShoes shoes;
    private IPants pants;

    public Man(ICoat coat, IPants pants, IShoes shoes, String name){
        this.coat=coat;
        this.pants=pants;
        this.shoes=shoes;
        this.name=name;
    }

    public void getDressed(){
        System.out.println(name + ": ");
        coat.getDress();
        pants.getDress();
        shoes.getDress();
    }

    public void getUndressed(){
        System.out.println(name + ": ");
        coat.getUndress();
        shoes.getUndress();
        pants.getUndress();
    }
}
