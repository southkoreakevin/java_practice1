package class1;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "인생은 무한 루프";

        MovieReview movie2 = new MovieReview();
        movie2.title = "어바웃 타임";
        movie2.review = "인생 시간 영화";

        MovieReview[] movieArray = {movie1, movie2};

        for (int i = 0; i < movieArray.length; i++) {
            System.out.print("title : " + movieArray[i].title);
            System.out.println("review : " + movieArray[i].review);
        }
    }

}
