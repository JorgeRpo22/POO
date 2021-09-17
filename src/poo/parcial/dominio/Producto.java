package poo.parcial.dominio;

public class Producto {
    public static final int NUMERO_MAX_PRODUCTOS = 20;
    private static int nroProductos;

    private String nombre;
    private int precio;
    private String tipo;

    public Producto(String nombre, int precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        nroProductos++;
    }

    public static Producto crear(String nombre, int precio, String tipo) {
        if (nroProductos < NUMERO_MAX_PRODUCTOS) {
            return new Producto(nombre, precio, tipo);
        } else {
            System.out.println("No es posible agregar más productos, el carrito está lleno");
            return null;
        }
    }

    public static int getNroProductos() {
        return nroProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
