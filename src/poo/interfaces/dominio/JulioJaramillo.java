package poo.interfaces.dominio;

public class JulioJaramillo extends Musico implements Cantante, Guitarrista{
    public JulioJaramillo(String nombre) {
        super(nombre);
    }



    @Override
    public void cantar() {
        System.out.println(this.nombre + " está cantando Cuando llora mi guitarra.");
    }

    @Override
    public void tocarGuitarra() {
        System.out.println(this.nombre + " está tocando en su guitarra Nuestro juramento.");
    }
}
