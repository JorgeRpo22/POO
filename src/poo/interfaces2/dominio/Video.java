package poo.interfaces2.dominio;

public class Video implements Viruseable{
    private String nombre;
    private double tamano;
    private int duracion;

    public Video(String nombre, double tamano, int duracion) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.duracion = duracion;
    }

    @Override
    public boolean tieneVirus() {
        return this.tamano < 50000 && this.duracion > 120 ? true: false;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public int getDuracion() {
        return duracion;
    }
}
