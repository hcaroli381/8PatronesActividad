package patronFactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		String mensaje = "a";
		int opcion;
		NotificacionFactory nf = new NotificacionFactory();
		Notificacion n;
		do {

			System.out.print("1.email\n2.sms\n3.push\n");

			opcion = ci.readIntInRange(1, 3);

			n = switch (opcion) {
			case 1 -> nf.crearNotificacion("email");
			case 2 -> nf.crearNotificacion("sms");
			case 3 -> nf.crearNotificacion("push");
			default -> nf.crearNotificacion("email");

			};
			mensaje = ci.readString();
			n.enviar(mensaje);
		} while (opcion == 1 || opcion == 2 || opcion == 3);

	}

}
