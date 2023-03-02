package src.week5.database3;

import java.util.Objects;

public class VideoGame extends Game {
    private String platform;

    public VideoGame(String theTitle, int theNumber, String thePlatform) {
        super(theTitle, theNumber);
        platform = thePlatform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + super.getTitle() + '\'' +
                ", platform='" + platform + '\'' +
                ", numberOfPlayers=" + super.getNumberOfPlayers() +
                ", comment='" + super.getComment() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VideoGame videoGame = (VideoGame) o;
        return Objects.equals(super.getTitle(), videoGame.getTitle())
                && Objects.equals(super.getNumberOfPlayers(), videoGame.getNumberOfPlayers())
                && Objects.equals(super.getComment(), videoGame.getComment())
                && Objects.equals(platform, videoGame.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), platform);
    }
}
