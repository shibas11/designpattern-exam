package shibas11.DesignPattern.GoF.creational.FactoryMethod;

import shibas11.DesignPattern.GoF.behavioral.TemplateMethod.Direction;

public interface ElevatorScheduler {
    int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction);
}
