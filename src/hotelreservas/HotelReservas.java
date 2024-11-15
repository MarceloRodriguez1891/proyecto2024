package hotelreservas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class HotelReservas {

    public static void main(String[] args) {

        MetodosReserva metodo = new MetodosReserva();
           ImageIcon iconoHotel = new ImageIcon(MetodosReserva.class.getResource("/fotosHotel/hotel.png"));
        int opcion;
        do {
            String menu = """
                          GESTION DE RESERVAS DE HOTEL MENAGE 
                    1- CREAR RESERVA 
                    2- CONSULTAR RESERVA
                    3- MODIFICAR RESERVA 
                    4- ELIMINAR RESERVA 
                    5- SALIR
                    SELECCIONE UNA OPCION
                     """;
            String[] opciones = {"CREAR", "CONSULTAR", "MODIFICAR", "ELIMINAR", "SALIR"};
            opcion = JOptionPane.showOptionDialog(null, "SELECCIONE UNA OPCION", "GESTION DE RESERVAS DE HOTEL MENAGE",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,
                    iconoHotel,
                    opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    metodo.crearReserva();
                    break;
                case 1:
                    metodo.consultarReserva();
                    break;
                case 2:
                    metodo.modificarReserva();
                    break;
                case 3:
                    metodo.eliminarReserva();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, " GRACIAS POR UTILIZAR EL SERVICIO.\n HASTA LA PRÓXIMA RESERVA ", " RESERVAS MENAGE ", 2);

            }
        } while (opcion != 4);
    }
}
