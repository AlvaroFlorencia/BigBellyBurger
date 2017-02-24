
package bigbellyburger;


public class Healthy  extends Basic{   //Hamburguesa saludable  hereda de de hamburguesa básica
    
public Healthy(String meatType ,String breadType,double price) //Se  utliza un constructor pideindo el tipo de carne ,tipo de pan y el precio. 
{
    super(breadType,meatType ,price);                           //Función super indicando que estos atributos son distintos a la clase basic
    limAddition=6;
    
}
@Override
    public void getTotal()
    {
        System.out.println("This a Healthy Burger");   //Se manda un mensaje  diciendo que es una hamburguesa saludable
        super.getTotal();                               //Se envía total
        
    }
        
}
