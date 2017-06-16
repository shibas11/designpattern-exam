package shibas11.DesignPattern.GoF.creational.FactoryMethod;

import shibas11.DesignPattern.GoF.behavioral.TemplateMethod.Direction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SDS on 2017-06-16.
 */
public class ElevatorManager {
    private List<ElevatorController> controllers;
    private ThroughputScheduler scheduler;

    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i + 1);
            controllers.add(controller);
        }
        scheduler = new ThroughputScheduler();
    }

    public void requestElevator(int destination, Direction direction) {
        // ThroughputScheduler 를 이용해 엘리베이터를 선택
        int selectedElevator = scheduler.selectElevator(this, destination, direction);

        // 선택된 엘리베이터를 이동시킴
        controllers.get(selectedElevator).gotFloor(destination);
    }
}
