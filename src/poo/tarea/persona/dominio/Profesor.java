package poo.tarea.persona.dominio;

public class Profesor extends Persona{
    private String asignatura;
    private String areaDeEspecializacion;

    public String getAsignatura() {
        return asignatura;
    }

    public String getAreaDeEspecializacion() {
        return areaDeEspecializacion;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setAreaDeEspecializacion(String areaDeEspecializacion) {
        this.areaDeEspecializacion = areaDeEspecializacion;
    }
}
