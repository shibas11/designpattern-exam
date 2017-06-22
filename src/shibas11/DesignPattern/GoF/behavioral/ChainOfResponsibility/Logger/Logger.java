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

        if (next != null) { // 무조건 다음 처리기를 호출한다.
            next.message(msg, priority);
        }
    }

    // setter임에도 불구하고 void 대신 Logger를 반환한다.
    public Logger setNext(Logger logger) {
        this.next = logger;
        return logger;
    }

    protected abstract void writeMessage(String msg);
}
