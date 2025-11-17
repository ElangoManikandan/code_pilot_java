package Tasks.Streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class MovieRecommendationSystem {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Maatraan", "Commercial", 7, 2017),
                new Movie("Mandela", "Commercial", 8, 2024),
                new Movie("Vikram", "Action", 9, 2021),
                new Movie("Oh my Kadavule", "Rom-Com", 8, 2022),
                new Movie("Gandhi Kannadi", "Rom-Com", 7, 2025),
                new Movie("Viduthalai", "Action", 9.5, 2025),
                new Movie("96", "Rom-Com", 8, 2019),
                new Movie("K.R.K", "Rom-Com", 7, 2025),
                new Movie("DADA", "Rom-Com", 7, 2024),
                new Movie("VadaChennai", "Action", 7, 2016),
                new Movie("Aadukalam", "Action", 8, 2013)
        );

            List<Movie> filteredMovies = movies.stream()
                .filter(m -> m.year > 2020)
                .sorted(Comparator.comparingDouble(m -> m.rating))
                .toList().reversed();
            filteredMovies.stream()
                .limit(3)
                .forEach(e -> System.out.println("Title: " + e.getTitle() + " Genre: " + e.getGenre() + " Rating: " + e.getRating() + " Year:" + e.getYear()));
            System.out.println("GROUPED MOVIES BY GENRE: ");
            Map<String, List<Movie>> groupedMoviesByGenre = movies
                .stream()
                .collect(Collectors.groupingBy(m -> m.getGenre()));
            groupedMoviesByGenre.forEach((genre, movielist) -> {
            System.out.println(genre + " : ");
            System.out.println("-------------");
            movielist.forEach(m -> System.out.println("Title: " + m.getTitle() + " Genre: " + m.getGenre() + " Rating: " + m.getRating() + " Year: " + m.getYear()));
            System.out.println("--------------");
                System.out.println("\n\nAVERAGE RATING PER GENRE:");
            Map<String,Double> avgRatingsPerGenre=movies.stream()
                    .collect(Collectors.groupingBy(
                            Movie::getGenre,
                            Collectors.averagingDouble(Movie::getRating)
                    ));
            avgRatingsPerGenre.forEach(
                    (genres,rating)->{
                        System.out.println("Genre: "+genres + " | Rating: "+rating);
                    }
            );



        });
    }

}


class Movie {
    String title;
    String genre;
    double rating;
    int year;

    Movie(String title, String genre, double rating, int year) {
        this.genre = genre;
        this.rating = rating;
        this.title = title;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }
    //    public String toString(Movie movie){
//        return "Title: "+title+" Genre: "+genre+" Rating: "+rating+" Year: "+year;
//    };
}
