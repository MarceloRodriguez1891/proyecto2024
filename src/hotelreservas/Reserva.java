
package hotelreservas;


public class Reserva {
    String nombreCliente,tipoHabitacion;
    int id, diasEstadia;
    double precioEstadia;
    int []estadia;
    boolean []servicios;
    
// constructor

    public Reserva(String nombreCliente, String tipoHabitacion, int id,   int[] estadia, boolean[] servicios,double[] precioSegunServicio) {
        this.nombreCliente = nombreCliente;
        this.tipoHabitacion = tipoHabitacion;
        this.id = id;
        this.diasEstadia = diasEstadia(estadia);
        this.precioEstadia = precioEstadia(tipoHabitacion, servicios, precioSegunServicio, diasEstadia);
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

    public int[] getEstadia() {
        return estadia;
    }

    public boolean[] getServicios() {
        return servicios;
    }

    public void setEstadia(int[] estadia) {
        this.estadia = estadia;
    }

    public void setDiasEstadia(int diasEstadia) {
        this.diasEstadia = diasEstadia;
    }

    public void setPrecioEstadia(double precioEstadia) {
        this.precioEstadia = precioEstadia;
    }

    public void setServicios(boolean[] servicios) {
        this.servicios = servicios;
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
    public static int diasEstadia(int[]estadia){
        int diaEntrada=estadia[0],mesEntrada=estadia[1],anioEntrada=estadia[2],diaSalida=estadia[3],mesSalida=estadia[4],anioSalida=estadia[5],diasEstadia;
    diasEstadia =((anioSalida-anioEntrada)*365)+((mesSalida-mesEntrada)*30)+(diaSalida-diaEntrada);
    return diasEstadia;
    }
    public static double precioEstadia(String tipoHabitacion, boolean[] servicios,double[] precioSegunServicio, int diasEstadia){
        double precioEstadia, precioBase = 0, precioServicios = 0, precioSimple = 500, precioDoble = 800, precioSuite = 1500;
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
