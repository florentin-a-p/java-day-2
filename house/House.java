public class House {
    private String address;
    private Window window;
    private Door door;

    public House(String address, Window window, Door door) {
        this.address = address;
        this.window = window;
        this.door = door;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", window=" + window +
                ", door=" + door +
                '}';
    }
}
