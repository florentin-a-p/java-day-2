public class OtherBird implements OtherAnimal{
    @Override
    public void move() {
        System.out.println("bird moves");
    }

    @Override
    public void makeNoise() {
        System.out.println("bird chirps");
    }
}
