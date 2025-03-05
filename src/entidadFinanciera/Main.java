/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

public class Main {

    // Método para probar la operación de ingresar
    public static void probarIngresar(CCuenta cuenta, double cantidad, double cantidadEsperada) {
        try {
            cuenta.ingresar(cantidad);
            System.out.println("Ingreso realizado. Saldo actual: " + cuenta.estado());
        } catch (Exception e) {
            System.out.println("Error al ingresar: " + e.getMessage());
        }
    }

    // Método para probar la operación de retirar
    public static void probarRetirar(CCuenta cuenta, double cantidad, double cantidadEsperada) {
        try {
            cuenta.retirar(cantidad);
            System.out.println("Retiro realizado. Saldo actual: " + cuenta.estado());
        } catch (Exception e) {
            System.out.println("Error al retirar: " + e.getMessage());
        }
    }
}