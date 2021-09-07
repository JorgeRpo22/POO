package poo.taller.punto2b.dominio;

public class Contacto {
    public static final int NRO_MAX_CONTACTOS = 20;
    private static int nroContactos;

    private String nombre;
    private String apellido;
    private String numeroCelular;

    public Contacto(String nombre, String apellido, String numeroCelular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCelular = numeroCelular;
        nroContactos++;
    }

    public static Contacto crear(String nombre, String apellido, String numeroCelular) {
        if (nroContactos < NRO_MAX_CONTACTOS) {
            return new Contacto(nombre, apellido, numeroCelular);
        } else {
            System.out.println("No es posible crear más contactos");
            return null;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
}
