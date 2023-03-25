package ejercicio10_13;


public abstract class Bidimensionalfigura extends Figurabase{
	
	
	public Bidimensionalfigura(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}

	public Bidimensionalfigura(double lado1, double lado2) {
		super(lado1, lado2);
	}

	public Bidimensionalfigura(double lado1) {
		super(lado1);
	}

	public Bidimensionalfigura() {
		super();
	}

	public abstract double obtenerArea();

}