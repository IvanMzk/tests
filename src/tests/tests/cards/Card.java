package tests.tests.cards;

/**
 * Created by ivann on 01.04.15.
 */

public class Card implements Comparable {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (rank != card.rank) return false;
        if (suit != card.suit) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (suit.getNumber()*13 + rank.getNumber());
    }

    public int compareTo(Object o) {
        Card c  = (Card) o;

        if ((hashCode() - c.hashCode()) > 0)
        return 1;
        if ((hashCode() - c.hashCode()) < 0)
        return -1;

        return 0;

    }

    @Override
    public String toString() {
        return suit.getSuitName() + rank.getRankName();
    }
}
