package shibas11.DesignPattern.GoF.creational.FactoryMethod;

import java.util.Calendar;

public class ScheduleFactory {
    public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID) {
        ElevatorScheduler scheduler = null;
        switch (strategyID) {
            case RESPONSE_TIME: // 대기 시간 최소화 전략
                scheduler = ResponseTimeScheduler.getInstance();
                break;
            case THROUGHPUT: // 처리량 최대화 전략
                scheduler = ThroughputScheduler.getInstance();
                break;
            case DYNAMIC: // 오전에는 대기 시간 최소화 전략, 오후에는 처리량 최대화 전략
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                if (hour < 12) // 오전
                {
                    scheduler = ResponseTimeScheduler.getInstance();
                } else {
                    scheduler = ThroughputScheduler.getInstance();
                }
                break;
        }
        return scheduler;
    }


}
