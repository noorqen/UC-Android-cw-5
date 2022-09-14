package com.example.classfive;

public class Movies {
    private String movieName;
    private int movieHrs;
    private int movieMints;
    private int movieImg;

    public Movies(String movieName, int movieHrs, int movieMints, int movieImg) {
        this.movieName = movieName;
        this.movieHrs = movieHrs;
        this.movieMints = movieMints;
        this.movieImg = movieImg;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieHrs() {
        return movieHrs;
    }

    public void setMovieHrs(int movieHrs) {
        this.movieHrs = movieHrs;
    }

    public int getMovieMints() {
        return movieMints;
    }

    public void setMovieMints(int movieMints) {
        this.movieMints = movieMints;
    }

    public int getMovieImg() {
        return movieImg;
    }

    public void setMovieImg(int movieImg) {
        this.movieImg = movieImg;
    }
}
