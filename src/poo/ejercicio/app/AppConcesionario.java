package poo.ejercicio.app;

import poo.ejercicio.dominio.Concesionario;
import poo.ejercicio.dominio.Moto;


public class AppConcesionario {
    public static void main(String[] args) {
        Concesionario incolmotos = new Concesionario("Incolmotos");

        Moto mot1 = new Moto(56140, "Yamaha", 3500000, 125, true);
        Moto mot2 = new Moto(22514, "Honda", 4200000, 250, true);
        Moto mot3 = new Moto(54879, "Kawasaki", 5000000, 250, true);
        Moto mot4 = new Moto(10354, "Auteco", 1700000, 125, false);
        Moto mot5 = new Moto(98713, "Ducati", 13000000, 1025, false);
        Moto mot6 = new Moto(25648, "Yamaha", 5500000, 250, false);


        incolmotos.getMotos().add(mot1);
        incolmotos.getMotos().add(mot2);
        incolmotos.getMotos().add(mot3);
        incolmotos.getMotos().add(mot4);
        incolmotos.getMotos().add(mot5);
        incolmotos.getMotos().add(mot6);


        System.out.println("\n MOTOS SERIAL");
        Moto motoABuscar = incolmotos.buscar(56140);
        System.out.println("Se encontró la moto marca: " + motoABuscar.getMarca() + " con número serial: " + motoABuscar.getSerial() + "," + " Cilindraje: " + motoABuscar.getCilindraje() + "," + " Precio: " + motoABuscar.getPrecio());

        System.out.println("\n MARCAS MOTOS");
        for (Moto mot : incolmotos.buscar("Yamaha")) {
            System.out.println("Se encontró la moto marca: " + mot.getMarca() + "," + " con serial: " +mot.getSerial());
        }

        System.out.println("\n MOTOS NUEVAS");
        for (Moto moto : incolmotos.buscar(true)) {
            System.out.println("Se encontraron las siguientes motos nuevas: " + moto.getMarca() + "," + " con serial: " +moto.getSerial());
        }


        System.out.println("\n MOTOS MAYOR CILINDRAJE");
        System.out.println("\n MOTOS NUEVAS");
        for (Moto moto : incolmotos.buscarQueTenganMasDe(125)) {
            System.out.println("Se encontraron las siguientes motos nuevas: " + moto.getMarca() + "," + " con serial: " +moto.getSerial());
        }



    }
}

