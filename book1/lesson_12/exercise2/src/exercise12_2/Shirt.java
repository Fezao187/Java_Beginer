package exercise12_2;

public class Shirt extends Item{
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("exercise12_2.Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    } 
    
    // Override display() in the superclass to also show size and colorCode.
    public void display(){
        super.display();
        System.out.println("\tSize: " + size + "\n\tColor: " + colorCode);
    }
    //   Avoid duplicating code.
}
