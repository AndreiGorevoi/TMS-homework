package Lesson8.interf.wear.coat;

public class DefactoCoat implements ICoat {
    public void getDress() {
        System.out.println("DeFacto coat is got dressed ");
    }

    @Override
    public void getUndress() {
        System.out.println("DeFacto coat is got undressed ");
    }
}
