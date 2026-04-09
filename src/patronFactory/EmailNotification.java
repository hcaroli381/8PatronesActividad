package patronFactory;

public class EmailNotification implements Notificacion {

	@Override
	public void enviar(String mensaje) {
		System.out.printf("[Email] %s\n", mensaje);
	}

}
