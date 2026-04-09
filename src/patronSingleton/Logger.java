package patronSingleton;

import java.util.ArrayList;
import java.util.List;

public class Logger {
	private static Logger instance;
	private List<String> registro;

	private Logger() {
		registro = new ArrayList<>();
	}

	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	public void registrar(String mensaje) {
		registro.add(String.format("[INFO] %s\n", mensaje));
	}

	public void mostrarLogs() {
		System.out.println(registro.toString());
	}

}
