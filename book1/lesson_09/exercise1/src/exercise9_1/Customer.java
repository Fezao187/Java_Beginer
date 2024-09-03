package exercise9_1;


public class Customer {
    private String name;
    private String ssn;
   
    // Encapsulate this class.  Make ssn read only.

    public String getName() {
        return name;
    }
    public void setName(String strName) {
        this.name = strName;
    }

    public String getSsn() {
        return ssn;
    }
}
