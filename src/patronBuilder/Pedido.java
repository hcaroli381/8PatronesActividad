package patronBuilder;

public class Pedido {
	private String cliente;
	private String direccion;
	private String telefono;

	private String email;
	private String observaciones;

	private Pedido(Builder builder) {
		this.cliente = builder.cliente;
		this.direccion = builder.direccion;
		this.telefono = builder.telefono;
		this.email = builder.email;
		this.observaciones = builder.observaciones;
	}

	public static class Builder {
		private String cliente;
		private String direccion;
		private String telefono;
		private String email;
		private String observaciones;

		public Builder(String cliente, String direccion) {
			this.cliente = cliente;
			this.direccion = direccion;
		}

		public Builder setTelefono(String telefono) {
			this.telefono = telefono;
			return this;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder setObservaciones(String observaciones) {
			this.observaciones = observaciones;
			return this;
		}

		public Pedido build() {
			return new Pedido(this);
		}
	}

	@Override
	public String toString() {
		StringBuilder base, telefono, email, observaciones;
		base = new StringBuilder(String.format("---PEDIDO---\nCliente : %s\nDireccion : %s\n", cliente, direccion));
		telefono = new StringBuilder(String.format("Telefono : %s\n", this.telefono));
		email = new StringBuilder(String.format("Email : %s\n", this.email));
		observaciones = new StringBuilder(String.format("Observaciones : %s\n", this.observaciones));

		if (this.telefono != null) {
			base.append(telefono);
		}
		if (this.email != null) {
			base.append(email);
		}
		if (this.observaciones != null) {
			base.append(observaciones);
		}
		return base.toString();
	}

}
