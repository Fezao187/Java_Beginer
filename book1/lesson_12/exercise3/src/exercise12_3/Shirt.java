package exercise12_3;

public class Shirt extends Item{
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColor Code: "+ colorCode);
    } 
    
    // Code a public getColor method that converts the colorCode to a the color name
       // Use a switch statement.  Return the color name.
    public String getColor(){
        String color = "";
        switch(this.colorCode){
            case 'B':
                color= "Black";
                break;
            case 'G':
                color= "Green";
                break;
            case 'R':
                color= "Red";
                break;
            case 'Y':
                color= "Yellow";
                break;
            case 'C':
                color= "Cyan";
                break;
            default:
                color= "Color does not exist";
                break;
        }
        return color;
    }
}
