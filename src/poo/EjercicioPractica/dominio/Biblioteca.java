package poo.EjercicioPractica.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Biblioteca {
    private String nombre;
    private List<Recurso> recursos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.recursos = new ArrayList<>();
    }

    public void addRecurso(Recurso... r) {
        this.recursos.addAll(Arrays.asList(r));
    }

    public boolean prestarRecurso(Recurso r) {
        if (r instanceof Prestable) {
            if (r.isPrestado() == false) {
                ((Prestable) r).prestar();
                System.out.println("Se ha prestado el articulo: " + r.getNombre() + "  con exito.");
                return true;
            } else {
                recursos.forEach(recurso -> {
                    if (recurso.isPrestado() == true) {
                        System.out.println("El articulo: " + recurso.getNombre() +  " ya se encuentra prestado");
                    }
                });
                return false;
            }
        } else {
            System.out.println("No es un articulo prestable");
            return false;
        }
    }

    public boolean devolverRecurso(Recurso r) {
        if (r instanceof Prestable) {
            if (r.isPrestado() == true) {
                ((Prestable) r).devolver();
                System.out.println("Gracias por devolver el articulo: " + r.getNombre() + " regrese pronto");
                return false;
            } else {
                System.out.println("El articulo" + r.getNombre() + " ya ha sido devuelto");
                return true;
            }
        } else {
            System.out.println("El articulo no se puede recibir, porque no es un recurso que se pueda prestar.");
        }
        return false;
    }

    public void listarPrestados() {
        AtomicInteger cantidadPrestados = new AtomicInteger();

        recursos.forEach(recurso -> {
            if (recurso.isPrestado() == true) {
                cantidadPrestados.incrementAndGet();
                System.out.println("Articulos prestados: " + recurso.getNombre());
            }
        });

        System.out.println("La cantidad de prestados es: " + cantidadPrestados);

    }
}
