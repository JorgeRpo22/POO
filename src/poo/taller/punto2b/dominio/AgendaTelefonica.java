package poo.taller.punto2b.dominio;

import java.sql.ClientInfoStatus;
import java.util.*;
import java.util.stream.Collectors;

public class AgendaTelefonica {
    private String version;
    private List<Contacto> contactos;

    public AgendaTelefonica(String version) {
        this.version = version;
        this.contactos = new ArrayList<>();
    }

    public Contacto crearContacto(String nombre, String apellido, String numero) {
        Contacto nuevContact = Contacto.crear(nombre, apellido, numero);
        this.getContactos().add(nuevContact);
        System.out.println("Se creo el contacto: " + nombre + " " + apellido);
        return nuevContact;
    }

    public boolean EliminarContacto(String nombre, String apellido) {
        for (Contacto contact : this.getContactos()) {
            if ((contact.getNombre().equals(nombre)) && (contact.getApellido().equals(apellido))) {
                List<String> nombresContactos = this.contactos.stream().map(contacto -> contacto.getNombre()).collect(Collectors.toList());
                int indiceContacto = nombresContactos.indexOf(nombre);
                getContactos().remove((indiceContacto + 1));
                System.out.println("Se eliminó exitosamente el contacto de: " + contact.getNombre() + " " + contact.getApellido());
                return true;

            }

        }
        return false;
    }

    public Contacto BuscarContactoNombre(String nombre) {
        Contacto contactoNombre = this.getContactos().stream().filter(contacto -> {
            return contacto.getNombre() == nombre;
        }).findFirst().orElse(null);

        if (contactoNombre != null) {
            System.out.println("Se encontró el contacto: " + contactoNombre.getNombre() + " " + contactoNombre.getApellido() + " con número de celular: " + contactoNombre.getNumeroCelular());
        } else {
            System.out.println("No se encontró el contacto: " + nombre);
        }

        return contactoNombre;
    }

    public Contacto BuscarContactoApellido(String apellido) {
        Contacto contactoApellido = this.getContactos().stream().filter(contacto -> {
            return contacto.getApellido() == apellido;
        }).findFirst().orElse(null);

        if (contactoApellido != null) {
            System.out.println("Se encontró el contacto: " + contactoApellido.getNombre() + " " + contactoApellido.getApellido() + " con número de celular: " + contactoApellido.getNumeroCelular());
        } else {
            System.out.println("No se encontró el contacto: " + apellido);
        }

        return contactoApellido;
    }

    public Contacto BuscarContactoNumero(String numero) {
        Contacto contactoNumero = this.getContactos().stream().filter(contacto -> {
            return contacto.getNumeroCelular() == numero;
        }).findFirst().orElse(null);

        if (contactoNumero != null) {
            System.out.println("Se encontró el contacto: " + contactoNumero.getNombre() + " " + contactoNumero.getApellido() + " con número de celular: " + contactoNumero.getNumeroCelular());
        } else {
            System.out.println("No se encontró el contacto: " + numero);
        }

        return contactoNumero;
    }

    public void CambiarNumeroCelular(String nombre, String apellido, String nuevoNumero) {
        this.getContactos().stream().filter(contacto -> (contacto.getNombre() == nombre) && contacto.getApellido() == apellido)
                .findFirst().ifPresent(contacto -> contacto.setNumeroCelular(nuevoNumero));
        System.out.println("Se cambio exitosamente el número de celular ");
    }

    public void OrdenarContactosOrdenAlfabetico() {
        //List<String> OrdenAlfabetico = new ArrayList<>();
        Collections.sort(contactos, Comparator.comparing(Contacto::getNombre));
        //contactos = contactos.stream().sorted(Comparator.comparingInt(contacto::getnombre).reversed()).collect(Collectors.toList());

        //this.contactos.forEach(contacto -> {
        //    OrdenAlfabetico.add(contacto.getNombre() + " - " + contacto.getApellido() + " - " + contacto.getNumeroCelular());
        //});

        //return OrdenAlfabetico;
    }

    public String getVersion() {
        return version;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }
}
