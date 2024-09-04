
package exercise10_2;

public class Order {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    public void calcDiscount() {
         if(this.custType == NONPROFIT) {
            if(total>900){
                this.discount = 10;
            }else{
                this.discount=5;
            }
         } else if (this.custType ==PRIVATE) {
             if(total>900){
                 this.discount = 5;
             }else{
                 this.discount=0;
             }
         }else if(this.custType == CORP) {
             if(total<500){
                 this.discount=8;
             }else {
                 this.discount=5;
             }
         }else {
             this.discount=0;
         }
    }
}
