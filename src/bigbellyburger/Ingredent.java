
package bigbellyburger;


public class Ingredent {
    private String name;
    private double price;   //Atributos

    public Ingredent(String name, double price) {
        this.name = name;                         //Constructor
        this.price = price;
    }

    public String getName() {                //Getters
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {        //Setters
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
