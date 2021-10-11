package poo.tarea.celular.app;

import poo.tarea.celular.dominio.Celular;
import poo.tarea.celular.dominio.Smartphone;
import poo.vehiculo.dominio.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class AppCelular {
    public static void main(String[] args) {
        List<Celular> celulares = new ArrayList<>();

        Celular celular = new Celular();

        Smartphone Huawei = new Smartphone();
        Smartphone Xiaomi = new Smartphone();
        Smartphone Samsung = new Smartphone();
        Smartphone iPhone = new Smartphone();

        celulares.add(Huawei);
        celulares.add(Xiaomi);
        celulares.add(Samsung);
        celulares.add(iPhone);

    }
}
