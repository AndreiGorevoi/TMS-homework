package Lesson8.MetEx27;

public class BankCard extends BankAccount {
    private String typeOfCard;

    public void setTypeOfCard(String typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    public String getTypeOfCard() {
        return typeOfCard;
    }

    public BankCard(int balance, String personOfAccount, String typeOfCurrency, String typeOfCard){
        super(balance, personOfAccount, typeOfCurrency);
        this.typeOfCard=typeOfCard;
    }
    @Override
    public void getMoney(int sum){
        System.out.println("Find a ATM and take your money: " + sum +" " + typeOfCurrency );
    }

}
