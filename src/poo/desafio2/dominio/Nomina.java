package poo.desafio2.dominio;

import poo.tarea.figuraGeometrica.dominio.figuras.Circulo;

import java.util.ArrayList;

public class Nomina {
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public void calcularNomina() {
        empleados.forEach(emp -> {
            if (emp instanceof Empleado) {
                System.out.println(emp.getNombre() + "  Salario: " + emp.calcularSalario());
            }
        });
    }

    public void listarDirectos() {
        empleados.forEach(emp -> {
            if (emp instanceof Directo || emp instanceof Vendedor) {
                if (emp instanceof Directo) {
                    System.out.println(emp.getNombre() + " Tiene un contrato como empleado directo.");
                } else {
                    System.out.println(emp.getNombre() + " Tiene un contrato como vendedor");
                }
            }
        });
    }

    public void listarFreelancers() {
        empleados.forEach(emp -> {
            if (emp instanceof Freelance ) {
                System.out.println(emp.getNombre() + " Tiene un contrato como freelance");
            }
        });
    }

    public void listarPromotores() {
        empleados.forEach(emp -> {
            if (emp instanceof Promotor ) {
                System.out.println(emp.getNombre() + " Tiene un contrato como promotor");
            }
        });
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
