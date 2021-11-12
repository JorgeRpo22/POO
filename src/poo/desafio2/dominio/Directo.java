package poo.desafio2.dominio;

public class Directo extends Empleado{
    public static final long SALARIO_PARA_APORTE = 6000000;
    public static final double PORC_SALUD = 0.04;
    public static final double PORC_PENSION = 0.065;
    protected long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    public long calcularSalud() {
        return (long) (PORC_SALUD*salario);
    }

    public long calcularPension() {
        return (long) (PORC_PENSION*salario);
    }

    public long calcularAporte() {
        if (this.salario >= SALARIO_PARA_APORTE) {
            return 15000;
        } else {
            return 0;
        }
    }

    @Override
    public long calcularSalario() {
        long salario = this.salario - this.calcularPension() - this.calcularSalud() - this.calcularAporte();
        return salario;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }
}