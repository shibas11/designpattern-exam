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
        //runner.run("Observer");

        /*
        구조.데커레이터 패턴 structual.Decorator
        객체의 결합을 통해
        기능을 동적으로 유연하게 확장할 수 있게 해줌.

        기본 기능에 추가할 수 있는 기능의 종류가 많은 경우에
        각 추가 기능을 Decorator 클래스로 정의한 후
        필요한 Decorator 객체를 조합하여 설계하는 방식.
         */
        //runner.run("Decorator");

        /*
        행위.템플릿 메서드 패턴 behavioral.TemplateMethod
        어떤 작업을 처리하는 일부분을 서브 클래스로 캡슐화해
        전체 일을 수행하는 구조는 바꾸지 않으면서
        특정 단계에서 수행하는 내역을 바꾸는 패턴.
        전체적으로는 동일하면서 부분적으로는 다른 구문으로 구성된 메서드의 코드 중복을 최소화할 때 유용함.
         */
        //runner.run("TemplateMethod");

        /*
        생성.팩토리 메서드 패턴 creational.FactoryMethod
        객체 생성 처리를 서브 클래스로 분리해 처리하도록 캡슐화하는 패턴
         */
        //runner.run("FactoryMethod");

        /*
        생성.추상 팩토리 패턴 creational.AbstractFactory
        구체적인 클래스에 의존하지 않고
        서로 연관되거나 의존적인 객체들의 조합을 만드는 인터페이스를 제공하는 패턴.
        여러 종류의 객체를 일관된 방식으로 생성하는 경우에 유용함.
        예) 부품별 Factory 클래스를 정의하는 대신 제조업체별 Factory 클래스 정의
         */
        //runner.run("AbstractFactory");

        /*
        구조.컴퍼지트 패턴 structual.Composite
        여러 개의 객체들로 구성된 복합 객체와 단일 객체를
        클라이언트에서 구별 없이 다루게 해주는 패턴.
        part-whole 관계를 갖는 객체들을 정의할 때 유용함.
         */
        //runner.run("Composite");

        /*
        행위.책임 연쇄 패턴 behavioral.ChainOfResponsibility
        요청을 처리할 수 있는 기회를 하나 이상의 객체에게 부여하여
        요청을 보내는 객체와 그 요청을 받는 개체 사이의 결합을 피하는 패턴.
        요청을 받을 수 있는 객체를 연쇄적으로 묶고,
        실제 요청을 처리할 객체를 만날 때까지 객체 고리를 따라서 요청을 전달.
         */
        runner.run(("ChainOfResponsibility"));
        System.out.println();
        runner.run(("ChainOfResponsibility.PurchasePower"));
    }
}
