public class OtherDog implements OtherAnimal {
    @Override
    public void move() {
        System.out.println("dog moves");
    }

    @Override
    public void makeNoise() {
        System.out.println("dog barks");
    }
}
