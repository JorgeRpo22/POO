package poo.vehiculo.app;

import poo.vehiculo.dominio.Vehiculo;
import poo.vehiculo.dominio.bici.Bicicleta;
import poo.vehiculo.dominio.bici.BicicletaMTB;
import poo.vehiculo.dominio.carro.Carro;
import poo.vehiculo.dominio.carro.Taxi;
import poo.vehiculo.dominio.moto.Moto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppVehiculo {
    public static void aumentarVelocidad(List<Vehiculo> vehiculos) {
        vehiculos.forEach(vehi -> {
            vehi.acelerar(new Random().nextInt(50));
            System.out.println(vehi + " va a " + vehi.getVelocidad() + "km/h \n");
        });
    }

    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Moto moto = new Moto();
        Bicicleta bici = new Bicicleta();
        Carro carro = new Carro();
        Vehiculo mtb = new BicicletaMTB();
        Vehiculo taxi = new Taxi();

        vehiculos.add(moto);
        vehiculos.add(bici);
        vehiculos.add(carro);
        vehiculos.add(mtb);
        vehiculos.add(taxi);

        aumentarVelocidad(vehiculos);

//        bici.acelerar(15);
//        System.out.println("La bici va a " + bici.getVelocidad() + "km/h \n");
//
//        moto.acelerar(new Random().nextInt(80));
//        System.out.println("La moto va a " + moto.getVelocidad() + "km/h \n");
//
//        carro.acelerar(new Random().nextInt(100));
//        System.out.println("El carro va a " + carro.getVelocidad() + "km/h \n");
//
//        mtb.acelerar(new Random().nextInt(25));
//        System.out.println("La mtb va a " + mtb.getVelocidad() + "km/h \n");
//
//        taxi.acelerar(new Random().nextInt(50));
//        System.out.println("El taxi va a " + taxi.getVelocidad() + "km/h");
    }
}