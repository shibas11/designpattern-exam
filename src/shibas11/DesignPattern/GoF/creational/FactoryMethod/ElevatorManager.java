package shibas11.DesignPattern.GoF.creational.FactoryMethod;

import shibas11.DesignPattern.GoF.behavioral.TemplateMethod.Direction;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
    private SchedulingStrategyID strategyID;
    private List<ElevatorController> controllers;

    public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID) {
        controllers = new ArrayList<>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i + 1);
            controllers.add(controller);
        }
        this.strategyID = strategyID; // 스케줄링 전략을 설정함
    }

    public void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler = ScheduleFactory.getScheduler(strategyID);
        System.out.println(scheduler);

        int selectedElevator = scheduler.selectElevator(this, destination, direction);

        // 선택된 엘리베이터를 이동시킴
        controllers.get(selectedElevator).gotFloor(destination);
    }

    public SchedulingStrategyID getStrategyID() {
        return strategyID;
    }

    public void setStrategyID(SchedulingStrategyID strategyID) {
        this.strategyID = strategyID;
    }
}
