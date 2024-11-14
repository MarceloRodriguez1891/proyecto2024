
package hotelreservas;


public class Reserva {
    String nombreCliente,tipoHabitacion;
    int id, diasEstadia;
    double precioEstadia;
    int []estadia;
    boolean []servicios;
    // constructor

    public Reserva(String nombreCliente, String tipoHabitacion, int id,   int[] estadia, boolean[] servicios) {
        this.nombreCliente = nombreCliente;
        this.tipoHabitacion = tipoHabitacion;
        this.id = id;
        this.diasEstadia = diasEstadia;
        this.precioEstadia = precioEstadia;
        this.estadia = estadia;
        this.servicios = servicios;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public int getId() {
        return id;
    }

    public int getDiasEstadia() {
        return diasEstadia;
    }

    public double getPrecioEstadia() {
        return precioEstadia;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int diasEstadia(int[]estadia){
        int diaEntrada=estadia[0],mesEntrada=estadia[1],anioEntrada=estadia[2],diaSalida=estadia[3],mesSalida=estadia[4],anioSalida=estadia[5],diasEstadia;
    diasEstadia =((anioSalida-anioEntrada)*365)+((mesSalida-mesEntrada)*30)+(diaSalida-diaEntrada);
    return diasEstadia;
    }
    
}
