package ejemplosingleton;

/**
 *
 * @author clamascabaleiro
 */
public class Unico {

    private String nombre;
    private static Unico soyUnico;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private Unico(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static Unico getSingleton(String nombre) {
        if (soyUnico == null) {
            soyUnico = new Unico(nombre);
        } else {
            System.out.println("No se puede crear el objeto " + nombre + " porque ya existe un objeto de la clase Unico");
        }

        return soyUnico;
    }

    // metodos getter y setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void setSoyUnico(Unico soyUnico) {
        Unico.soyUnico = soyUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public static Unico getSoyUnico() {
        return soyUnico;
    }

}
