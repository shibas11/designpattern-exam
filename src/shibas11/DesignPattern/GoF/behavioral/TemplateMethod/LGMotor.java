package shibas11.DesignPattern.GoF.behavioral.TemplateMethod;

public class LGMotor extends Motor {

    public LGMotor(Door door) {
        super(door);
    }

    @Override
    public void moveMotor(Direction direction) {
        // LG Motor를 구동시킴
        System.out.println(this.getClass().getSimpleName() + " 구동시킴");
    }
}
