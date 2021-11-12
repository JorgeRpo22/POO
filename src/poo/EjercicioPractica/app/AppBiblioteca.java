package poo.EjercicioPractica.app;

import poo.EjercicioPractica.dominio.Biblioteca;
import poo.EjercicioPractica.dominio.Libro;
import poo.EjercicioPractica.dominio.Revista;
import poo.EjercicioPractica.dominio.Tesis;

public class AppBiblioteca {
    public static void main(String[] args) {
        Biblioteca uco = new Biblioteca("Biblioteca UCO");

        Libro montecristo = new Libro(false, "El conde de montecristo");
        Tesis control = new Tesis(false, "Control de entrada en parqueadero");
        Revista revista = new Revista(true, "Revista de tecnología UCO");

        uco.addRecurso(montecristo, control, revista);

        uco.prestarRecurso(montecristo);
        uco.prestarRecurso(revista);
        uco.listarPrestados();

        uco.devolverRecurso(revista);
        uco.listarPrestados();

        uco.devolverRecurso(montecristo);
        uco.listarPrestados();




    }
}
