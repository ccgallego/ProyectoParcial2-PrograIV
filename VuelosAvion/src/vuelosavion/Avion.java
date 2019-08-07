
package vuelosavion;

import java.util.Arrays;

/**
 *
 * @author: Cristian Gallego
 * Codigo: 1.112.630.610
 */
public class Avion {

    Silla[] silla;
    String pos;
    Pasajero pasajero = new Pasajero();

    public Avion() {

        silla = new Silla[50];
        for (int i = 0; i <= 49; i++) {
            if (i <= 8) {
                if (i == 0 || i == 3 || i == 4 || i == 7) {
                    pos = "Ventana";
                } else {
                    pos = "Pasillo";
                }
                silla[i] = new Silla((i + 1), true, pos, "Ejecutiva", pasajero, 100000);
            } else {
                if (((i - 8) % 6 == 0) || ((i - 13) % 6 == 0)) {
                    pos = "Ventana";
                } else if (((i - 9) % 3 == 0)) {
                    pos = "Centro";
                } else if (((i - 10) % 6 == 0) || ((i - 11) % 6 == 0)) {
                    pos = "Pasillo";
                }
                silla[i] = new Silla((i + 1), true, pos, "Economica", pasajero, 50000);
            }

        }
    }

    public Silla[] getSilla() {
        return silla;
    }

    public void setSilla(Silla[] silla) {
        this.silla = silla;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Avion{" + "silla=" + Arrays.toString(silla) + '}';
    }
}
