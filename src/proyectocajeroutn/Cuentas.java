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
public class Cuentas implements MovimientosCuenta {

    private int numeroCuenta;
    private String contrasenia;
    private float monto;
    private CuentaDolares dolares;

    /**
     * se crea una nueva cuenta
     *
     * @param numeroCuenta numero de la cuenta
     * @param contrasenia contrasenia de la cuenta
     * @param monto monto que tendra la cuenta
     */
    public Cuentas(int numeroCuenta, String contrasenia, float monto) {
        this.numeroCuenta = numeroCuenta;
        this.contrasenia = contrasenia;
        this.monto = monto;
        dolares = null;

    }

    /**
     * constructor vacio para poder inicializar una cuenta totoalmente nueva
     */
    public Cuentas() {
        numeroCuenta = 0;
        contrasenia = "";
        monto = 0;
        dolares = null;

    }

    /**
     * obtiene la cuenta en dolares
     *
     * @return en caso de que devuelva null, significa que la cuenta no tiene
     * cuenta en dolares
     */
    public CuentaDolares getDolares() {
        return dolares;
    }

    /**
     * establece una nueva cuenta en dolares
     *
     * @param dolares la cuenta en dolares que se quiere agregar
     */
    public void setDolares(CuentaDolares dolares) {
        this.dolares = dolares;
    }

    /**
     * obtiene el monto
     *
     * @return
     */
    public float getMonto() {
        return monto;
    }

    /**
     * establece el monto
     *
     * @param monto
     */
    public void setMonto(float monto) {
        this.monto = monto;
    }

    /**
     * obtiene el numero de la cuenta
     *
     * @return
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * establce el numero de la cuenta
     *
     * @param numeroCuenta
     */
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * obtiene la contrasenia de la cuenta
     *
     * @return
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * establece la contasenia de la cuenta
     *
     * @param contrasenia
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * *
     * metodo herededado de una clase abstracta el cual implemeta el metodo para
     * poder depositar en la cuenta
     *
     * @param monto
     */
    @Override
    public void depositar(float monto) {
        //To change body of generated methods, choose Tools | Templates
        this.monto += monto;
    }

    /**
     * metodo heredado de una clase abstracta para poder retirar dinero de la
     * cuenta
     *
     * @param monto el monto que se quiere retirar
     * @throws Exception en caso de que el monto sobrepase el monto actual lanza
     * una excepcion
     */
    @Override
    public void retirar(float monto) throws Exception {
        if (this.monto <= monto) {
            throw new Exception("\nEL monto es mayor al \nde la cuenta\n");
        } else {
            this.monto -= monto;
        }
    }

}
