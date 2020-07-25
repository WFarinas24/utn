/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocajeroutn;

/**
 *
 * @author William
 */
public class ProyectoCajeroUTN {

    public static Cuentas[] cuentas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cuentas = new Cuentas[5];
        cuentas[0] = new Cuentas(1, "1", 100000);
        cuentas[1] = new Cuentas(1204, "23k2", 1200000);
        cuentas[2] = new Cuentas(1205, "23k1", 1240000);
        cuentas[3] = new Cuentas(1206, "23k4", 1300000);
        cuentas[4] = new Cuentas(1207, "23k5", 1560000);
        
        new FormIngreso().setVisible(true);
    }
    
}
