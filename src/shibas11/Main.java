package shibas11;

import shibas11.DesignPattern.ExamRunner;

public class Main {

    public static void main(String[] args) {
        ExamRunner runner = new ExamRunner();
//        runner.run("SOLID.SRP"); // Single Responsibility   책임 분리: 클래스는 한 개의 책임만 가져라
//        runner.run("SOLID.OCP"); // Open-Closed             개방-폐쇄: 기존 코드 변경없이 새 기능 추가해라, UnitTest!!
//        runner.run("SOLID.LSP"); // Liskov Substitution     리스코프 치환: 부모,자식 클래스 사이의 행위의 일관성
//        runner.run("SOLID.DIP"); // Dependency Inversion    의존 역전: 변하지 않거나 변하기 어려운 것(추상)에 의존하라
//        runner.run("SOLID.ISP"); // Interface Segregation   인터페이스 분리: 클라이언트에 특화되도록 인터페이스 분리해라

        /*
        행위.스트래티지 패턴 behavioral.Strategy
        전략(변화하는 것)을 찾아서 클래스로 캡슐화한다.
        필요할 때마다 교체할 수 있도록.
        */
        //runner.run("Strategy");

        /*
        생성.싱글턴 패턴 creational.Singleton
        전역변수 사용없이 객체를 하나만 생성하여
        어디에서든지 참조할 수 있게 함.
        */
        //runner.run("Singleton");

        /*
        행위.스테이트 패턴 behavioral.State
        어떤 행위를 수행할 때 상태에 행위를 수행하도록 위임함.
         */
        //runner.run("State");

        /*
        행위.커맨드 패턴 behavioral.Command
        이벤트가 발생했을 때 실행될 기능이 다양하면서도 변경이 필요한 경우에
        이벤트를 발생시키는 클래스를 변경하지 앟고 재사용하고자 할 때 유용함.
         */
        //runner.run("Command");

        /*
        행위.옵저버 패턴 behavioral.Observer
        데이터의 변경이 발생했을 경우
        상태 클래스나 객체에 의존하지 않으면서
        데이터 변경을 통보하고자 할 때 유용함.
        예) 탐색기 여러 개 띄워놓고 파일을 추가하거나 삭제할 때 나머지 탐색기에 즉각 변경을 통보해야 함
         */
        runner.run("Observer");
    }
}
