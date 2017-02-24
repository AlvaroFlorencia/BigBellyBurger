
package bigbellyburger;


public class BigBellyBurger {

    
    public static void main(String[] args) {
         Basic hamburguesa = new Basic("Pan","carne",53.0);
        
        Ingredent Aros = new Ingredent("Anions rings",15.0);
        hamburguesa.setAddition(Aros);
        System.out.println("");
        
    }
    
}
