public class HouseMain {
    public static void main(String[] args) {
        House myHouse = new House(
                "indonesia"
                , new Window(2.5,3.0,4)
                , new Door(4,2,"wood"));

        System.out.println(myHouse);
    }
}
