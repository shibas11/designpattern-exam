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
         */
        runner.run("State");
    }
}
