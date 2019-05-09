package klondike;

import klondike.utils.IO;

public class Card {

    private static final String WRITE_FORMAT = "#number of #suit";

    private Suit suit;

    private Number number;

    private boolean facedUp;

    public Card(Suit suit, Number number) {
        assert suit != null;
        assert number != null;
        this.suit = suit;
        this.number = number;
        this.facedUp = false;
    }

    public boolean isNextTo(Card card) {
        return (this.getNumber().getValue() - 1) == card.getNumber().getValue();
    }

    public Number getNumber() {
        return this.number;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Color getColor() {
        return this.suit.getColor();
    }

    public void writeln() {
        String output = this.facedUp ?
                Card.WRITE_FORMAT.replace("#number", this.number.toString().toLowerCase())
                        .replace("#suit", this.suit.toString().toLowerCase()) :
                Card.WRITE_FORMAT.replace("#number", "XXXX")
                        .replace("#suit", "XXXX");
        IO.writeln(output);
    }

    public Card flip() {
        this.facedUp = !this.facedUp;
        return this;
    }

    public boolean isFacedUp() {
        return facedUp;
    }

}
