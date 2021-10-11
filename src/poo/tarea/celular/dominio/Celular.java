package poo.tarea.celular.dominio;

public class Celular {
    private String marca;
    private String modelo;
    private double espacioAlmacenamiento;
    private double memoriaRam;
    private double pixelesCamaraPosterior;
    private double precio;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getEspacioAlmacenamiento() {
        return espacioAlmacenamiento;
    }

    public double getMemoriaRam() {
        return memoriaRam;
    }

    public double getPixelesCamaraPosterior() {
        return pixelesCamaraPosterior;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

