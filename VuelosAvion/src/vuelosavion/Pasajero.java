package vuelosavion;

/**
 *
 * @author: Cristian Gallego Codigo: 1.112.630.610
 */
public class Pasajero {

    String nombre;
    String Cedula;

    public Pasajero() {
    }

    public Pasajero(String nombre, String Cedula) {
        this.nombre = nombre;
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "nombre=" + nombre + ", Cedula=" + Cedula + '}';
    }

}
