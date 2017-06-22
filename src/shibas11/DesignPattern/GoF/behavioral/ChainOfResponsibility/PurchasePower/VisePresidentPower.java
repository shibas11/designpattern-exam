package shibas11.DesignPattern.GoF.behavioral.ChainOfResponsibility.PurchasePower;

public class VisePresidentPower extends PurchasePower {
    private final double ALLOWABLE = 40 * base; // 20000

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) { // 한번 처리하면 바로 종료한다.(다음 처리기를 호출하지 않는다.)
            System.out.println("VisePresident will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
