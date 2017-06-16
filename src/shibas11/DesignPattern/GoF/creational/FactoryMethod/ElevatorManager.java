package shibas11.DesignPattern.GoF.creational.FactoryMethod;

import shibas11.DesignPattern.GoF.behavioral.TemplateMethod.Direction;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by SDS on 2017-06-16.
 */
public class ElevatorManager {
    private List<ElevatorController> controllers;

    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i + 1);
            controllers.add(controller);
        }
    }

    public void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler;

        // 0..23
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if (hour < 12) // 오전에는 ResponseTimeScheduler 를 이용
            scheduler = new ResponseTimeScheduler();
        else
            scheduler = new ThroughputScheduler();

        int selectedElevator = scheduler.selectElevator(this, destination, direction);

        // 선택된 엘리베이터를 이동시킴
        controllers.get(selectedElevator).gotFloor(destination);
    }
}
