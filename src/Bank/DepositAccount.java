package Bank;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    LocalDate date = LocalDate.of(2023, 10, 29);
    LocalDate date2 = LocalDate.of(2023, 11, 10);
    int daysBetween;

    DepositAccount(double account, double toPut, double toTake) {
        super(account, toPut, toTake);
    }

    @Override
    public double take(double amountToTake) {

        if (daysBetweenInclusive(date, date2) > 30) {
            return super.take(amountToTake);
        } else {
            return getAmount();
        }
    }
    public static long daysBetweenInclusive(LocalDate ld1, LocalDate ld2) {
        return Math.abs(ChronoUnit.DAYS.between(ld1, ld2)) + 1;
    }


}
