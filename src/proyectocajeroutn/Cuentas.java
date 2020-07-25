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
public class Cuentas {
    private int numeroCuenta;
    private String contrasenia;
    private float monto;
    
    public Cuentas(int numeroCuenta, String contrasenia, float monto) {
        this.numeroCuenta = numeroCuenta;
        this.contrasenia = contrasenia;
        this.monto = monto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
}
