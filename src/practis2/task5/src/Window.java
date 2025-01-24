package practis2.task5.src;

class Window extends WindowComponent {
    private int width;
    private int height;

    public Window(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing practis2.task5.src.Window: " + name + " (" + width + "x" + height + ")");
        for (WindowComponent component : nestedComponents) {
            component.draw();
        }
    }
}
