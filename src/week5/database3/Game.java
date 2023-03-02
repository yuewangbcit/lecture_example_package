package src.week5.database3;

import java.util.Objects;

public class Game extends Item {
    private int numberOfPlayers;

    public Game(String theTitle, int theNumber) {
        super(theTitle);
        numberOfPlayers = theNumber;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + super.getTitle() + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", comment='" + super.getComment() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(super.getTitle(), game.getTitle())
                && numberOfPlayers == game.numberOfPlayers
                && Objects.equals(super.getComment(), game.getComment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPlayers);
    }
}

