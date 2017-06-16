package shibas11.DesignPattern.GoF.behavioral.TemplateMethod;

/**
 * Created by SDS on 2017-06-16.
 */
public class HyundaiMotor extends Motor {

    public HyundaiMotor(Door door) {
        super(door);
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) // 이미 이동 중이면 아무 작업을 하지 않음
            return;

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) // 문이 열려있으면 우선 문을 닫음
            door.close();

        moveHyundaiMotor(direction); // 모터 구동
        setMotorStatus(MotorStatus.MOVING); // 모터 상태를 이동 중으로 변경
    }

    private void moveHyundaiMotor(Direction direction) {
        // Hyundai Motor를 구동시킴
        System.out.println(this.getClass().getSimpleName() + " 구동시킴");
    }
}
