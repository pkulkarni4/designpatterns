package behavioral.chainofresponsibility;

public class USDATM extends ATM {

    public USDATM(ATM nextATMDispenser) {
        super(nextATMDispenser);
    }

    @Override
    void dispense(WithdrawRequest request) {
        if(Currency.USD.equals(request.getCurrency())) {
            System.out.println("Dispensing dollar " + request.getAmount());
        } else if(nextATMDispenser != null) {
            nextATMDispenser.dispense(request);
        }
    }
}
