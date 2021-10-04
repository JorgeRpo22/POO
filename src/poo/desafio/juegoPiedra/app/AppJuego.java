package poo.desafio.juegoPiedra.app;

import poo.desafio.juegoPiedra.dominio.Juego;
import poo.parcial.dominio.TipoProducto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AppJuego {
    private static final int OPCION_JUGAR = 0;
    private static final int OPCION_PUNTAJE = 1;
    private static final int OPCION_INSTRUCCIONES = 2;
    private static final int OPCION_CAMBIAR_NOMBRE = 3;


    public static void main(String[] args) {
        Juego piedraPapelTijera = new Juego("Pixel");

        while(true) {
            ImageIcon icono=new ImageIcon(Juego.class.getResource("Piedra.jpg"));

            int opcionElegida= JOptionPane.showOptionDialog(null,
                    "         ¡Bienvenido!", "Juego  UCO-POO", 0,
                    JOptionPane.PLAIN_MESSAGE, icono, new Object[] {"Jugar","Puntaje","Instrucciones","Cambiar nombre"},
                    null);

            switch (opcionElegida) {

                case OPCION_JUGAR:
                    if (piedraPapelTijera.getNombreJugador() == null) {
                        piedraPapelTijera.setNombreJugador(ingresarNombre());
                    }
                    JOptionPane.showMessageDialog(null, "Bienvenido "+piedraPapelTijera.getNombreJugador()+"");
                    int jugadaPc = piedraPapelTijera.jugadaOrdenador();
                    int jugadaJugador = JOptionPane.showOptionDialog(null, "Selecciona tu jugada, "+piedraPapelTijera.getNombreJugador()+".","Piedra, Papel o Tijera",0, JOptionPane.QUESTION_MESSAGE, null, Arrays.asList("Piedra", "Papel", "Tijera").toArray(), null);
                    String resultado = piedraPapelTijera.resultadoJuego(jugadaJugador);
                    JOptionPane.showMessageDialog(null, ""+piedraPapelTijera.getNombreJugador()+" seleccionó "+conversion(jugadaJugador)+"\n El ordenador seleccionó "+conversion(jugadaPc)+" \n \n"+resultado+"");
                    break;

                case OPCION_PUNTAJE:
                    if (piedraPapelTijera.getNombreJugador() == null) {
                        piedraPapelTijera.setNombreJugador(ingresarNombre());
                    }
                    String puntaje = " Puntaje: \n \n"+piedraPapelTijera.getNombreJugador()+": "+piedraPapelTijera.getVictoriasJugador()+"  Puntos \nOrdenador: "+piedraPapelTijera.getVictoriasDeLaMaquina()+"  Puntos \nEmpates: "+piedraPapelTijera.getEmpates()+"  Puntos";
                    JOptionPane.showMessageDialog(null, puntaje);
                    break;

                case OPCION_INSTRUCCIONES:
                    String instrucciones = "\r   Reglas y funcionamiento. \n \n El objetivo es vencer al oponente seleccionando el arma que gana, según las siguientes reglas:\n \n• La piedra aplasta la tijera. (Gana la piedra.)\n• La tijera corta el papel. (Gana la tijera.)\n• El papel envuelve la piedra. (Gana el papel.)\n• En caso de empate (Que dos jugadores elijan el mismo elemento), se juega otra vez.";
                    JOptionPane.showMessageDialog(null, instrucciones);

                    break;

                case OPCION_CAMBIAR_NOMBRE:
                    piedraPapelTijera.setNombreJugador(ingresarNombre());
                    piedraPapelTijera.setVictoriasJugador(0);
                    piedraPapelTijera.setVictoriasDeLaMaquina(0);
                    piedraPapelTijera.setEmpates(0);
                    break;

                default:
                    break;
            }

            if(opcionElegida==JOptionPane.CLOSED_OPTION) {
                break;
            }
        }
    }
    public static String ingresarNombre() {
        String nombre;
        do {
            nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre.");
        } while (nombre == null || nombre.trim().isEmpty()) ;
        return nombre;
    }

    public static String conversion(int jugadaInt) {
        if (jugadaInt == 1) {
            return "PIEDRA";
        } else if (jugadaInt == 2) {
            return "PAPEL";
        } else {
            return "TIJERA";
        }
    }
}
