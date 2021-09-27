package poo.ejercicio.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Concesionario {
    public static final int CAPACIDAD_TOTAL = 15;

    private String nombre;
    private List<Moto> motos;

    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.motos = new ArrayList<>();
    }

    public boolean ingresar(Moto moto) {
        return true;
    }

    public Moto buscar(long serial) {
        Moto buscarSerial = null;

        buscarSerial = this.motos.stream()
                .filter(mot -> mot.getSerial() == serial)
                .findFirst().get();

        return buscarSerial;
    }

    public List<Moto> buscar(String marca) {
        List<Moto> buscarMarca = new ArrayList<>();

        //Funcional
        buscarMarca = this.motos.stream()
                .filter(mot -> mot.getMarca().equalsIgnoreCase(marca))
                .collect(Collectors.toList());

        return buscarMarca;
    }

    public List<Moto> buscar(boolean soloNuevas) {
        List<Moto> buscarNuevas = new ArrayList<>();

        //Funcional
        buscarNuevas = this.motos.stream()
                .filter(mot -> mot.isEsNueva() == true)
                .collect(Collectors.toList());

        return buscarNuevas;
//        for (Moto nueva : this.motos) {
//            if (nueva.isEsNueva() == true) {
//                buscarNuevas.add(nueva);
//                System.out.println(buscarNuevas);
//                return buscarNuevas;
//            } else {
//                return null;
//            }
//        }

//        for (int i = 0; i < this.motos.size(); i++) {
//            //Moto motoNueva = this.motos.get(i);
//            if (this.motos.get(i).isEsNueva() == true) {
//                buscarNuevas.add(this.motos.get(i));
//                System.out.println("Marca: " + this.motos.get(i).getMarca());
//                return buscarNuevas;
//            } else {
//                return null;
//            }
//
//        }
    }

    public List<Moto> buscarQueTenganMasDe(int cilindraje) {
        List<Moto> motoMayorCilindraje = new ArrayList<>();

        for (int i = 0; i < this.motos.size(); i++) {
            if (this.motos.get(i).getCilindraje() >= cilindraje) {
                motoMayorCilindraje.add(this.motos.get(i));
                System.out.println(this.motos.get(i).getMarca());
                return motoMayorCilindraje;
            } else {
                return null;
            }
        }
        return null;
    }


    public void vender(Moto moto) {

    }

    public int getCapacidadActual() {
        return 0;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Moto> getMotos() {
        return motos;
    }

    public void setMotos(List<Moto> motos) {
        this.motos = motos;
    }
}