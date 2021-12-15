package final_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Add List of movies based on the classes created above.
//For all movies released before 2000, add the string "(Classic)" to the title of the movie using flatMap.
//
//Get the latest 3 movies released using .limit() method of stream.
//Create a predicate for release date before 2000 and a predicate for release date before 1990
//and then Chain the predicates for finding movies between 1990 and 2000.
//
//Write a method which that will add release year in the title of the movie and return the title and
//then use this method for all the movies.
//
//Sorting on one of the feature(Ex: Released year or title) which will use comparator.
public class Main {
    public static void main(String[] args) throws ParseException {
        Date twoThousand = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date nineteenHundred = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        Movie a = new Movie("Titanic", new GregorianCalendar(2003, Calendar.FEBRUARY, 15).getTime(),
                Arrays.asList("Sam", "Frank"), "Tom");
        Movie b = new Movie("Robot Club", new GregorianCalendar(1987, Calendar.AUGUST, 03).getTime(),
                Arrays.asList("Amy", "Zuck", "Tommy"), "Hawking");
        Movie c = new Movie("Toy's Story", new GregorianCalendar(2020, Calendar.DECEMBER, 01).getTime(),
                Arrays.asList("Jerry", "Madison"), "Simon");
        Movie d = new Movie("Space Shuttle", new GregorianCalendar(1997, Calendar.JUNE, 24).getTime(),
                Arrays.asList("Derek", "Hillson"), "George");

        //Add List of movies based on the classes created above.
        List<Movie> movieList = new ArrayList<>();
        movieList.add(a);
        movieList.add(b);

        List<Movie> sadList = new ArrayList<>();
        sadList.add(c);
        sadList.add(d);

        Genre cosmetic = new Genre(movieList);
        Genre tragedy = new Genre(sadList);

        List<Genre> genreList = new ArrayList<>();
        genreList.add(cosmetic);
        genreList.add(tragedy);

        Netflix netflix = new Netflix(genreList);

        //For all movies released before 2000, add the string "(Classic)" to the title of the movie using flatMap.
        netflix.list.stream()
                .flatMap(genre -> genre.list.stream())
                .filter(movie -> movie.ReleaseDate.before(twoThousand))
                .forEach(movie -> movie.Title = movie.Title + "(Classic)");

        //Get the latest 3 movies released using .limit() method of stream.
        List<Movie> ans = netflix.list.stream().flatMap(genre -> genre.list.stream()).sorted(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.ReleaseDate.compareTo(o1.ReleaseDate);
            }
        }).limit(3).collect(Collectors.toList());

        //Create a predicate for release date before 2000 and a predicate for release date before 1990
        //and then Chain the predicates for finding movies between 1990 and 2000.
        List<Movie> listOfAllMovie = netflix.list.stream().flatMap(genre -> genre.list.stream()).collect(Collectors.toList());
        Predicate<Movie> dateBefore2000 = movie -> movie.ReleaseDate.before(twoThousand);
        Predicate<Movie> dateAfter1990 = movie -> movie.ReleaseDate.after(nineteenHundred);
        printMovieInRange((ArrayList<Movie>) listOfAllMovie, dateBefore2000, dateAfter1990);

        //Write a method which that will add release year in the title of the movie and return the title and
        //then use this method for all the movies.
        for(Movie movie : listOfAllMovie) addReleaseYear(movie);

        //Sorting on one of the feature(Ex: Released year or title) which will use comparator.
        Collections.sort(listOfAllMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.Title.compareTo(o2.Title);
            }
        });
    }

    private static void printMovieInRange(ArrayList<Movie> res, Predicate<Movie> condition1, Predicate<Movie> condition2){
        for (Movie movie: res) {
            if(condition1.test(movie) && condition2.test(movie)){
                System.out.println(movie.Title);
            }
        }
    }

    private static void addReleaseYear(Movie movie) {
        SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy");
        String year = dayFormat.format(movie.ReleaseDate);
        movie.Title = movie.Title + year;
    }
}
