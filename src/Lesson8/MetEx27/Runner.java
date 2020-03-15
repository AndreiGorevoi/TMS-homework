package Lesson8.MetEx27;

public class Runner {
    public static void main(String[] args) {
        Account bankAccount = new BankAccount(1000,"Vasiya","eu");
        Account bankCard = new BankCard(2000, "Petiya", "by",
                "without contact");

        bankAccount.getMoney(100);
        bankAccount.putMoney();
        System.out.println("************");
        bankCard.getMoney(200);
        bankCard.putMoney();
    }
}
