public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Hand dave = new Hand();
        Hand humza = new Hand();

        dave.deal(deck.deal());
        dave.deal(deck.deal());
        humza.deal(deck.deal());
        humza.deal(deck.deal());

        if (dave.getValue() > 21) {
            System.out.println("Dave busts!");
        } else System.out.println("Dave's hand value is: " + dave.getValue());

        if (humza.getValue() > 21) {
            System.out.println("Humza busts!");
        } else System.out.println("Humza's hand value is: " + humza.getValue());

        if (dave.getValue() > humza.getValue()) {
            System.out.println("Dave wins!");
        } else if (humza.getValue() > dave.getValue()) {
            System.out.println("Humza wins!");
        } else {
            System.out.println("Tie!");
        }
    }
}
