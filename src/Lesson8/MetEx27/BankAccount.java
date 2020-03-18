package Lesson8.MetEx27;

public class BankAccount extends Account {
    protected int balance;
    protected String typeOfCurrency;

    public BankAccount(int balance, String personOfAccount, String typeOfCurrency){
        this.balance=balance;
        this.personOfAccount=personOfAccount;
        this.typeOfCurrency = typeOfCurrency;
    }
    @Override
    void getMoney(int sum){
        System.out.println("Go to bank and take your: " + sum +" " + typeOfCurrency);
    }


    @Override
    void putMoney() {
        System.out.println("Go to bank and put money");
    }
}
