package poo.tarea.figuraGeometrica.app;

import poo.tarea.figuraGeometrica.dominio.FiguraGeometrica;
import poo.tarea.figuraGeometrica.dominio.figuras.Circulo;
import poo.tarea.figuraGeometrica.dominio.figuras.Cuadrado;
import poo.tarea.figuraGeometrica.dominio.figuras.TrianguloRectangulo;
import poo.vehiculo.dominio.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class AppFiguras {
    public static void main(String[] args) {
        List<FiguraGeometrica> figuras = new ArrayList<>();

        Circulo cir1 = new Circulo(5);
        Cuadrado cuad = new Cuadrado(5);
        TrianguloRectangulo trian = new TrianguloRectangulo(5, 6);

        figuras.add(cir1);
        figuras.add(cuad);
        figuras.add(trian);

        figuras.forEach(fig -> {
            if (fig instanceof Circulo) {
                System.out.println("\nCirculo");
                System.out.println("\nEl área del circulo es: " + fig.calcularArea() + " cm cuadrados");
                System.out.println("El perímetro del circulo es: " +fig.calcularPerimetro() + " cm");
            }
        });

        figuras.forEach(fig -> {
            if (fig instanceof TrianguloRectangulo) {
                System.out.println("\nTriangulo Rectangulo");
                System.out.println("\nEl área del triangulo rectangulo es: " + fig.calcularArea() + " cm cuadrados");
                System.out.println("El perímetro del triangulo rectangulo es: " + fig.calcularPerimetro() + " cm");
            }
        });


    }
}
