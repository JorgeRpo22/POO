package poo.taller.punto2a.app;

import org.w3c.dom.DOMStringList;
import poo.taller.punto2a.dominio.DispensadorMecato;
import poo.taller.punto2a.dominio.Mecato;

import java.util.Arrays;
import java.util.List;

public class AppMaquinaMecato {
    public static void main(String[] args) {
        DispensadorMecato maquinaMecato = new DispensadorMecato("AutoSnack");

        Mecato producto1 = new Mecato(101, "Doritos", 1800, 3);
        Mecato producto2 = new Mecato(102, "Choclitos", 1200, 1);
        Mecato producto3 = new Mecato(103, "Detodito", 2000, 4);
        Mecato producto4 = new Mecato(104, "Red Bull", 5500, 2);
        Mecato producto5 = new Mecato(105, "Monster", 6000, 1);
        Mecato producto6 = new Mecato(106, "MontBlanc", 3500, 7);
        Mecato producto7 = new Mecato(107, "Jet", 1500, 5);
        Mecato producto8 = new Mecato(108, "Coca Cola", 2500, 0);
        Mecato producto9 = new Mecato(109, "Trident", 1000, 10);
        Mecato producto10 = new Mecato(110, "Halls", 1100, 7);

        maquinaMecato.getProductos().add(producto1);
        maquinaMecato.getProductos().add(producto2);
        maquinaMecato.getProductos().add(producto3);
        maquinaMecato.getProductos().add(producto4);
        maquinaMecato.getProductos().add(producto5);
        maquinaMecato.getProductos().add(producto6);
        maquinaMecato.getProductos().add(producto7);
        maquinaMecato.getProductos().add(producto8);
        maquinaMecato.getProductos().add(producto9);
        maquinaMecato.getProductos().add(producto10);


        maquinaMecato.consultarTotalUnidades();

        maquinaMecato.consultarAgotados();

        maquinaMecato.consultarUnidades(108);
        maquinaMecato.aumentarStock(108, 10);
        maquinaMecato.consultarUnidades(108);
        maquinaMecato.consultarAgotados();
        maquinaMecato.consultarTotalUnidades();

        maquinaMecato.sacarUnidad(108);
        maquinaMecato.consultarUnidades(108);
        maquinaMecato.consultarTotalUnidades();

        maquinaMecato.consultarUnidades(102);
        maquinaMecato.sacarUnidad("Choclitos");
        maquinaMecato.consultarUnidades(102);

        maquinaMecato.sacarUnidad("Coca Cola");
        maquinaMecato.sacarUnidad("Coca Cola");
        maquinaMecato.sacarUnidad("Coca Cola");
        maquinaMecato.sacarUnidad("Coca Cola");
        maquinaMecato.consultarUnidades(108);
        maquinaMecato.consultarTotalUnidades();
        maquinaMecato.consultarAgotados();
        maquinaMecato.aumentarStock(102, 10);
        maquinaMecato.consultarUnidades(102);
        maquinaMecato.consultarAgotados();
    }

}
