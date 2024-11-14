package hotelreservas;

import javax.swing.JOptionPane;

public class MetodosReserva {

    Reserva[] listaReservas = new Reserva[10];

    public void crearReserva() {
        String nombreCliente = JOptionPane.showInputDialog("Ingrese nombre completo del cliente ");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el documento del cliente "));

        String[] habitaciones = {"simple", "doble", "suite"};
        int habitacionInt = JOptionPane.showOptionDialog(null, "QUE HABITACION PREFIERE", "ELEGIR HABITACION", JOptionPane.DEFAULT_OPTION, 3, null, habitaciones, habitaciones[0]);
        String tipoHabitacion = habitaciones[habitacionInt];
        boolean[] servicios = new boolean[4];
        int[] estadia = new int[6];
        String menuServicios[] = {" SPA ", " MASAJES ", " PISCINA ", " PASEOS ACUATICOS "};
        for (int i = 0; i < servicios.length; i++) {
            servicios[i] = JOptionPane.showConfirmDialog(null, " QUIERE AGREGAR SERVICIOS " + menuServicios[i] + "?") == JOptionPane.YES_OPTION;

        }
        for (int i = 0; i < estadia.length; i++) {
            String diaMesAnio = "", entradaSalida = "";
            switch (i) {
                case 0:
                    diaMesAnio = "dia";
                    entradaSalida = "entrada";
                    break;
                case 1:
                    diaMesAnio = "mes";
                    entradaSalida = "entrada";
                    break;
                case 2:
                    diaMesAnio = "anio";
                    entradaSalida = "entrada";
                    break;
                case 3:
                    diaMesAnio = "dia";
                    entradaSalida = "salida";
                    break;
                case 4:
                    diaMesAnio = "mes";
                    entradaSalida = "salida";
                    break;
                case 5:
                    diaMesAnio = "anio";
                    entradaSalida = "salida";
                    break;

            }
            estadia[i] = Integer.parseInt(JOptionPane.showInputDialog(" INGRESE " + diaMesAnio + " DE " + entradaSalida));
        }
        Reserva reserva = new Reserva(nombreCliente, tipoHabitacion, id, estadia, servicios);
        int posicion = 0;
        while (listaReservas[posicion] != null) {
            posicion++;

        }
        listaReservas[posicion] = reserva;
        JOptionPane.showMessageDialog(null, " reserva creada con exito" + id);
    }

    public void consultarReserva() {
        int[] estadia = {0, 0, 0, 0, 0, 0};
        boolean[] servicios = {false, false, false, false};
        Reserva reserva = new Reserva("", "", 0, estadia, servicios);
        int id = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese ID de la reserva a consultar "));
        int posicionReserva = 0;
        while (listaReservas[posicionReserva] != null && listaReservas[posicionReserva].getId() != id) {
            posicionReserva++;

        }
        reserva = listaReservas[posicionReserva];
        if (reserva != null) {
            JOptionPane.showMessageDialog(null, "DETALLES DE LA RESERVA \n NOMBRE : " + reserva.getNombreCliente() + "\n " + "" + reserva.getDiasEstadia() + "\n DE ESTADIA ");
        } else {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO LA RESERVA ");

        }
    }

    public void eliminarReserva() {

        int[] estadia = {0, 0, 0, 0, 0, 0};
        boolean[] servicios = {false, false, false, false};
        Reserva reserva = new Reserva("", "", 0, estadia, servicios);
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, " INGRESE EL ID DE LA RESERVA ", " ELIMINAR RESERVA"));
        int posicionReserva = 0;
        while (listaReservas[posicionReserva].getId() != id) {
            posicionReserva++;
        }
        reserva = listaReservas[posicionReserva];
        listaReservas[posicionReserva] = null;
        JOptionPane.showMessageDialog(null, " RESERVA ELIMINADA CON EXITO ");
    }
}
