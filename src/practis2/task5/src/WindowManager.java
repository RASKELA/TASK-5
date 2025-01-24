package practis2.task5.src;

class WindowManager {
    private Window window;

    public WindowManager(Window window) {
        this.window = window;
    }

    public void draw() {
        window.draw();
    }
}