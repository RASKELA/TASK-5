package practis2.task5.src;

import java.util.ArrayList;
import java.util.List;

abstract class WindowComponent {
    protected String name;
    protected List<WindowComponent> nestedComponents = new ArrayList<>();

    public WindowComponent(String name) {
        this.name = name;
    }

    public abstract void draw();

    public void addComponent(WindowComponent component) {
        nestedComponents.add(component);
    }

    public void removeComponent(String name) {
        nestedComponents.removeIf(component -> component.name.equals(name));
    }
}
