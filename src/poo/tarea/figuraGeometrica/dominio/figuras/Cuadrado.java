package poo.tarea.figuraGeometrica.dominio.figuras;

import poo.tarea.figuraGeometrica.dominio.FiguraGeometrica;

public class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double areaCuadrado = this.lado * this.lado;
        return areaCuadrado;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroCuadrado = 4 * this.lado;
        return perimetroCuadrado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
