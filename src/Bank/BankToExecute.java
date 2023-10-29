package Bank;

public class BankToExecute {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(30, 20, 10);
        System.out.println("Положить наличные");
        System.out.println(bankAccount.put(10));
        CardAccount cardAccount = new CardAccount(50,20,15);
        System.out.println("Снять с карты");
        System.out.println(cardAccount.take(17));
        DepositAccount depositAccount = new DepositAccount(70,24,12);
        System.out.println("Снять с депозита");
        System.out.println(depositAccount.take(34));

    }
}
