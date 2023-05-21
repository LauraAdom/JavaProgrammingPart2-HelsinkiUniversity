package Part10.Exercise17;

import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    public int compare(Card card1, Card card2) {

        if (card1.getSuit().ordinal() == card2.getSuit().ordinal()) {
            return card1.getValue() - card2.getValue();
        } else {
            return card1.getSuit().ordinal() - card2.getSuit().ordinal();
        }
    }
}
