package patronFactory;

public class SmsNotification implements Notificacion {
	@Override
	public void enviar(String mensaje) {
		System.out.printf("[SMS] %s\n", mensaje);
	}
}
