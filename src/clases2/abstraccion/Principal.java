package abstraccion;

public class Principal {    
    
    public static void main(String[] args) {
    	
    	/**
    	 * Conceptos cuando usamos variables
    	 * Declaración - Inicializacion / Primitivos
    	 * Declaración - Instanciacion  / Clases
    	 */
    	
    	/**
    	 * Para instanciar una clase usamos el operador <new>
    	 */
    	
   
    	Carro carro = new Carro(); 
    	Carro carro2 = new Carro(); 
    	Carro carro3 = new Carro(5);
    	Carro carro4 = new Carro(5, "Amarillo");
    	
    	
    	
    	carro.motor = 2;
    	carro.color = "Verde";
    	carro.ventanas = 5;
    	carro.esElectrico = true;
    	carro.kilometraje = 20500.10;
    	
    	carro2.motor = 10;
    	
    	
    	carro.encender();
    	carro.acelerar();
    	carro.estacionar();
    	carro.pitar();
    	carro.obtenerInformacion();
    	//carro.obtenerInformacion();
    	carro4.obtenerInformacion();
    	
    	
    	
	}
}

/**
int [][] figuras = new int[5][5];
int n = figuras.length;
System.err.println(n);
for( int i = 0; i < figuras.length; i++) {
	for( int  j = 0; j < figuras.length; j++) {
		if( i == j ) figuras[i][j]=1;
		if( j == (n-1)) {
			 figuras[i][j]=1;
			 n-=1;
		}
	}
}

for( int i = 0; i < figuras.length; i++) {
	for( int  j = 0; j < figuras.length; j++) {
		System.out.print(figuras[i][j] + "-");
	}
	System.out.println();
}
*/