package hotelreservas;

import javax.swing.JOptionPane;

public class HotelReservas {

    public static void main(String[] args) {
        System.out.println("hhhhh ");
        
        MetodosReserva metodo = new MetodosReserva();
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
           // opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
           String[] opciones = {"CREAR", "CONSULTAR", "MODIFICAR", "ELIMINAR", "SALIR"};
        opcion = JOptionPane.showOptionDialog(null, "SELECCIONE UNA OPCION", "GESTION DE RESERVAS DE HOTEL MENAGE", JOptionPane.DEFAULT_OPTION, 3, null, opciones, opciones[0]);
        
            switch (opcion) {
                case 0:
                    metodo.crearReserva();
                    break;
                case 1:
                    metodo.consultarReserva();
                    break;
                case 2:
                    //metodo.modificarReserva();
                    break;
                case 3:
                    //metodo.eliminarReserva();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, " Gracias por usar el servicio.\n nos vemos en la proxima reserva");
               
                    
            }
        } while (opcion != 4);
    }
}
