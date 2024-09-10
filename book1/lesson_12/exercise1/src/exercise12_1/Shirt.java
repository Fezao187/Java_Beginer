package exercise12_1;

public class Shirt extends Item{
    private char colorCode;
    private char size;

    public Shirt(double price, char colorCode, char size) {
        super("Shirt", price);
        this.colorCode = colorCode;
        this.size = size;
    }
}
