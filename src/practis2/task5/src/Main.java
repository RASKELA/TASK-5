package practis2.task5.src;

public class Main {
    public static void main(String[] args) {
        Window mainWindow = new Window("practis2.task5.src.Main practis2.task5.src.Window", 800, 600);

        VerticalLayout layout = new VerticalLayout("practis2.task5.src.Main Layout", 800, 600);
        mainWindow.addComponent(layout);

        Button button1 = new Button("Button1", "Submit", "submit.png");
        Button button2 = new Button("Button2", "Cancel", "cancel.png");
        layout.addComponent(button1);
        layout.addComponent(button2);

        WindowManager manager = new WindowManager(mainWindow);
        manager.draw();
    }
}
