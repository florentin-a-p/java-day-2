public class Dog extends Animal {
    private String earShape;

    public Dog(String color, String size) {
        super(color, size);
    }

    public void wagTail() {
        System.out.println("dog is wagging its tail");
    }

    public String getEarShape() {
        return earShape;
    }

    public void setEarShape(String earShape) {
        this.earShape = earShape;
    }
}
