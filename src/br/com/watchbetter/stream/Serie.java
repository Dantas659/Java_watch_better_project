package br.com.watchbetter.stream;

public class Serie extends Titulos  {
     public Serie(String name, int releaseYear) {
        super(name, releaseYear);
    }

     private int seasons;
     private int episodesPerSeason;
     private int minutesPerEpisode;
    
 
     // Métodos para definir os atributos
     public void setSeasons(int seasons) {
         this.seasons = seasons;
     }
 
     public void setEpisodesPerSeason(int episodesPerSeason) {
         this.episodesPerSeason = episodesPerSeason;     }
 
     public void setMinutesPerEpisode(int minutesPerEpisode) {
         this.minutesPerEpisode = minutesPerEpisode;
     }


     @Override
     public int getDurationInMinutes() {
        return seasons * episodesPerSeason * minutesPerEpisode;
     }

        @Override
     public void showMovieData() {
        System.out.println("Name: " + getName() + "\nRelease year: " + getReleaseYear() + "\nAuthor: " + getAuthor() + "\nGenre: " + getGenre() + "\nSynopsis: " + getSynopsis() + "\nRating: " + averageRating() + "\nDuration: " + getDurationInMinutes() + "\nIncluded in plan: " + getIncludedInPlan());
        
    }
 }

    