package ejercicio10_13;


public class Cubofigura extends Tridimensionalfigura{
	public Cubofigura(double altura) {
		super(altura);
	}

	
	public double obtenerArea() {
		return super.obtenerLado1() * super.obtenerLado1() * 6;
	}

	
	public double obtenerVolumen() {
		return super.obtenerLado1() * super.obtenerLado1() * super.obtenerLado1();
	}


	public String toString() {
		return " un Cubo";
	}
	
}