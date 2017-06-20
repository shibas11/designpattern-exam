package shibas11.DesignPattern.GoF.structual.Composite;

public class Computer {
    private Body body;
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;

    public void addBody(Body body) {
        this.body = body;
    }

    public void addKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void addMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void addMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public int getPrice() {
        int bodyPrice = body.getPrice();
        int keyboardPrice = keyboard.getPrice();
        int monitorPrice = monitor.getPrice();
        int mousePrice = mouse.getPrice();
        return bodyPrice + keyboardPrice + monitorPrice + mousePrice;
    }

    public int getPower() {
        int bodyPower = body.getPower();
        int keyboardPower = keyboard.getPower();
        int monitorPower = monitor.getPower();
        int mousePower = mouse.getPower();
        return bodyPower + keyboardPower + monitorPower + mousePower;
    }

}
