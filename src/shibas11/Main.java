package shibas11;

import shibas11.DesignPattern.ExamRunner;

public class Main {

    public static void main(String[] args) {
        ExamRunner runner = new ExamRunner();
        runner.run("SOLID.SRP"); // Single Responsibility   책임 분리
        runner.run("SOLID.DIP"); // Dependency Inversion    의존 역전
    }
}
