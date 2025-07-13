package extends1.ex1;

public class Album extends Item {

    String artist;

    public Album(String name, int price, String artist) {
        this.name = name;
        this.price = price;
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("artist: " + this.artist);
    }
}
