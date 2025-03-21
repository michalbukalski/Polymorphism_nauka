import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie theMovie = new Adventure("Indiana Johnes");
//        theMovie.watchMovie();
//
//        Movie theMovie2 = Movie.getMovie("S", "Star Wars");
//        theMovie2.watchMovie();
//
//        Movie theMovie3 = Movie.getMovie( "default","The big bang theory");
//        theMovie3.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter type (A for Adventure, C for Comedy, S for Science Fiction, "+
                    "D for Documentary, T for Thriller/Horror, or Q to quit): ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
