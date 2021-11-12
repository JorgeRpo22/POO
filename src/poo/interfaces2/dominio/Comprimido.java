package poo.interfaces2.dominio;

public class Comprimido implements Viruseable{
    private String nombre;
    private double tamano;

    public Comprimido(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    @Override
    public boolean tieneVirus() {
        return this.tamano > 150000 ? true : false;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public double getTamano() {
        return tamano;
    }
}