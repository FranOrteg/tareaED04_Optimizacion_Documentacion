package cuentas;

/**
 * Esta clase define un tipo de cuenta bancaria
 * @author Francisco Ortega
 * @version 1.0
 * @since 2/03/2024
 * @see <a href = https://github.com/FranOrteg/tareaED04_Optimizacion_Documentacion.git>Repositorio Tarea04</a>
 */


public class CCuenta {
	
	// Atributos de la Clase

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
    
    // Constructor de la clase que recibe métodos setters

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInterés(tipo);
    }
    
    /**
     * Método 
     * @return saldo Devuelve el saldo de la cuenta
     */

    public double estado()
    {
        return getSaldo();
    }
    
    // Método para ingresar una cantidad en la cuenta, tendrá que ser positiva para no lanzar una excepción.
    
    /**
     * @param cantidad La cantidad a ingresar
     * @throws Exception Debe ser un numero positivo
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método para retirar una cantidad de la cuenta, está será positiva para no lanzar la primera excepción,
     * y mayor que el estado para no lanzar la segunda excepción.
     * 
     * @param cantidad La cantidad a retirar
     * @throws Exception Debe ser un numero positivo y deberia ser menor que el saldo
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    // METODOS SETTERS Y GETTERS DE LOS ATRIBUTOS DE CLASE
    
    /**
     * @return nombre Devuelve el nombre
     */

	private String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre Establece el nombre
	 */

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return cuenta Devuelve la cuenta
	 */

	private String getCuenta() {
		return cuenta;
	}
	
	/**
	 * 
	 * @param cuenta Establece el valor de la cuenta
	 */

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * 
	 * @return saldo Devuelve el saldo
	 */

	private double getSaldo() {
		return saldo;
	}
	
	/**
	 * 
	 * @param saldo Establece el saldo de la cuenta
	 */

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * @return TipoInterés Devuelve el tipo de interés
	 */
	
	private double getTipoInterés() {
		return tipoInterés;
	}
	
	/**
	 * 
	 * @param tipoInterés Establece el tipo de interés
	 */

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
