package patronSingleton;

public class ServicioUsuarios {
	Logger logger = Logger.getInstance();

	public void ejecutarUsuarios() {
		logger.registrar("usuario creado");
		logger.registrar("usuario eliminado");
	}
}
