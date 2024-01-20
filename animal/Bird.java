public class Bird extends Animal {

    private int wingSize;

    public Bird() {
        super("blue", "large");
        this.wingSize = 13;
    }

    public Bird(int wingSize) {
        super("yellow", "small");
        this.wingSize = wingSize;
    }

    public Bird(String color, String size, int wingSize) {
        super(color, size);
        this.wingSize = wingSize;
    }

    public void fly() {
        System.out.println("the bird is flying");
    }

    public int getWingSize() {
        return wingSize;
    }

    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }
}
