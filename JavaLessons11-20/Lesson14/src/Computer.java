public class Computer {
    private Keyboard keyboard = new Keyboard();
    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();

    public Computer() {

    }

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }


}
