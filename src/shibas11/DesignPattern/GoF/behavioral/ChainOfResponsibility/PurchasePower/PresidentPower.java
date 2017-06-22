package shibas11.DesignPattern.GoF.behavioral.ChainOfResponsibility.PurchasePower;

public class PresidentPower extends PurchasePower {
    private final double ALLOWABLE = 60 * base; // 30000

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) { // 마지막 처리기
            System.out.println("President will approve $" + request.getAmount());
        } else {
            System.out.println("Your request for $" + request.getAmount() + " needs a board meeting!");
        }
    }
}
