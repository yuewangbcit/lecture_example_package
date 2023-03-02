package src.week4.database1;

import java.util.Objects;

public class DVD {
    private String title;
    private String director;
    private String comment;

    public DVD(String theTitle, String theDirector) {
        title = theTitle;
        director = theDirector;
        comment = " ";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DVD dvd = (DVD) o;
        return Objects.equals(title, dvd.title) && Objects.equals(director, dvd.director) && Objects.equals(comment, dvd.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, director, comment);
    }

    public void print() {
        System.out.print(toString());
    }
}
