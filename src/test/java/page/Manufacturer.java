package page;

public enum Manufacturer {
    LG("LG", "lg");

    private final String name;
    private final String xpathValue;

    Manufacturer(String name, String xpathValue) {
        this.name = name;
        this.xpathValue = xpathValue;
    }

    public String getXpathValue() {
        return xpathValue;
    }

    public String getName() {
        return name;
    }
}