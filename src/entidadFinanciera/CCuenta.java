
package entidadFinanciera;

/**
 * Clase CCuenta representa una cuenta bancaria con operaciones básicas como ingresar y retirar dinero.
 * 
 * @since 1.0
 */
public class CCuenta {

    /**
     * Nombre de la persona titular de la cuenta.
     */
    private String nombre;

    /**
     * Número de la cuenta bancaria.
     */
    private String cuenta;

    /**
     * Saldo actual de la cuenta.
     */
    private double saldo;

    /**
     * Tipo de interés aplicado a la cuenta.
     */
    private double tipoInterés;

    /**
     * Mensaje de error cuando se intenta ingresar una cantidad negativa.
     */
    public static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para inicializar una cuenta.
     * 
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de la cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés aplicado a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return Saldo actual de la cuenta.
     */
    public double estado() {
        return this.getSaldo();
    }

    /**
     * Método para ingresar una cantidad en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar una cantidad de la cuenta.
     * 
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        if (getSaldo() < cantidad)
            throw new Exception("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre Nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de la cuenta.
     * 
     * @return Número de la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de la cuenta.
     * 
     * @param cuenta Número de la cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return Saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo Saldo a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta.
     * 
     * @return Tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés aplicado a la cuenta.
     * 
     * @param tipoInterés Tipo de interés a establecer.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}