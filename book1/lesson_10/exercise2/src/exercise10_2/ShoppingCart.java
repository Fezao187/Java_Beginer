
package exercise10_2;

import exercise10_2.Order;

public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Rick Wilson", 910.00, "VA", Order.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
