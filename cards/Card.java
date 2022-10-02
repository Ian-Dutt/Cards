package cards;

import java.lang.String;

public class Card {
    private String suit;
    private char cardNumber;
    public Card(String suit, char cardNumber){
        this.suit = suit;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString(){
        return "+------------+\n" +
            String.format("|%12C|\n", this.cardNumber) + 
               "|            |\n" + 
               "|            |\n" +
               "|            |\n" +
               "|            |\n" +
            String.format("|%-12C|\n", this.cardNumber) +
                "+------------+\n";
    }
}