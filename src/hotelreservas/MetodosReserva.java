package hotelreservas;

import javax.swing.JOptionPane;

public class MetodosReserva {

    Reserva[] listaReservas = new Reserva[10];

    public void crearReserva() {
        String nombreCliente = JOptionPane.showInputDialog("INGRESE NOMBRE COMPLETO DEL CLIENTE ");
        int id = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL ID (DOCUMENTO) DEL CLIENTE "));
       
        String[] habitaciones = {"SIMPLE", "DOBLE", "SUITE"};
        int habitacionInt = JOptionPane.showOptionDialog(null, "QUE HABITACION PREFIERE", "ELEGIR HABITACION", JOptionPane.DEFAULT_OPTION, 3, null, habitaciones, habitaciones[0]);
        String tipoHabitacion = habitaciones[habitacionInt];
        boolean[] servicios = new boolean[4];
        int[] estadia = new int[6];
        String menuServicios[] = {"     SPA!!! ", "     MASAJES!!! ", " PISCINA CLIMATIZADA!!! ", " PASEOS ACUATICOS !!!"};
        for (int i = 0; i < servicios.length; i++) {
            servicios[i] = JOptionPane.showConfirmDialog(null, menuServicios[i], " EXTRAS DISPONIBLES ", 0) == JOptionPane.DEFAULT_OPTION;

        }
        for (int i = 0; i < estadia.length; i++) {
            String diaMesAnio = "", entradaSalida = "";
            switch (i) {
                case 0:
                    diaMesAnio = "DIA";
                    entradaSalida = "ENTRADA";
                    break;
                case 1:
                    diaMesAnio = "MES";
                    entradaSalida = "ENTRADA";
                    break;
                case 2:
                    diaMesAnio = "AÑO";
                    entradaSalida = "ENTRADA";
                    break;
                case 3:
                    diaMesAnio = "DIA";
                    entradaSalida = "SALIDA";
                    break;
                case 4:
                    diaMesAnio = "MES";
                    entradaSalida = "SALIDA";
                    break;
                case 5:
                    diaMesAnio = "AÑO";
                    entradaSalida = "SALIDA";
                    break;

            }
            estadia[i] = Integer.parseInt(JOptionPane.showInputDialog(null, " INGRESE " + diaMesAnio + " DE " + entradaSalida, "ESTADIA MENAGE", 1));
        }
        Reserva reserva = new Reserva(nombreCliente, tipoHabitacion, id, estadia, servicios);
        int posicion = 0;
        while (listaReservas[posicion] != null) {
            posicion++;

        }
        listaReservas[posicion] = reserva;
        JOptionPane.showMessageDialog(null, " RESERVA CREADA CON ÉXITO " + id, "INFORMACION HOTEL MENAGE", 1);
    }

    public void consultarReserva() {
        int[] estadia = {0, 0, 0, 0, 0, 0};
        boolean[] servicios = {false, false, false, false};
        Reserva reserva = new Reserva("", "", 0, estadia, servicios);
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, " INGRESE EL ID DE LA RESERVA A CONSULTAR ", "REQUIERE ID", 3));
        int posicionReserva = 0;
        while (listaReservas[posicionReserva] != null && listaReservas[posicionReserva].getId() != id) {
            posicionReserva++;

        }
        reserva = listaReservas[posicionReserva];
        if (reserva != null) {
            JOptionPane.showMessageDialog(null, reserva.getNombreCliente() + "\n " + "" + reserva.getDiasEstadia()
                    + "  DE ESTADIA \n" + reserva.getPrecioEstadia(), "DETALLES DE LA RESERVA \n NOMBRE : ", 1);
        } else {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO LA RESERVA ", "HOTEL MENAGE", 1);

        }
    }

    public void eliminarReserva() {

        int[] estadia = {0, 0, 0, 0, 0, 0};
        boolean[] servicios = {false, false, false, false};
        Reserva reserva = new Reserva("", "", 0, estadia, servicios);
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, " INGRESE EL ID DE LA RESERVA ", " ELIMINAR RESERVA", 1));
        int posicionReserva = 0;
        while (listaReservas[posicionReserva].getId() != id) {
            posicionReserva++;
        }
        reserva = listaReservas[posicionReserva];
        listaReservas[posicionReserva] = null;
        JOptionPane.showMessageDialog(null, " RESERVA ELIMINADA CON EXITO ", "HOTEL MENAGE", 2);
    }

}
