package pruebaTecnica;

public class Cardholder {
	private String nombre;
	private String apellido;
	public Cardholder(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return nombre + " " + apellido;
	}
	
	
	
	
}
