package abstraccion;

public class Carro {

	// Tipos de datos
	/**
	 * <tipo de dato> <rango>
	 * <byte> 	<-128> <128> 
	 * <short> <-32768> <32768> 
	 * <int>  <-2147483648> <2147483648>
	 * <long> <-9223372036854775808> <9223372036854775808> 
	 * <double> <-1.79769313486232e308> <1.79769313486232e308> 
	 * <float> <-3.402823e38> <3.402823e38>
	 * <boolean> <true|false>
	 * <String> <cadenas de texto ilimitadas>
	 */

	/**
	 * Estructura para declara una variable
	 * <Tipo de dato> <Nombre de la variable> <una posible inicializacion>
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
	 * Estructuras para crear un constructor
	 * <Nombre de la clase>)(){}
	 * <Nombre de la clase>)(<uno o varios parametros si es necesario){}
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
	 
	 * Estructura para crear un metodo
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
