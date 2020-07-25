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
public interface MovimientosCuenta {

    /**
     * metodo para poder depositar en una cuenta
     *
     * @param monto el monto que quiere depositar
     */
    public void depositar(float monto);

    /**
     * metodo para reitrar dinero de la cuenta
     *
     * @param monto monto que se quiere retirar
     * @throws Exception lanza una excepcion en caso de que la cuenta no cuente
     * con los fondos necesarios
     */
    public void retirar(float monto) throws Exception;
}
