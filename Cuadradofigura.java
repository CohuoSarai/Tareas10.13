package ejercicio10_13;


public class Cuadradofigura extends Bidimensionalfigura {
	public Cuadradofigura(double altura ) {
		super(altura);
	}

	public double obtenerArea() {

		return super.obtenerLado1() * super.obtenerLado1();
	}

	public String toString() {
		return " un Cuadrado";
	}
	
}