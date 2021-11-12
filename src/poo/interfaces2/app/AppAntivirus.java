package poo.interfaces2.app;

import poo.interfaces2.dominio.*;

public class AppAntivirus {
    public static void main(String[] args) {
        Antivirus antivirus = new Antivirus("AVG");

        DocumentoPDF pdf = new DocumentoPDF("enasayo.pdf", false);
        DocumentoWord word = new DocumentoWord("carta,docx", 1200);
        Cancion cancion = new Cancion("La canción", 254);
        Juego juego = new Juego("DOOM", "facil");
        Video video = new Video("Clase.mkv", 20000, 60);
        Comprimido archivoComprimido = new Comprimido("Clase.zip", 200000);

        antivirus.agregar(pdf, word, cancion, juego, video, archivoComprimido);
        antivirus.escanear();

    }
}
