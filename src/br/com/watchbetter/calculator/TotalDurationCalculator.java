package br.com.watchbetter.calculator;

import br.com.watchbetter.stream.Titulos;

public class TotalDurationCalculator {
    private int totalDuration;

    public int getTotalDuration() {
        return totalDuration;
    }
        
    public void addDuration(Titulos title) {
        this.totalDuration += title.getDurationInMinutes();
    }

    public void showTotalDuration() {
        System.out.println("Total duration: " + getTotalDuration() + " minutes.");
    }

}