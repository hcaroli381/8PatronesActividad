package patronFactory;

public class NotificacionFactory {
	public Notificacion crearNotificacion(String tipo) {
		Notificacion notificacion;
		notificacion = switch (tipo) {
		case "email" -> new EmailNotification();
		case "sms" -> new SmsNotification();
		case "push" -> new PushNotification();
		default -> throw new IllegalArgumentException("Unexpected value: " + tipo);
		};
		return notificacion;
	}
}
