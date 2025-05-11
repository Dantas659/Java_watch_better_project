package br.com.watchbetter.stream;

import br.com.watchbetter.calculator.Rateable;

public class Episode extends Serie implements Rateable {
    public Episode(String name, int releaseYear) {
        super(name, releaseYear);
        //TODO Auto-generated constructor stub
    }

    private int number;
    private String title;
    private Serie serie;

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSerie() {
        return serie.getName();
    }

    public int getConvertRatingToStars(){
        return (int) averageRating() / 2;
    };

}
