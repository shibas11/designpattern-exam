package shibas11.DesignPattern.GoF.behavioral.TemplateMethod;

/**
 * Created by SDS on 2017-06-16.
 */
public abstract class Motor {
    protected Door door;
    protected MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    // 템플릿 메서드
    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) // 이미 이동 중이면 아무 작업을 하지 않음
            return;

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) // 문이 열려있으면 우선 문을 닫음
            door.close();

        moveMotor(direction); // 모터 구동
        setMotorStatus(MotorStatus.MOVING); // 모터 상태를 이동 중으로 변경
    }

    // primitive 또는 hook 메서드
    public abstract void moveMotor(Direction direction);

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    protected void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
}
