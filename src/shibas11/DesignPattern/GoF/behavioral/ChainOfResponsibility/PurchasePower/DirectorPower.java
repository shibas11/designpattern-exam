package shibas11.DesignPattern.GoF.behavioral.ChainOfResponsibility.PurchasePower;

public class DirectorPower extends PurchasePower {
    private final double ALLOWABLE = 20 * base; // 10000

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) { // 한번 처리하면 바로 종료한다.(다음 처리기를 호출하지 않는다.)
            System.out.println("Director will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
