package shibas11;

import shibas11.DesignPattern.ExamRunner;

public class Main {

    public static void main(String[] args) {
        ExamRunner runner = new ExamRunner();
        runner.run("SOLID.SRP"); // Single Responsibility   책임 분리: 클래스는 한 개의 책임만 가져라
        runner.run("SOLID.OCP"); // Open-Closed             개방-폐쇄: 기존 코드 변경없이 새 기능 추가해라, UnitTest!!
        runner.run("SOLID.DIP"); // Dependency Inversion    의존 역전: 변하지 않거나 변하기 어려운 것(추상)에 의존하라
    }
}
