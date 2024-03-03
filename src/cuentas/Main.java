package cuentas;

/**
 * Clase principal que ejecuta la aplicación
 */

public class Main {
	
	/**
	 * Punto de entrada, Se instancia un nuevo objeto de la clase Cuenta,
	 * se establece la variable con el Método estado() de la clase CCuenta para después mostrarlo 
	 * llamar al Método operativa_cuenta()
	 * @param args Argumentos 
	 */

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 1200);
    }
    
    /**
     * Método para el proceso de retirar e ingresar en cuenta
     * @param cuenta1 Cuenta
     * @param cantidad Cantidad
     */

	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
