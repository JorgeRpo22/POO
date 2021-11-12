package poo.desafio2.dominio;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class CoordinadorVentas extends Directo {
    public static final double PORC_COMISION = 0.02;

    public CoordinadorVentas(String nombre, long salario) {
        super(nombre, salario);
    }

    public long calcularComision(List<Empleado> empleados){
        long sumaVentas = empleados.stream()
                .filter(empleado -> empleado instanceof Vendedor)
                .mapToLong(empleado -> ((Vendedor) empleado).getVentasDelMes()).sum();

//        for (Empleado empleado : empleados) {
//            if (empleado instanceof Vendedor) {
//                sumaVentas += ((Vendedor) empleado).getVentasDelMes();
//            }
//        }

        return (long) (sumaVentas * PORC_COMISION);
    }
}
