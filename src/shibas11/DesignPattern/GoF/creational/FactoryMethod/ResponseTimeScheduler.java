package shibas11.DesignPattern.GoF.creational.FactoryMethod;

import shibas11.DesignPattern.GoF.behavioral.TemplateMethod.Direction;

public class ResponseTimeScheduler implements ElevatorScheduler {
    private static ResponseTimeScheduler instance = new ResponseTimeScheduler();

    private ResponseTimeScheduler() {
    }

    public static ResponseTimeScheduler getInstance() {
        return instance;
    }

    @Override
    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {

        return 0; // 엘리베이터를 임의로 선택함
    }
}
