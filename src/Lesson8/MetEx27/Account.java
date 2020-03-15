package Lesson8.MetEx27;

public abstract class Account {
    Boolean statusAccount = true;
    String personOfAccount;

    abstract void getMoney(int sum);
    abstract void putMoney();

    public void closeAccount(){
        statusAccount=false;
    }
}
