package collection.compare.test;

public enum Suit {
    SPACE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLUB("♣");

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
