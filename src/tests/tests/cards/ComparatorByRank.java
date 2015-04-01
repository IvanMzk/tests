package tests.tests.cards;

/**
 * Created by ivann on 01.04.15.
 */
import java.util.*;

public class ComparatorByRank implements Comparator {

    public int compare(Object o1, Object o2){
        Card c1 = (Card) o1;
        Card c2 = (Card) o2;
        int rankDiff = c1.getRank().getNumber() - c2.getRank().getNumber();

        if (rankDiff != 0)
        {return rankDiff/Math.abs(rankDiff);}

        int suitDiff = c1.getSuit().getNumber() - c2.getSuit().getNumber();
        return suitDiff/Math.abs(suitDiff);
    }


}
