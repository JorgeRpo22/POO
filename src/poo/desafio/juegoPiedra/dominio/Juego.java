package poo.desafio.juegoPiedra.dominio;


import java.util.Random;

public class Juego {
    private static final int PIEDRA = 1;
    private static final int PAPEL = 2;
    private static final int TIJERA = 3;

    private String juegopiedra;
    private String nombreJugador;
    private int victoriasJugador = 0;
    private int victoriasDeLaMaquina = 0;
    private int empates = 0;
    private int jugadaDeLaMaquina = new Random().nextInt(3);

    public Juego(String juegopiedra) {
        this.juegopiedra = juegopiedra;
    }

    public int jugadaOrdenador() {
        int opcionPc = (int) (Math.random()*2);
        return opcionPc;
    }

    public String resultadoJuego(int jugadaIngresada) {
        if (jugadaIngresada == PIEDRA && jugadaDeLaMaquina == TIJERA) {
            victoriasJugador++;
            return "¡Felicidades " +nombreJugador+ ", ganaste!" ;
        } else if (jugadaIngresada == TIJERA && jugadaDeLaMaquina == PAPEL) {
            victoriasJugador++;
            return "¡Felicidades " +nombreJugador+ ", ganaste!" ;
        } else if (jugadaIngresada == PAPEL && jugadaDeLaMaquina == PIEDRA) {
            victoriasJugador++;
            return "¡Felicidades " + nombreJugador + ", ganaste!";
        } else if (jugadaIngresada == jugadaDeLaMaquina) {
            empates++;
            return "Hay un empate";
        } else {
            victoriasDeLaMaquina++;
            return "Lo siento " + nombreJugador + ", perdiste! ";
        }

    }

    public String getJuegopiedra() {
        return juegopiedra;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public int getVictoriasJugador() {
        return victoriasJugador;
    }

    public int getVictoriasDeLaMaquina() {
        return victoriasDeLaMaquina;
    }

    public int getEmpates() {
        return empates;
    }

    public int getJugadaDeLaMaquina() {
        return jugadaDeLaMaquina;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public void setVictoriasJugador(int victoriasJugador) {
        this.victoriasJugador = victoriasJugador;
    }

    public void setVictoriasDeLaMaquina(int victoriasDeLaMaquina) {
        this.victoriasDeLaMaquina = victoriasDeLaMaquina;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
