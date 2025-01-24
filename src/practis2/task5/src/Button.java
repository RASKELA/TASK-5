package practis2.task5.src;

class Button extends WindowComponent {
    private String text;
    private String imagePath;

    public Button(String name, String text, String imagePath) {
        super(name);
        this.text = text;
        this.imagePath = imagePath;
    }

    @Override
    public void draw() {
        System.out.println("Drawing practis2.task5.src.Button: " + name + " [" + text + "] with image: " + imagePath);
    }
}