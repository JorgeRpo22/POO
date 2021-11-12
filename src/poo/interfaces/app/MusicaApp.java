package poo.interfaces.app;

import poo.interfaces.dominio.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicaApp {
    public static void main(String[] args) {
        JulioJaramillo julio = new JulioJaramillo("Julio Jaramillo");
        AliciaKeys alicia = new AliciaKeys();
        RubenBlades rubenBlades = new RubenBlades();
        Slash slash = new Slash();
        PastorLopez donPastor = new PastorLopez();

        List<Musico> musicos = new ArrayList<>(Arrays.asList(donPastor, julio, alicia, rubenBlades, slash));

        musicos.forEach(musico -> {
            if (musico instanceof Cantante) {
                ((Cantante) musico).cantar();
            }

            if (musico instanceof Guitarrista) {
                ((Guitarrista) musico).tocarGuitarra();
            }

            if (musico instanceof Maraquero) {
                ((Maraquero) musico).tocarMaracas();
            }

            if (musico instanceof Pianista) {
                ((Pianista) musico).tocarPiano();
            }
        });
    }
}
