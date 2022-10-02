import cards.Card;

class main{ 
    public static void main(String[] args) {
        Card card = new Card("spades", 'K');
        System.out.printf("%s", card.toString());
    }
}