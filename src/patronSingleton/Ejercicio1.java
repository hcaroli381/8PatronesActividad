package patronSingleton;

public class Ejercicio1 {

	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		ServicioUsuarios su = new ServicioUsuarios();
		ServicioPedidos sp = new ServicioPedidos();

		su.ejecutarUsuarios();
		sp.ejecutarPedidos();
		logger.mostrarLogs();
	}

}
