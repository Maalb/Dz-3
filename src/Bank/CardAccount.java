package Bank;

public class CardAccount extends BankAccount {
    CardAccount(double account, double toPut, double toTake) {
        super(account, toPut, toTake);
    }

    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);


    @Override
    public double take(double amountToTake) {
        if (getAmount() < amountToTake){
            return 0;
        } else{
            return getAmount()-amountToTake*1.01;
        }
    }
}


