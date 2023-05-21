package Part10.Exercise17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> cardsList;

    public Hand() {
        this.cardsList = new ArrayList<>();
    }

    public void add(Card card) {
        cardsList.add(card);
    }

    public void print() {
        cardsList.stream()
                .forEach(card -> System.out.println(card.toString()));
    }

    public void sort() {

        Collections.sort(this.cardsList, (card1, card2) -> card1.compareTo(card2));
    }

    @Override
    public int compareTo(Hand hand) {

        int thisHandValuesSum = this.cardsList.stream()
                .map(card -> card.getValue())
                .reduce(0, Integer::sum);

        int comparedHandValuesSum = hand.cardsList.stream()
                .map(card -> card.getValue())
                .reduce(0, Integer::sum);

        if (thisHandValuesSum < comparedHandValuesSum) {
            return -1;
        } else if (thisHandValuesSum > comparedHandValuesSum) {
            return 1;
        } else {
            return 0;
        }
    }

    public void sortBySuit() {

        Collections.sort(cardsList, (card1, card2) -> {
            if (card1.getSuit().ordinal() == card2.getSuit().ordinal()) {
                return card1.getValue() - card2.getValue();
            } else {
                return card1.getSuit().ordinal() - card2.getSuit().ordinal();
            }
        });
    }
}