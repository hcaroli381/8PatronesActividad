package patrones;

public class ServicioPedidos {
	Logger logger = Logger.getInstance();

	public void ejecutarPedidos() {
		logger.registrar("pedido creado");
		logger.registrar("pedido eliminado");
	}
}
