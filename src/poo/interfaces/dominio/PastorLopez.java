package poo.interfaces.dominio;

public class PastorLopez extends Musico implements Cantante, Guitarrista {
    public PastorLopez() {
        super("Pastor Lopez");
    }

    @Override
    public void cantar() {
        System.out.println(nombre + " está cantando Traicionera");
    }

    @Override
    public void tocarGuitarra() {
        System.out.println(nombre + " está tocando la guitarra....");
    }
}
