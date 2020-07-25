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
public class CuentaDolares extends Cuentas{
    public float cambio = 580;
    private int id ;
    public CuentaDolares(int numeroCuenta, String contrasenia, float monto) {
        super(numeroCuenta, contrasenia, monto);
    }
    /***
     * constructor que define una nueva cuenta de tipo dolares
     * @param numeroCuenta
     * numero de cuenta
     * @param contrasenia
     * contrasenia de la cuenta
     * @param monto
     * monto con el que iniciara la cuenta sera en 0, hasta que se compren los dolares
     * @param id
     * id relacionado con la cuenta original de aqui se jalara el monto en colones
     */
    public CuentaDolares(int numeroCuenta, String contrasenia, float monto, int id) {
        super(numeroCuenta, contrasenia, monto);
        this.id = id;
    }
    
    /**
     * se compran dolares
     * @param montoCompra 
     * recibe como paramtro la cantidad de compra
     */
    public void comprarDolares(float montoCompra){
        if ( montoCompra <= getMonto() / cambio ) {
            setMonto(montoCompra);
            
            ProyectoCajeroUTN.cuentas[id].setMonto(montoCompra * cambio); // se le rebaja de la cuenta colones u original
        }
    }
    /**
     * se venden los dolares 
     * @param montoVender 
     * recibe el monto que se quiere vender
     */
    public void venderDolares( float montoVender){
        if (getMonto() >0) { // en caso de que se tenga saldo en la cuenta
            if (montoVender <= getMonto()) { // si el monto actual de la cuenta es superior o igual a la venta
                ProyectoCajeroUTN.cuentas[id].depositar(montoVender*cambio);
                setMonto(getMonto()-montoVender);
            }
        }
    }
    
    
}
