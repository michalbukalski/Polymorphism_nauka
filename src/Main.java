public class Main {

    public static void main(String[] args) {

        Movie theMovie = new Adventure("Star Wars");
        theMovie.watchMovie();

        Movie theMovie2 = Movie.getMovie("Adventure", "Star Wars");
        theMovie2.watchMovie();
    }
}
