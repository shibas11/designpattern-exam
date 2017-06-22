package shibas11.DesignPattern.GoF.behavioral.ChainOfResponsibility.PurchasePower;

public class ManagerPower extends PurchasePower {
    private final double ALLOWABLE = 10 * base; // 5000

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) { // 한번 처리하면 바로 종료한다.(다음 처리기를 호출하지 않는다.)
            System.out.println("Manager will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
