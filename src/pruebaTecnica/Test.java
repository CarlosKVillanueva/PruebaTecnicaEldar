package pruebaTecnica;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		
		Tarjeta tarjeta1 = new Tarjeta(Marca.AMEX, "1111 2222 3333 4444", new Cardholder("Pedro", "Lopez"), LocalDate.of(2030, 12, 12));
		Tarjeta tarjeta2 = new Tarjeta(Marca.VISA, "4444 3333 2222 1111", new Cardholder("Maria", "Gonzalez"), LocalDate.of(2018, 04, 8));
		Tarjeta tarjeta3 = new Tarjeta(Marca.NARA, "9999 8888 7777 66662", new Cardholder("Juan", "Perez"), LocalDate.of(2027, 05, 11));
		Tarjeta tarjeta4 = new Tarjeta(Marca.VISA, "8888 7777 4444 2222", new Cardholder("Jose", "Ramirez"), LocalDate.of(2027, 11, 8));

		Organizacion organizacion = new Organizacion();
		
		
		System.out.println("\n*** Validar Tarjeta ***");
		organizacion.validarTarjeta(tarjeta1);
		organizacion.validarTarjeta(tarjeta2);
		organizacion.validarTarjeta(tarjeta3);
		
		System.out.println("\n*** Validar Operacion ***");
		organizacion.validarOperacion(800);
		organizacion.validarOperacion(1200);
		
		System.out.println("\n*** Comparacion Tarjetas ***");
		organizacion.compararTarjetas(tarjeta1,tarjeta1);
		
		
		
		System.out.println("\n*** Mostrar Tarjeta ***");
		organizacion.mostrarTarjeta(tarjeta1);
		
		System.out.println("\n*** Realizar Operacion ***");
		organizacion.realizarOperacion(1200, tarjeta3);
		System.out.println("");
		organizacion.realizarOperacion(800, tarjeta1);
		System.out.println("");
		organizacion.realizarOperacion(600, tarjeta3);
		System.out.println("");
		organizacion.realizarOperacion(500, tarjeta4);
//		
	}

}
