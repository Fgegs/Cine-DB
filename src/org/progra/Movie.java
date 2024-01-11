
package org.progra;


public class Movie {


    private String title;
    private String description;
    private String duration;
    private String classification;

    // Constructor
    public Movie(String title, String description, String duration, String classification) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.classification = classification;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    // Override toString for debugging purposes
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration='" + duration + '\'' +
                ", classification='" + classification + '\'' +
                '}';
    }
   
}
