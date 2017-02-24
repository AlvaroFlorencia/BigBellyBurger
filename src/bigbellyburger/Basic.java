

package bigbellyburger;

import java.util.ArrayList;


public class Basic {
    private String breadType;
    private String meatType;                //Atributos
    private double price;
    protected int limAddition;
    private ArrayList<Ingredent> additions= new ArrayList<Ingredent>();     

    public Basic(String breadType, String meatType, double price) {
        this.breadType = breadType;
        this.meatType = meatType;                                       //Constructor
        this.price = price;
        this.additions=new ArrayList<Ingredent>();
        this.limAddition=4;                                      //Debido a que  es basica el número de adiciones es 4 
    }

    public boolean setAddition(Ingredent addition) {           //Para agregar un ingrediente se utiliza un if comparando la longitud del ArrayList con
        if(additions.size()<=this.limAddition)                 //el total de adiciones
        {
            return additions.add(addition);                    //Si es verdadero se añade la adición
        }
        else
        {
            
        System.out.println("limit excedd");                     //Si es falso se envía un mensaje de que se excedio el limite
        return false;
    }  
    }
    public boolean setAddition(String name, double price)      // Otro método con el cuál se pueden agregar ingredientes es introduciendo el nombre  y precio
    {                                                         //Se  hace un if similar  solo que en este caso cuando es verdaero se crea un nuevo  ingrediente   
       if(additions.size()<=this.limAddition)                 //con los atributos que se proporcionaron, si la condición es falsa se manda un mensaje de que se excedio el limite
        {
            return additions.add(new Ingredent(name,price));
        }
       else 
           
        {
            
        System.out.println("limit excedd");
        return false;
    }
    }
    public void getTotal()        
    {double total=0;
        System.out.println("this is a traditional"+ this.meatType +  "burger" + "in"+ this.breadType +  //En el total se manda un mensaje con todas las especificaciones de la hamburguesa
                "with a base price of "+this.price);
        total +=this.price;                                         //Al total se le añade precio
        for(Ingredent tempIngredent :this.additions)
        {
            
           System.out.println("plus" + tempIngredent.getName()+ "at" + tempIngredent.getPrice()); //Mediante un super for se muestran los atriutos de cada ingrediente adicional
        total+=tempIngredent.getPrice();                                                           //A total se le va aumnetando el precio de los ingredientes
        
        }
        System.out.println("with a grand total of"+total);               //Se manda un mensaje con el total final 
        
    }
    
    
}
