package behavioral.chainofresponsibility;

public abstract class ATM {
    ATM nextATMDispenser;

    public ATM(ATM nextATMDispenser) {
        this.nextATMDispenser = nextATMDispenser;
    }

    abstract void dispense(WithdrawRequest request);
}
