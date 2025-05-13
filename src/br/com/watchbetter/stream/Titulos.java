package br.com.watchbetter.stream;

public class Titulos implements Comparable<Titulos> {
    private String name;
    private String author;
    private String genre;
    private String synopsis;
    private int releaseYear;
    private int totalRatings;
    private int durationInMinutes;
    private double rating;
    private boolean includedInPlan;

    public Titulos(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Titulos(TitulosOmdb myTitleOmdb) {
       this.name = myTitleOmdb.title();
       this.releaseYear = Integer.valueOf(myTitleOmdb.year());
       this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0,2));
       this.genre = myTitleOmdb.genre();
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;

    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    public String getSynopsis() {
        return synopsis;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
  
    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }
    public boolean getIncludedInPlan() {
        return includedInPlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void showMovieData() {
        System.out.println("Name: " + name + "\nRelease year: " + releaseYear + "\nAuthor: " + author + "\nGenre: " + genre + "\nSynopsis: " + synopsis + "\nRating: " + averageRating() + "\nDuration: " + durationInMinutes + "\nIncluded in plan: " + includedInPlan);
        
    }

   public void rating(double userReating) {
        rating += userReating;
        totalRatings++;
    }
    
   public double averageRating() {
        return rating / totalRatings;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
    @Override
    public String toString() {
        return "Titulos [name=" + name + ", author=" + author + ", genre=" + genre + ", releaseYear=" + releaseYear + "]";
    }

    @Override
    public int compareTo(Titulos otherTitleTitulos) {
        return this.getName().compareTo(otherTitleTitulos.getName());
    }

    



}

