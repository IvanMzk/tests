package tests.tests.cards;

/**
 * Created by ivann on 01.04.15.
 */

enum Suit{
    PIKI(1,"Piki"),
    TREFY(2,"Trefy"),
    Bubny(3,"Bubny"),
    CHERVY(4,"Chervy");


    private final int number;
    private final String suitName;

    Suit(int number, String suitName) {
        this.number = number;
        this.suitName = suitName;
    }

    public int getNumber() {
        return number;
    }

    public String getSuitName() {
        return suitName;
    }
}

enum Rank{

    TWO(2,"Two"),
    THREE(3,"Three"),
    FOUR(4,"Four"),
    FIVE(5,"Five"),
    SIX(6,"Six"),
    SEVEN(7,"Seven"),
    EIGHT(8,"Eight"),
    NINE(9,"Nine"),
    TEN(10,"Ten"),
    VALET(11,"Valet"),
    DAMA(12,"Dama"),
    KOROL(13,"Korol"),
    TUZ(14,"Tuz");


    private final int number;
    private final String rankName;

    Rank(int number, String rankName) {
        this.number = number;
        this.rankName = rankName;
    }

    public int getNumber() {
        return number;
    }

    public String getRankName() {
        return rankName;
    }
}

