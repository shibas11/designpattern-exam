package shibas11.DesignPattern.GoF.creational.FactoryMethod;

import shibas11.DesignPattern.GoF.behavioral.TemplateMethod.Direction;

/**
 * Created by SDS on 2017-06-16.
 */
public class ResponseTimeScheduler implements ElevatorScheduler {
    @Override
    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {

        return 0; // 엘리베이터를 임의로 선택함
    }
}
