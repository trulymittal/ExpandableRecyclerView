package com.example.expandablerecycler;

public class Movie {

    private String title;
    private String rating;
    private String year;
    private String plot;
    private boolean expanded;

    public Movie(String title, String rating, String year, String plot) {
        this.title = title;
        this.rating = rating;
        this.year = year;
        this.plot = plot;
        this.expanded = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating='" + rating + '\'' +
                ", year='" + year + '\'' +
                ", plot='" + plot + '\'' +
                ", expanded=" + expanded +
                '}';
    }
}
