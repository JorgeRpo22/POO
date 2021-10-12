package poo.tarea.figuraGeometrica.dominio.figuras;

public class TrianguloRectangulo extends Triangulo{
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double areaTriangulo = ((this.altura * this.base)/2);
        return areaTriangulo;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroTriangulo = Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
        return perimetroTriangulo;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
