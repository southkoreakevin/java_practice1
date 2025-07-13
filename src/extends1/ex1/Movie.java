package extends1.ex1;

public class Movie extends Item {

    String director;
    String actor;

    public Movie(String name, int price, String director, String actor) {
        this.name = name;
        this.price = price;
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("감독: " + this.director + " 배우: " + this.actor);
    }

}
