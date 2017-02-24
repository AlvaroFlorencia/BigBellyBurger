
package bigbellyburger;


public class Deluxe  extends Basic{    //Hamburguesa deluxe  hereda de de hamburguesa básica

    
    
    public Deluxe(String breadType ,String meatType , double price,Ingredent //Constructor
            addition,Ingredent addition2)
    {
        super(breadType,meatType,price);   //Función super indicando que estos atributos son distintos a la clase basic
        limAddition=2;
        this.setAddition(addition);      //Se agregan 2 ingredientes predifinidos debido a que el limite es adiciones es 2
        this.setAddition(addition2);
                
    }
    public Deluxe(String breadType ,String meatType , double price,String name1,double price1,String name2,double price2)
    {
        super(breadType,meatType,price);        //Función super indicando que estos atributos son distintos a la clase basic
        limAddition=2;
        this.setAddition(name1,price1);
        this.setAddition(name2,price2);          //Se agregan 2 ingredientes predifinidos debido a que el limite es adiciones es 2 , pero en este caso 
                                                 //en vez del objeto ingrediente, se pide nombre y precio para crear un nuevo ingrediente
    }
    @Override
    public void getTotal()
    {
        System.out.println("This a Deluxe Burger");  //Se manda un mensaje  diciendo que es una hamburguesa deluxe
        super.getTotal();                            //Se envía total
        
    }
    
    
}
