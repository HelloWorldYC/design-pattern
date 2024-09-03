package myc.decorator_pattern.util;

public enum SizeEnum {
    TALL("tall", 0.10),
    GRANDE("grande", 0.15),
    VENTI("venti", 0.20);

    private final String size;
    private final double dollars;

    SizeEnum(String size, double dollars) {
        this.size = size;
        this.dollars = dollars;
    }

    public String getSize() {
        return size;
    }

    public double getDollars() {
        return dollars;
    }

    public static SizeEnum getSizeEnum(String size) {
        if (TALL.getSize().equals(size)) {
            return TALL;
        } else if (GRANDE.getSize().equals(size)) {
            return GRANDE;
        } else if (VENTI.getSize().equals(size)) {
            return VENTI;
        } else {
            return null;
        }
    }
}
