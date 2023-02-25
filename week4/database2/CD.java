package week4.database2;

import java.util.Objects;

public class CD extends Item {
    private String artist;

    public CD(String theTitle, String theArtist) {
        super(theTitle);
        artist = theArtist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "CD{" +
                "title='" + super.getTitle() + '\'' +
                ", artist='" + artist + '\'' +
                ", comment='" + super.getComment() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CD cd = (CD) o;
        return Objects.equals(super.getTitle(), cd.getTitle())
                && Objects.equals(artist, cd.artist)
                && Objects.equals(super.getComment(), cd.getComment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getTitle(), artist, super.getComment());
    }

}
