package poo.tarea.figuraGeometrica.dominio.figuras;

import poo.tarea.figuraGeometrica.dominio.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area = (Math.PI * Math.pow(this.radio, 2));
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (2 * Math.PI * this.radio);
        return perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
