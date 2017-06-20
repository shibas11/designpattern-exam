package shibas11.DesignPattern.GoF.structual.Composite;

import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice {
    private Body body;
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;
    private List<ComputerDevice> components;

    public Computer() {
        components = new ArrayList<>();
    }

    public void addComponent(ComputerDevice component) {
        components.add(component);
    }

    public void removeComponent(ComputerDevice component) {
        components.remove(component);
    }

    @Override
    public int getPrice() {
        int price = 0;
        for (ComputerDevice component : components) {
            price += component.getPrice();
        }
        return price;
    }

    @Override
    public int getPower() {
        int power = 0;
        for (ComputerDevice component : components) {
            power += component.getPower();
        }
        return power;
    }

}
