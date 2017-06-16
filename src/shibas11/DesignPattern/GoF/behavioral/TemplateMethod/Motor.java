package shibas11.DesignPattern.GoF.behavioral.TemplateMethod;

/**
 * Created by SDS on 2017-06-16.
 */
public class Motor {
    protected Door door;
    protected MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    protected void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
}
