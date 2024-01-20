public class Animal {
    private String color;
    private String size;

    public Animal(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public void move(String speed) {
        System.out.println("the animal is moving with speed: " + speed);
    }

    public void makeNoise () {
        System.out.println("the animal is making some noise");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
