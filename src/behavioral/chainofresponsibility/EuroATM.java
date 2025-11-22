package behavioral.chainofresponsibility;

public class EuroATM extends ATM {

    public EuroATM(ATM nextATMDispenser) {
        super(nextATMDispenser);
    }

    @Override
    void dispense(WithdrawRequest request) {
        if (Currency.EURO.equals(request.getCurrency())) {
            System.out.println("dispensing in EURO " + request.getAmount());
        } else if (nextATMDispenser != null) {
            nextATMDispenser.dispense(request);
        }
    }
}
