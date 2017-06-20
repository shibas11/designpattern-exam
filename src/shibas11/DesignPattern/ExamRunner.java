package shibas11.DesignPattern;

import shibas11.DesignPattern.GoF.behavioral.Command.*;
import shibas11.DesignPattern.GoF.behavioral.Observer.DataSheetView;
import shibas11.DesignPattern.GoF.behavioral.Observer.MinMaxView;
import shibas11.DesignPattern.GoF.behavioral.Observer.Observer;
import shibas11.DesignPattern.GoF.behavioral.Observer.ScoreRecord;
import shibas11.DesignPattern.GoF.behavioral.State.Light;
import shibas11.DesignPattern.GoF.behavioral.Strategy.FireMon;
import shibas11.DesignPattern.GoF.behavioral.Strategy.Pikachu;
import shibas11.DesignPattern.GoF.behavioral.Strategy.PocketMonster;
import shibas11.DesignPattern.GoF.behavioral.Strategy.WaterMon;
import shibas11.DesignPattern.GoF.behavioral.Strategy.attack.FireBreathStrategy;
import shibas11.DesignPattern.GoF.behavioral.Strategy.attack.OneMillionVoltsThunderStrategy;
import shibas11.DesignPattern.GoF.behavioral.Strategy.attack.WaterBombStrategy;
import shibas11.DesignPattern.GoF.behavioral.Strategy.move.RunningStrategy;
import shibas11.DesignPattern.GoF.behavioral.Strategy.move.SwimmingStrategy;
import shibas11.DesignPattern.GoF.behavioral.TemplateMethod.*;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.MusicPlayer.MusicPlayer;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.PlayerFactory;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.PlayerFactoryFactory;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.Speaker.Speaker;
import shibas11.DesignPattern.GoF.creational.AbstractFactory.VendorId;
import shibas11.DesignPattern.GoF.creational.FactoryMethod.ElevatorManager;
import shibas11.DesignPattern.GoF.creational.FactoryMethod.SchedulingStrategyID;
import shibas11.DesignPattern.GoF.creational.Singleton.UserThread;
import shibas11.DesignPattern.GoF.structual.Composite.*;
import shibas11.DesignPattern.GoF.structual.Decorator.Display;
import shibas11.DesignPattern.GoF.structual.Decorator.LaneDecorator;
import shibas11.DesignPattern.GoF.structual.Decorator.RoadDisplay;
import shibas11.DesignPattern.GoF.structual.Decorator.TrafficDecorator;
import shibas11.DesignPattern.SOLID.DIP.AdderFactory;
import shibas11.DesignPattern.SOLID.DIP.Calculator;
import shibas11.DesignPattern.SOLID.DIP.IAdder;
import shibas11.DesignPattern.SOLID.ISP.Bird;
import shibas11.DesignPattern.SOLID.ISP.Penguin;
import shibas11.DesignPattern.SOLID.ISP.Pigeon;
import shibas11.DesignPattern.SOLID.LSP.DiscountedBag;
import shibas11.DesignPattern.SOLID.OCP.AreaCalculator;
import shibas11.DesignPattern.SOLID.OCP.Rectangle;
import shibas11.DesignPattern.SOLID.OCP.Shape;
import shibas11.DesignPattern.SOLID.OCP.Triangle;
import shibas11.DesignPattern.SOLID.SRP.Employee;
import shibas11.DesignPattern.SOLID.SRP.Student;

import java.util.LinkedList;
import java.util.List;

public class ExamRunner {
    public void run(String code) {
        System.out.println("=== " + code + " ===");
        switch (code) {
            case "SOLID.SRP":
                Student st = new Student("Jake");
                Employee em = new Employee("Lee");
                st.study();
                em.work();
                break;
            case "SOLID.OCP":
                AreaCalculator ac = new AreaCalculator();
                Rectangle rect = new Rectangle(2, 3);
                Triangle tri = new Triangle(2, 3);
                List<Shape> list = new LinkedList<>();
                list.add(rect);
                list.add(tri);
                System.out.println(String.format("사각형의 넓이는 %f", rect.getArea()));
                System.out.println(String.format("삼각형의 넓이는 %f", tri.getArea()));
                System.out.println(String.format("넓이의 총합은 %f", ac.getTotalArea(list)));
                break;
            case "SOLID.LSP":
                DiscountedBag bag = new DiscountedBag();
                bag.setDiscountedRate(0.5);
                bag.applyDiscount(100);
                System.out.println("가방 가격 설정: 100");
                System.out.println("가방 가격은? " + bag.getPrice());

                break;
            case "SOLID.DIP":
                IAdder adder = AdderFactory.create(AdderFactory.AdderType.X2);
                Calculator cal = new Calculator();
                cal.setAdder(adder);
                System.out.println("1 + 2 = " + cal.add(1, 2));
                break;

            case "SOLID.ISP":
                Pigeon pigeon = new Pigeon();
                pigeon.eat();
                pigeon.sing();
                pigeon.fly();
                Bird penguin = new Penguin();
                penguin.eat();
                penguin.sing();
                break;

            case "Strategy":
                PocketMonster fireMon = new FireMon("FireMon");
                fireMon.setMovingStrategy(new SwimmingStrategy());
                fireMon.setAttackStrategy(new FireBreathStrategy());
                fireMon.move();
                fireMon.attack();

                PocketMonster waterMon = new WaterMon("WaterMon");
                waterMon.setMovingStrategy(new RunningStrategy());
                waterMon.setAttackStrategy(new WaterBombStrategy());
                waterMon.move();
                waterMon.attack();

                PocketMonster pikachu = new Pikachu("pikachu");
                pikachu.setMovingStrategy(new RunningStrategy());
                pikachu.setAttackStrategy(new FireBreathStrategy());
                pikachu.move();
                pikachu.attack();
                pikachu.setAttackStrategy(new OneMillionVoltsThunderStrategy());
                pikachu.attack();
                break;

            case "Singleton":
//                final int User_NUM = 5;
//                User[] user = new User[User_NUM];
//                for(int i=0;i<User_NUM;i++) {
//                    user[i] = new User((i+1) +"-user");
//                    user[i].print();
//                }
                final int Thread_NUM = 5;
                UserThread[] tuser = new UserThread[Thread_NUM];
                for (int i = 0; i < Thread_NUM; i++) {
                    tuser[i] = new UserThread((i + 1) + "-userThread");
                    tuser[i].start();
                }
                break;

            case "State":
                Light light = new Light();
                light.off_button_pushed();
                light.on_button_pushed();
                light.on_button_pushed();
                light.off_button_pushed();
                break;

            case "Command":
                Lamp lamp = new Lamp();
                LampOnCommand lampOnCommand = new LampOnCommand(lamp);
                LampOffCommand lampOffCommand = new LampOffCommand(lamp);
                AlarmOnCommand alarmOnCommand = new AlarmOnCommand(new Alarm());

                Button button = new Button(lampOnCommand);
                button.pressed();

                button.setCommand(alarmOnCommand);
                button.pressed();

                button.setCommand(lampOffCommand);
                button.pressed();
                break;

            case "Observer":
                ScoreRecord scoreRecord = new ScoreRecord();
                Observer dataSheetView3 = new DataSheetView(scoreRecord, 3);
                Observer dataSheetView5 = new DataSheetView(scoreRecord, 5);
                Observer minMaxView = new MinMaxView(scoreRecord);

                scoreRecord.attach(dataSheetView3);
                scoreRecord.attach(dataSheetView5);
                scoreRecord.attach(minMaxView);

                for (int index = 1; index <= 5; index++) {
                    int score = index * 10;
                    System.out.println("Adding " + score);

                    scoreRecord.addScore(score);
                }
                break;

            case "Decorator":
                Display roadDisplay = new RoadDisplay();
                roadDisplay.draw();

                Display roadDisplayWithLane = new LaneDecorator(roadDisplay);
                roadDisplayWithLane.draw();

                Display roadDisplayWithTraffic = new TrafficDecorator(roadDisplay);
                roadDisplayWithTraffic.draw();

                Display roadDisplayWithLaneAndTraffic = new LaneDecorator(new TrafficDecorator(roadDisplay));
                roadDisplayWithLaneAndTraffic.draw();
                break;

            case "TemplateMethod":
                Motor hyundaiMotor = new HyundaiMotor(new Door());
                hyundaiMotor.move(Direction.UP);
                Motor lgMotor = new LGMotor(new Door());
                lgMotor.move(Direction.DOWN);
                break;

            case "FactoryMethod":
                ElevatorManager emWithResponseTimScheduler = new ElevatorManager(5, SchedulingStrategyID.RESPONSE_TIME);
                emWithResponseTimScheduler.requestElevator(7, Direction.UP);

                ElevatorManager emWithThroughputScheduler = new ElevatorManager(5, SchedulingStrategyID.THROUGHPUT);
                emWithThroughputScheduler.requestElevator(3, Direction.DOWN);

                ElevatorManager emWithDynamicScheduler = new ElevatorManager(5, SchedulingStrategyID.DYNAMIC);
                emWithDynamicScheduler.requestElevator(10, Direction.UP);
                break;

            case "AbstractFactory":
                PlayerFactory playerFactory;
                VendorId vendorId = VendorId.LG; // 사용자로부터 입력받는다고 가정
                playerFactory = PlayerFactoryFactory.getFactory(vendorId);

                Speaker speaker = playerFactory.createSpeaker();
                MusicPlayer musicPlayer = playerFactory.createMusicPlayer();
                musicPlayer.setSpeaker(speaker);

                musicPlayer.play();
                break;

            case "Composite":
                Body body = new Body(100, 70);
                Keyboard keyboard = new Keyboard(5, 2);
                Monitor monitor = new Monitor(20, 30);
                Mouse mouse = new Mouse(8, 3);

                Computer computer = new Computer();
                computer.addBody(body);
                computer.addKeyboard(keyboard);
                computer.addMonitor(monitor);
                computer.addMouse(mouse);

                int computerPrice = computer.getPrice();
                int computerPower = computer.getPower();
                System.out.println("Computer Price: " + computerPrice);
                System.out.println("Computer Power: " + computerPower);
                break;
        }
        System.out.println();
    }
}
