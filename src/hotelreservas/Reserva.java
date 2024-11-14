
package hotelreservas;


public class Reserva {
    String nombreCliente,tipoHabitacion;
    int id, diasEstadia;
    double precioEstadia;
    int []estadia;
    boolean []servicios;
    // constructor

    public Reserva(String nombreCliente, String tipoHabitacion, int id, double precioEstadia,   int[] estadia, boolean[] servicios) {
        this.nombreCliente = nombreCliente;
        this.tipoHabitacion = tipoHabitacion;
        this.id = id;
        this.diasEstadia = diasEstadia(estadia);
        this.precioEstadia = precioEstadia(tipoHabitacion, servicios, diasEstadia);
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
    public double precioEstadia(String tipoHabitacion, boolean[] servicios, int diasEstadia){
        double precioEstadia, precioBase = 0, precioServicios = 0, precioSimple = 500, precioDoble = 800, precioSuite = 1500;
        double [] precioSegunServicio = {80, 25, 15, 100};
        switch (tipoHabitacion.toLowerCase()){
            case "simple":
                precioBase = precioSimple;
                break;
            case "doble":
                precioBase = precioDoble;
                break;
            case "suite":
                precioBase = precioSuite;
                break;
                
        }
        for(int i=0;i < servicios.length;i++){
            if(servicios[i]){
                precioServicios += precioSegunServicio[i];
            }
        }
        precioEstadia = (precioBase + precioServicios) * diasEstadia;
        return precioEstadia;
    }
}
