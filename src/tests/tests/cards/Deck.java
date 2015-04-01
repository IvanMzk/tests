package tests.tests.cards;

import sun.org.mozilla.javascript.internal.ast.CatchClause;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
/**
 * Created by ivann on 01.04.15.
 */
public class Deck {

    private List<Card> deck;

    public Deck() {

        this.deck = new ArrayList<Card>();
        for (Suit s : Suit.values())
            for (Rank r : Rank.values())
            {
                Card card = new Card(s,r);
                deck.add(card);
            }


    }

    public void sortBySuit(){
        Collections.sort(deck);
    }

    public void sortByRank(){
        Comparator c = new ComparatorByRank();
        Collections.sort(deck, c);
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public int size(){
        return deck.size();
    }

    public void printDeck(){
        ListIterator<Card> i = deck.listIterator();
        Card c;
        try {
            while(true) {
                c = i.next();
                System.out.println(c.toString());
            }
        } catch (NoSuchElementException e){}
    }

}
