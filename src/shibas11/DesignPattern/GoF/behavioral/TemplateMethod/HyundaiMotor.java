package shibas11.DesignPattern.GoF.behavioral.TemplateMethod;

/**
 * Created by SDS on 2017-06-16.
 */
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
