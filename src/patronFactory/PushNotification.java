package patronFactory;

public class PushNotification implements Notificacion {
	@Override
	public void enviar(String mensaje) {
		System.out.printf("[Push] %s\n", mensaje);
	}
}
