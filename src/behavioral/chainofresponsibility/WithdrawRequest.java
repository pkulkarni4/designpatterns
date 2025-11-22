package behavioral.chainofresponsibility;

public class WithdrawRequest {
    private final Double amount;
    private final Currency currency;

    public WithdrawRequest(Double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public Double getAmount() {
        return this.amount;
    }
}