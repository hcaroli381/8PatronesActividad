package patronBuilder;

public class Main {

	public static void main(String[] args) {
		Pedido pedidoBasico = new Pedido.Builder("Hugo", "Calle Laureola").build();
		Pedido pedidoComplejo = new Pedido.Builder("Javi", "Calle Laureola").setTelefono("7950440454")
				.setEmail("jv.caroli93@g.educaand.es").build();
		System.out.println("-- PEDIDO SIMPLE --");
		System.out.println(pedidoBasico);
		System.out.println("-- PEDIDO COMPLEJO --");
		System.out.println(pedidoComplejo);
	}

}
