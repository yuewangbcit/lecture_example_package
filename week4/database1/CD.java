package week4.database1;

import java.util.Objects;

public class CD {
    private String title;
    private String artist;
    private String comment;

    public CD(String theTitle, String theArtist) {
        title = theTitle;
        artist = theArtist;
        comment = " ";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "CD{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CD cd = (CD) o;
        return Objects.equals(title, cd.title) && Objects.equals(artist, cd.artist) && Objects.equals(comment, cd.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, comment);
    }

    public void print() {
        System.out.print(toString());
    }
}
