package shibas11.DesignPattern.GoF.behavioral.ChainOfResponsibility.Logger;

public abstract class Logger {
    public static int ERR = 3;
    public static int WARNING = 5;
    public static int NORMAL = 7;
    protected int mask;

    protected Logger next;

    public void message(String msg, int priority) {
        if (priority <= mask) {
            writeMessage(msg);
        }

        if (next != null) {
            next.message(msg, priority);
        }
    }

    public Logger setNext(Logger logger) {
        this.next = logger;
        return logger;
    }

    protected abstract void writeMessage(String msg);
}
