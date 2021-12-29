package pruebaTecnica;

import java.time.LocalDate;

public class Tarjeta {
	private Marca marca;
	private String numeroTarjeta;
	private Cardholder cardholder;
	private LocalDate fechaVencimiento;
	
	public Tarjeta(Marca marca, String numeroTarjeta, Cardholder cardholder, LocalDate fechaDeVencimiento) {
		this.marca = marca;
		this.numeroTarjeta = numeroTarjeta;
		this.cardholder = cardholder;
		this.fechaVencimiento = fechaDeVencimiento;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public Marca getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Tarjeta: Marca: " + marca + " | Numero de Tarjeta: " + numeroTarjeta + " | CardHolder: " + cardholder
				+ " | Fecha de Vencimiento: " + fechaVencimiento;
	}



	
	
	
	
	

	
}
