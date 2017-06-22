package shibas11.DesignPattern.GoF.behavioral.ChainOfResponsibility.PurchasePower;

public abstract class PurchasePower {
    protected final double base = 500;
    protected PurchasePower successor;

    public abstract void processRequest(PurchaseRequest request);

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }
}
