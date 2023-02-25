package week4.database2;

import java.util.Objects;

public class DVD extends Item {
    private String director;

    public DVD(String theTitle, String theDirector) {
        super(theTitle);
        director = theDirector;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public String toString() {
        return "DVD{" +
                "title='" + super.getTitle() + '\'' +
                ", director='" + director + '\'' +
                ", comment='" + super.getComment() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DVD dvd = (DVD) o;
        return Objects.equals(super.getTitle(), dvd.getTitle())
                && Objects.equals(director, dvd.director)
                && Objects.equals(super.getComment(), dvd.getComment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getTitle(), director, super.getComment());
    }

    public void print() {
        System.out.print(toString());
    }
}
