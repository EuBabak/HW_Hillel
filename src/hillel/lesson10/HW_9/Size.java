package hillel.lesson10.HW_9;

public enum Size {
    S("S", 10, 15),
    M("M", 15, 20),
    XL("XL", 20, 25);

    private final String abbreviation;
    private final int width;
    private final int length;


    Size(String abbreviation, int width, int length) {
        this.abbreviation = abbreviation;
        this.width = width;
        this.length = length;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Size " + abbreviation + ": width = " + width + ", length = " + length + ";";
    }
}
