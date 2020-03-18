package Lesson8.MetEx27;

public abstract class Account {
    private Boolean statusAccount = true;
    private String personOfAccount;

    public void setStatusAccount(Boolean statusAccount) {
        this.statusAccount = statusAccount;
    }

    public void setPersonOfAccount(String personOfAccount) {
        this.personOfAccount = personOfAccount;
    }

    public Boolean getStatusAccount() {
        return statusAccount;
    }

    public String getPersonOfAccount() {
        return personOfAccount;
    }

    abstract void getMoney(int sum);
    abstract void putMoney();

    public void closeAccount(){
        statusAccount=false;
    }
}
