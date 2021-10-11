package poo.tarea.persona.dominio;

public class Persona {
    private String identificacion;
    private String nombre;
    private short fechaNacimiento;
    private String celular;
    private String genero;

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public short getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public String getGenero() {
        return genero;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
