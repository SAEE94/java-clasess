package condicionales;

public class Condicionales {

	/**
	 * 
	 * Sintaxis = la forma en como se escribe un lenguaje
	 */
	public static void main(String[] args) {
		// condicionalIf();

		Persona persona = new Persona("Juan", 22, "Cali", false);
		condicionalSwitch(persona);
	}

	public static void condicionalIf() {
		// Puede ingresar si tiene 18 años

		Persona antonella = new Persona("Yesenia", 16, "Cali", true);
		Persona yeison = new Persona("Gerardo", 17, "Cartagena", true);
		Persona silvio = new Persona("Javier", 19, "Cali", false);

		/*
		 * if (condicion que vamos a evaluar){ // cuerpo de la condicion }
		 */

		// = asignacion
		// == comparacion
		// 1 == 1;
		// 1 < 1;
		// 1 <= 1;
		// 1 > 1;
		// 1 >= 1;
		// 1 != 1;
		// ! cambia la condicion true > false | false > true

		if (silvio.estaBorracho) {
			// do nothing
		} else {
			System.out.println("Silvio sigue en la fiesta");
		}

		if (!silvio.estaBorracho) {
			System.out.println("Silvio sigue en la fiesta");
		}

		if (antonella.edad != 18) {
			System.out.println(antonella.nombre + " puede ingresar");
		} else if (antonella.ciudad.equals("Medellin")) {
			System.out.println(antonella.nombre + " puede ingresar por su ciudad");
		} else {
			System.out.println(antonella.nombre + " no puede ingresar");
		}
	}

	public static void condicionalSwitch(Persona persona) {
		/*
		 * switch( valor ) {
		 * 
		 * case 12: // cuerpo condicion break; case 13: // cuerpo condicion break; }
		 * 
		 */

		switch (persona.edad) {
		case 12:
			System.out.println("tiene 12 años");
			break;
		case 13:
			System.out.println("tiene 13 años");
			break;
		case 14:
			System.out.println("tiene 14 años");
			break;
		case 15:
			System.out.println("tiene 15 años");
			break;
		default:
			System.out.println("la persona es mayor de 15 años");
		}

	}
}
