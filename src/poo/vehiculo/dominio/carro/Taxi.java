package poo.vehiculo.dominio.carro;

public class Taxi extends Carro {
    private String empresa;
    private int capacidadPasajeros;
    private int nroPasajerosActuales;

    public void recogerPasajero(){
        if (nroPasajerosActuales < capacidadPasajeros) {
            nroPasajerosActuales++;
        }
    }

    public void descargarPasajero() {
        if (nroPasajerosActuales > 0) {
            nroPasajerosActuales--;
        }
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getNroPasajerosActuales() {
        return nroPasajerosActuales;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
