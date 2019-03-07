

package ejemplosingleton;

/**
 *
 * @author clamascabaleiro
 */
public class EjemploSingleton {

 
    public static void main(String[] args) {
       Unico juan = Unico.getSingleton("Juan WiiFlow");
       Unico chris = Unico.getSingleton("Clamas");
        
        // juan y chris son referencias a un único objeto de la clase SoyUnico
        System.out.println(juan.getNombre());
        System.out.println(chris.getNombre());   
    }

}
