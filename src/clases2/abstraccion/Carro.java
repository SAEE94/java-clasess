package abstraccion;

public class Carro {

	// Tipos de datos
	/**
	 * Numeros byte =1,2,3,4,5,6,7,8,9,10 ej: 10000 short =1,2,3,4,5,6,7,8,9,10 ej:
	 * 500000 int =1,2,3,4,5,6,7,8,9,10 ej: 1000000 long =1,2,3,4,5,6,7,8,9,10 ej:
	 * 5000000 double =1.0,2.234,3.123213123123123,4.123123213123,5,6,7,8,9,10 ej:
	 * 20000 float =1.0,2.0,3.123,4,5,6,7,8,9,10 ej: 10000
	 */

	/**
	 * boolean = true|false String = "1", "Silvio", "true", "-2", char =
	 * 1,'a','-','_','2'
	 */

	/**
	 * Declarar variables <Tipo de dato> <Nombre de la variable>
	 */
	int motor = 1;
	String color = "Rojo";
	int puertas;
	int ventanas;
	int llantas;
	String placa;
	int asientos;
	String marca;
	boolean esElectrico;
	boolean estaAsegurado;
	double kilometraje;
	float pi = 3.143123123123123123123213123f;
	double maximoValor = 0 - 20_000_000;

	/**
	 * constructor es un metodo <tipo_constructor>literalmente metodos anonimos
	 */
	Carro() {
		System.out.println("Estoy creando un nuevo carro");
	}
	
	Carro(int motor){
		this.motor = motor;
	}
	
	Carro(int motor, String color){
		this.motor = motor;
		this.color = color;
	}

	/**
	 * Funciones/Metodos/Comportamientos
	 */

	/**
	 * void <nombre_metodo> (){
	 * 
	 * }
	 */
	void encender() {
		System.out.println("El carro esta encendido");
	}

	void acelerar() {
		System.out.println("El carro esta acelerando");
	}

	void frenar() {
		System.out.println("El carro esta frenando");
	}

	void retroceder() {
		System.out.println("El carro esta retrocediendo");
	}

	void pitar() {
		System.out.println("El carro esta pitando");
	}

	void estacionar() {
		System.out.println("El carro esta estacionando");
	}

	void obtenerInformacion() {
		System.out.println("Cantidad de motores " + motor);
		System.out.println("Cantidad de ventanas " + ventanas);
		System.out.println("Color " + color);
		System.out.println("Es electrico " + esElectrico);
		System.out.println("Kilometraje " + kilometraje);
	}

}
