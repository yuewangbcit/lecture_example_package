package src.week13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Deck {
    private enum Suit {
        Spade, Diamond, Club, Heart
    }

    private enum Rank {
        Ace, Two, Three, Four, Five, Six, Seven,
        Eight, Nine, Ten, Jack, Queen, King
    }

    class Card {
        private Suit suit;
        private Rank rank;
        Card(Suit suit, Rank rank) {
            this.suit = suit;
            this.rank = rank;
        }

        public String toString() {
            return rank.toString() + " of " + suit.toString();
        }
    }
    private List<Card> newDeck() {
        return Stream.of(Suit.values())
                .flatMap(suit ->
                        Stream.of(Rank.values())
                                .map(rank -> new Card(suit, rank)))
                .collect(toList());
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        for(Card card : deck.newDeck()) {
            System.out.println(card);
        }

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double result = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        System.out.println(result);
    }
}
