package shibas11.DesignPattern.GoF.behavioral.TemplateMethod;

public class HyundaiMotor extends Motor {

    public HyundaiMotor(Door door) {
        super(door);
    }

    @Override
    public void moveMotor(Direction direction) {
        // Hyundai Motor를 구동시킴
        System.out.println(this.getClass().getSimpleName() + " 구동시킴");
    }
}
