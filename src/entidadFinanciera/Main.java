
package entidadFinanciera;

public class Main {

    // Método principal (punto de entrada del programa)
    public static void main(String[] args) {
        // Crear una instancia de CCuenta para probar los métodos
        CCuenta cuenta = new CCuenta("Álvaro Ruiz", "123456789", 1000.0, 0.0);

        // Probar el método ingresar
        System.out.println("--- Probando ingresar ---");
        probarIngresar(cuenta, 500.0, 1500.0); // Ingresar 500, saldo esperado 1500

        // Probar el método retirar
        System.out.println("--- Probando retirar ---");
        probarRetirar(cuenta, 200.0, 1300.0); // Retirar 200, saldo esperado 1300
    }

    // Método para probar la operación de ingresar
    public static void probarIngresar(CCuenta cuenta, double cantidad, double cantidadEsperada) {
        try {
            cuenta.ingresar(cantidad);
            System.out.println("Ingreso realizado. Saldo actual: " + cuenta.estado());
            if (cuenta.estado() == cantidadEsperada) {
                System.out.println("El saldo coincide con la cantidad esperada.");
            } else {
                System.out.println("El saldo NO coincide con la cantidad esperada.");
            }
        } catch (Exception e) {
            System.out.println("Error al ingresar: " + e.getMessage());
        }
    }

    // Método para probar la operación de retirar
    public static void probarRetirar(CCuenta cuenta, double cantidad, double cantidadEsperada) {
        try {
            cuenta.retirar(cantidad);
            System.out.println("Retiro realizado. Saldo actual: " + cuenta.estado());
            if (cuenta.estado() == cantidadEsperada) {
                System.out.println("El saldo coincide con la cantidad esperada.");
            } else {
                System.out.println("El saldo NO coincide con la cantidad esperada.");
            }
        } catch (Exception e) {
            System.out.println("Error al retirar: " + e.getMessage());
        }
    }
}