package exercise12_3;

public class ShoppingCart {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        Item item1 = new Shirt(25,'S','F');
        
        // call the display method on the object, then the getColor method
        item1.display();
        if(item1 instanceof Shirt){
            String color = ((Shirt) item1).getColor();
            System.out.println("\tColor: "+color);
        }else{
            System.out.println("Object is not instance of exercise12_3.Shirt.");
        }
    }
}
