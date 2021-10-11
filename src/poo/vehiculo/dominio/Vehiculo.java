package poo.vehiculo.dominio;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String color;
    protected int velocidad;

    public void acelerar(int incremento) {
        System.out.println("Acelerando vehiculo... ");
        this.velocidad += incremento;
    }

    public void frenar(int decremento) {
        this.velocidad -= decremento;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setColor(String color) {
        this.color = color;
    }
}