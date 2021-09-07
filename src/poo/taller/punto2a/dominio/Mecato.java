package poo.taller.punto2a.dominio;

public class Mecato {
    private int codigo;
    private String nombre;
    private int precio;
    private int cantidadActual;

    public Mecato(int codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Mecato(int codigo, String nombre, int precio, int cantidadActual) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadActual = cantidadActual;
    }

    public void sacarProducto() {
        if (this.cantidadActual == 0) {
            System.out.println("No hay productos existentes para retirar");
        } else {
            this.cantidadActual = this.cantidadActual -1;
            System.out.println("Gracias por comprar el producto");
        }
    }


    public void aumentarStck(int CantidadAAumentar) {
        this.cantidadActual = this.cantidadActual + CantidadAAumentar;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
