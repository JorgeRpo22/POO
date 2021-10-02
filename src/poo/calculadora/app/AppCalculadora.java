package poo.calculadora.app;

import poo.calculadora.dominio.Calculadora;

import javax.swing.*;
import java.nio.channels.ClosedSelectorException;
import java.util.ArrayList;

public class AppCalculadora {
    public static ArrayList<Double> numeros=new ArrayList<Double>();
    private static final int OPCION_SUMAR = 0;
    private static final int OPCION_RESTAR = 1;
    private static final int OPCION_MULTIPLICAR = 2;
    private static final int OPCION_DIVIDIR = 3;
    private static int numeroComponentes;

    public static void main(String[] args) {
        JCheckBox redondear= new JCheckBox("¿Redondear?");

        while(true) {
            ImageIcon icono=new ImageIcon(Calculadora.class.getResource("uco.png"));
            numeros = new ArrayList<Double>();

            int opcionElegida= JOptionPane.showOptionDialog(null,
                    "¿Que quieres hacer?", "Calculadora  UCO-POO", 0,
                    JOptionPane.PLAIN_MESSAGE, icono, new Object[] {"Sumar","Restar","Multiplicar","Dividir",redondear},
                    null);

            switch (opcionElegida) {
                case OPCION_SUMAR:
                    ingresarNumeros();
                    if(redondear.isSelected()) {
                        mostrarMensajeDato(Math.round(Calculadora.sumar(numeros)));
                    }else {
                        mostrarMensajeDato(Calculadora.sumar(numeros));
                    }
                    numeros.clear();
                    break;

                case OPCION_RESTAR:
                    ingresarNumeros();
                    if(redondear.isSelected()) {
                        mostrarMensajeDato(Math.round(Calculadora.restar(numeros)));
                    }else {
                        mostrarMensajeDato(Calculadora.restar(numeros));
                    }
                    numeros.clear();
                    break;

                case OPCION_MULTIPLICAR:
                    ingresarNumeros();
                    if(redondear.isSelected()) {
                        mostrarMensajeDato(Math.round(Calculadora.multiplicar(numeros)));
                    }else {
                        mostrarMensajeDato(Calculadora.multiplicar(numeros));
                    }
                    numeros.clear();
                    break;

                case OPCION_DIVIDIR:
                    numeros = new ArrayList<Double>();
                    numeroComponentes = ingresarNumeroComponentes();
                    for(int i = 0; i< numeroComponentes; i++){
                        double numero = 0;
                        do{
                            try{
                                numero = ingresarNumero();
                                numeros.add(numero);
                            }catch (NumberFormatException error){
                                mostrarMensaje("Formato invalido, debe ingresar un número");
                            }
                            //System.out.println(numeros);
                        }while(numero<0);
                    }
                    if(redondear.isSelected()) {
                        mostrarMensajeDato(Math.round(Calculadora.dividir(numeros)));
                        System.out.println(Calculadora.dividir(numeros));
                    }else {
                        mostrarMensajeDato(Calculadora.dividir(numeros));
                        System.out.println(Calculadora.dividir(numeros));
                    }
                    numeros.clear();
                    break;

//                    double numero = 0;
//                    numeros = new ArrayList<Double>();
//                    ingresarNumeros();
//                    //int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
//                    //int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
//                    if(redondear.isSelected()) {
//                        mostrarMensajeDato(Math.round(Calculadora.dividir(num1, num2)));
//                    }else {
//                        mostrarMensajeDato(Calculadora.dividir(num1, num2));
//                    }
//                    break;

                default:
                    break;
            }

            if(opcionElegida==JOptionPane.CLOSED_OPTION) {
                break;
            }
        }
    }

    public static void mostrarCuadrodeDialogo() {
        double numero = 0;

        do {
            try {
                String num = JOptionPane.showInputDialog("Ingrese un número");
                numero = Double.parseDouble(num);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                mostrarMensaje("Formato invalido, debe ingresar un número");
            }
        } while (numero != (double) numero);

    }

    public static int deseaContinuar() {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea agregar más números?", "", JOptionPane.YES_NO_OPTION);
        int AgregarMasNumeros = 0;

        switch (confirmacion) {
            case JOptionPane.YES_OPTION:
                AgregarMasNumeros = 1;
                break;
            case JOptionPane.NO_OPTION:
                AgregarMasNumeros = 0;
                break;
            default:
                break;
        }
        return AgregarMasNumeros;
    }

    public static void mostrarMensajeDato(double dato) {
        JOptionPane.showMessageDialog(null, dato, "Resultado", JOptionPane.INFORMATION_MESSAGE, null);
    }

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "POO", JOptionPane.PLAIN_MESSAGE);
    }

    public static double ingresarNumero(){
        do{
            try{
                double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero: "));
                return numero;
            }catch(NumberFormatException ee){
                JOptionPane.showMessageDialog(null,"Numero ingresado no valido");
                continue;
            }
        }while(true);
    }

    public static void ingresarNumeros() {
        double numero = 0;
        int AgregarMasNumeros;

        do {
            try {
                mostrarCuadrodeDialogo();
            } catch (NumberFormatException e) {
                mostrarMensaje("Formato invalido, debe ingresar un número");
            }
        } while (numero != (double) numero);

        mostrarCuadrodeDialogo();
        AgregarMasNumeros = deseaContinuar();

        if(AgregarMasNumeros == 1) {
            mostrarCuadrodeDialogo();
            AgregarMasNumeros = deseaContinuar();
        }
    }

    public static int ingresarNumeroComponentes(){
        do{
            try{
                numeroComponentes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de componentes "));
                if(numeroComponentes<1){
                    JOptionPane.showMessageDialog(null,"Número ingresado no válido");
                }
            }catch (NumberFormatException ee){
                JOptionPane.showMessageDialog(null,"Número ingresado no válido");
            }
        }while(numeroComponentes<1);
        return numeroComponentes;
    }

//    public static void ingresarMasNumeros() {
//        double numero = 0;
//        int AgregarMasNumeros;
//
//        do {
//            try {
//                mostrarCuadrodeDialogo();
//            } catch (NumberFormatException e) {
//                mostrarMensaje("Formato invalido, debe ingresar un número");
//            }
//        } while (numero != (double) numero);
//
//        AgregarMasNumeros = deseaContinuar();
//
//    }
}
