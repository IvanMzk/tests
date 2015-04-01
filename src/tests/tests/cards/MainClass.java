package tests.tests.cards;

/**
 * Created by ivann on 01.04.15.
 */
public class MainClass {

    public static void main(String[] args) {

        Deck deck = new Deck();
        System.out.println(deck.size());
        deck.shuffle();
        deck.sortBySuit();
        deck.printDeck();






    }

}
