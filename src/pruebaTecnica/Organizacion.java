package pruebaTecnica;

import java.time.LocalDate;

public class Organizacion {
	
	private static final double MONTO_MAXIMO = 1000;
	private static final double TASA_MINIMA = 0.3;
	private static final double TASA_MAXIMA = 5;
	

	
	
	public boolean validarOperacion(double monto) {
		boolean resultado = false;
		
		if(monto < MONTO_MAXIMO) {
			System.out.println("Operacion Valida");
			resultado = true;
		} else {
			System.out.println("Operacion Invalida");
		}
		
		return resultado;
	}
	
	public boolean validarTarjeta(Tarjeta tarjeta) {
		boolean resultado = false;
		LocalDate fechaHoy = LocalDate.now();
		
		if (fechaHoy.compareTo(tarjeta.getFechaVencimiento()) > 0) {
			System.out.println("Tarjeta INVALIDA");
		} else {
			System.out.println("Tarjeta VALIDA");
			resultado = true;
		}
		return resultado;
	}
	
	public void mostrarTarjeta(Tarjeta tarjeta) {
		System.out.println(tarjeta);
	}
	
	public void realizarOperacion(double importe, Tarjeta tarjeta) {
		double tasa = 0;
		if (validarOperacion(importe) && validarTarjeta(tarjeta)) {
			
			switch (tarjeta.getMarca()) {
			case AMEX:
				tasa = LocalDate.now().getMonthValue() * 0.1;
				break;

			case NARA:
				tasa = LocalDate.now().getDayOfMonth() * 0.5;
				break;
				
			case VISA:
				tasa = (double)(LocalDate.now().getYear() % 100)  / LocalDate.now().getMonthValue();
				break;
			}
			
			if (tasa < TASA_MINIMA) {
				tasa = TASA_MINIMA;
			} else if (tasa > TASA_MAXIMA) {
				tasa = TASA_MAXIMA;
			}
			
			double importeTotal = importe + (importe* tasa / 100);
			double tasaTruncada = Math.floor(tasa*100)/100;
			
			System.out.println("La tasa es de " + tasaTruncada + "% para la Tarjeta " + tarjeta.getMarca() + ", y el importe con la tasa es de $" + importeTotal);
		} 
		
	}

	
	public void compararTarjetas(Tarjeta tarjeta1, Tarjeta tarjeta2) {
		System.out.println((tarjeta1.equals(tarjeta2)) ? "Mismas Tarjetas" : "Tarjetas Diferentes");
	}
}
