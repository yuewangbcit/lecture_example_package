package week5.database3;

import java.util.Objects;

public class BoardGame extends Game {
    private int width;
    private int height;

    public BoardGame(String theTitle, int theNumber, int width, int height) {
        super(theTitle, theNumber);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + super.getTitle() + '\'' +
                ", numberOfPlayers=" + super.getNumberOfPlayers() +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", comment='" + super.getComment() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BoardGame boardGame = (BoardGame) o;
        return Objects.equals(super.getTitle(), boardGame.getTitle())
                && Objects.equals(super.getNumberOfPlayers(), boardGame.getNumberOfPlayers())
                && Objects.equals(super.getComment(), boardGame.getComment())
                && width == boardGame.getWidth()
                && height == boardGame.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }
}