package Bank;

public class BankAccount {

    private double account;
    private double toPut;
    private double toTake;

    BankAccount(double account, double toPut, double toTake){
        this.account = account;
        this.toPut = toPut;
        this.toTake = toTake;
    }

    public double getAmount() {

        //TODO: реализуйте метод и удалите todo
        // верните значение количества денег не счету
        return account;
    }

    public double put(double amountToPut) {
        if (amountToPut < 0) {
            return 0;
        } else {
            return account+amountToPut;
        }

        //TODO: реализуйте метод и удалите todo
        // метод зачисляет деньги на счет
    }

    public double take(double amountToTake) {
        if (getAmount() < amountToTake){
            return 0;
        } else{
            return account-amountToTake;
        }
    }
}