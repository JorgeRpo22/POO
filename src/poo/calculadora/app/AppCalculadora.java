package poo.calculadora.app;

import poo.calculadora.dominio.Calculadora;

import javax.swing.*;
import java.util.ArrayList;

public class AppCalculadora {
    public static ArrayList<Double> numeros=new ArrayList<Double>();
    private static final int OPCION_SUMAR = 0;
    private static final int OPCION_RESTAR = 1;
    private static final int OPCION_MULTIPLICAR = 2;
    private static final int OPCION_DIVIDIR = 3;

    public static void main(String[] args) {

        while(true) {
            JCheckBox redondear= new JCheckBox("¿Redondear?");
            ImageIcon icono=new ImageIcon(Calculadora.class.getResource("uco.png"));
            int opcionElegida= JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", "Calculadora  UCO-POO", 0,JOptionPane.PLAIN_MESSAGE, icono, new Object[] {"Sumar","Restar","Multiplicar","Dividir",redondear},null);

            switch (opcionElegida) {
                case OPCION_SUMAR:
                    recibirNumeros();
                    if(redondear.isEnabled()) {
                        mostrarMensaje(Math.floor(Calculadora.sumar(numeros)));
                    }else {
                        mostrarMensaje(Calculadora.sumar(numeros));
                    }
                    break;

                case OPCION_RESTAR:
                    recibirNumeros();
                    if(redondear.isEnabled()) {
                        mostrarMensaje(Math.floor(Calculadora.restar(numeros)));
                    }else {
                        mostrarMensaje(Calculadora.restar(numeros));
                    }
                    break;

                case OPCION_MULTIPLICAR:
                    recibirNumeros();
                    if(redondear.isEnabled()) {
                        mostrarMensaje(Math.floor(Calculadora.multiplicar(numeros)));
                    }else {
                        mostrarMensaje(Calculadora.multiplicar(numeros));
                    }
                    break;

                case OPCION_DIVIDIR:
                    int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                    int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                    if(redondear.isEnabled()) {
                        mostrarMensaje(Math.floor(Calculadora.dividir(num1,num2)));
                    }else {
                        mostrarMensaje(Calculadora.dividir(num1, num2));
                    }
                    break;

                default:
                    break;
            }

            if(opcionElegida==JOptionPane.CLOSED_OPTION) {
                break;
            }
        }
    }

    public static void mostrarCuadrodeDialogo() {
        String num=JOptionPane.showInputDialog("Ingrese un numero");
        String condicion="";
        if(num.equals(condicion)) {
            while(num.equals(condicion)) {
                num=JOptionPane.showInputDialog("Ingrese un numero","Debes ingresar algun numero");
                condicion="Debes ingresar algun numero";
            }
        }else {
            double numero=Double.parseDouble(num);
            numeros.add(numero);
        }
    }

    public static int cuadroContinuar() {
        int confirmacion=JOptionPane.showConfirmDialog(null, "�Desea agregar mas numeros?", "", JOptionPane.YES_NO_OPTION);
        int si_no=0;
        switch (confirmacion) {
            case JOptionPane.YES_OPTION:
                si_no=1;
                break;
            default:
                break;
        }
        return si_no;
    }

    public static void mostrarMensaje(double dato) {
        JOptionPane.showMessageDialog(null, dato, "Resultado", JOptionPane.INFORMATION_MESSAGE, null);
    }

    public static void recibirNumeros() {
        int si_no;

        mostrarCuadrodeDialogo();
        mostrarCuadrodeDialogo();
        si_no=cuadroContinuar();
        if(si_no==1) {
            mostrarCuadrodeDialogo();
            si_no=cuadroContinuar();
        }


    }
}
