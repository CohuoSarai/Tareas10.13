package ejercicio10_13;


public abstract class Circulofigura extends Bidimensionalfigura{
	
	public Circulofigura(double radio) {
		super(radio);
	}

	public double obtenerArea() {
		return Math.PI * super.obtenerLado1() * super.obtenerLado1();
	}

	public String toString() {
		return " un Circulo";
	}
	
}