package poo.taller.punto2b.app;

import poo.taller.punto2b.dominio.AgendaTelefonica;
import poo.taller.punto2b.dominio.Contacto;

public class AppAgenda {
    public static void main(String[] args) {
        AgendaTelefonica agendaJorge = new AgendaTelefonica("1.0");

        Contacto contacto1 = Contacto.crear("Alejo", "Ramirez", "3137846545");
        Contacto contacto2 = Contacto.crear("Sebastian", "Yepes", "3136528478");
        Contacto contacto3 = Contacto.crear("Daniel", "Lopez", "3002308456");
        Contacto contacto4 = Contacto.crear("Mateo", "Garcia", "3008384574");
        Contacto contacto5 = Contacto.crear("Victor", "Vallejo", "3015698741");
        Contacto contacto6 = Contacto.crear("Alejo", "Perez", "5684897");
        Contacto contacto7 = Contacto.crear("Carlos", "Restrepo", "3201564879");


        agendaJorge.getContactos().add(contacto1);
        agendaJorge.getContactos().add(contacto2);
        agendaJorge.getContactos().add(contacto3);
        agendaJorge.getContactos().add(contacto4);
        agendaJorge.getContactos().add(contacto5);
        agendaJorge.getContactos().add(contacto6);
        agendaJorge.getContactos().add(contacto7);


        agendaJorge.BuscarContactoNombre("Alejo");
        agendaJorge.BuscarContactoApellido("Vallejo");
        agendaJorge.BuscarContactoNumero("3008384574");
        agendaJorge.BuscarContactoApellido("Perez");
        agendaJorge.BuscarContactoApellido("Yepes");
        agendaJorge.CambiarNumeroCelular("Alejo", "Perez", "3002021051");
        agendaJorge.BuscarContactoApellido("Perez");
        agendaJorge.BuscarContactoApellido("Yepes");

        agendaJorge.BuscarContactoApellido("Garcia");
        agendaJorge.EliminarContacto("Mateo", "Garcia");
        agendaJorge.BuscarContactoNombre("Carlos");

        agendaJorge.crearContacto("Sara", "Tabares", "3008457912");
        agendaJorge.BuscarContactoApellido("Tabares");


        agendaJorge.OrdenarContactosOrdenAlfabetico();
        System.out.println(
                "------------------------------------------lista contactos despues de ordenarla alfabeticamente \n ");
        // listar los contactos existentes ordenados alfabeticamente
        for (Contacto c : agendaJorge.getContactos()) {
            System.out.println("Contacto #" + agendaJorge.getContactos().indexOf(c) + ". Nombre " + c.getNombre()
                    + " , Apellido: " + c.getApellido() + " ,  Numero Celular: " + c.getNumeroCelular() + "\n");
        }



    }
}
