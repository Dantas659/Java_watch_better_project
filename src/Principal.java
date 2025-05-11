import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.watchbetter.calculator.TotalDurationCalculator;
import br.com.watchbetter.stream.Movie;
import br.com.watchbetter.stream.Serie;
import br.com.watchbetter.stream.Titulos;

public class Principal extends Titulos{
    public Principal(String name, int releaseYear) {
        super(name, releaseYear);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) throws Exception {
        final Movie interstellar  = new Movie("Interstellar", 2014);
        interstellar.setAuthor("Christopher Nolan");
        interstellar.setGenre("Science Fiction");
        interstellar.setSynopsis("A team of explorers travels through a wormhole in space in an attempt to ensure humanity\'s survival.");
        interstellar.setDurationInMinutes(169);
        interstellar.setIncludedInPlan(true);
        
        interstellar.rating(3.4);
        interstellar.rating(10.0);
        interstellar.rating(10.0);

        interstellar.showMovieData();


        final Serie breakingBad = new Serie("Breaking Bad", 2008);
        breakingBad.setAuthor("Vince Gilligan");
        breakingBad.setGenre("Crime, Drama, Thriller");
        breakingBad.setSynopsis("A high school chemistry teacher turned methamphetamine manufacturer partners with a former student to secure his family's future.");
        breakingBad.setSeasons(5);
        breakingBad.setEpisodesPerSeason(13);
        breakingBad.setMinutesPerEpisode(47);
        breakingBad.setIncludedInPlan(true);
        breakingBad.getDurationInMinutes();

        breakingBad.rating(9.0);
        breakingBad.rating(7.0);
        breakingBad.rating(8.0);
        
        breakingBad.showMovieData();

        
        TotalDurationCalculator totalDuration = new TotalDurationCalculator();
        totalDuration.addDuration(interstellar);
        totalDuration.addDuration(breakingBad);
        totalDuration.showTotalDuration();

        ArrayList<Titulos> titles = new ArrayList<>();
        titles.add(interstellar);
        titles.add(breakingBad);
        System.out.println("Total number of titles: " + titles.size());
        System.out.println("First title: " + titles.get(0).getName());
        System.out.println("Second title: " + titles.get(1).getName());
        System.out.println(titles);
        titles.sort(Comparator.comparing(Titulos:: getReleaseYear));
        System.out.println(titles);

        Collections.sort(titles);


        for(Titulos item: titles){
            System.out.println(item.getName());
            if(item instanceof Movie movie) {
                System.out.println(movie.getConvertRatingToStars());

            }
            
        }

        ArrayList<String> artists = new ArrayList<>();
        artists.add("Matthew McConaughey");
        artists.add("Anne Hathaway");
        artists.add("Bryan Cranston");
        Collections.sort(artists);
        System.out.println("Artists: " + artists);

        
        

        
        


  

    }
}