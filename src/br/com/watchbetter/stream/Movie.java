package br.com.watchbetter.stream;

import br.com.watchbetter.calculator.Rateable;

public class Movie extends Titulos implements Rateable{
   

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    @Override
    public int getConvertRatingToStars(){
        return (int) averageRating() / 2;
    };
}