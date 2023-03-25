package ejercicio10_13;

public class Figurabase {
	private double lado1;
	private double lado2;
	private double lado3;

	public Figurabase(double lado1, double lado2, double lado3) {
		establecerLado1(lado1);
		establecerLado2(lado2);
		establecerLado3(lado3);
	}

	public Figurabase(double lado1, double lado2) {
		this(lado1, lado2, 1);
	}

	public Figurabase(double lado1) {
		this(lado1, 1, 1);
	}

	public Figurabase() {
		this(1, 1, 1);
	}

	public double obtenerLado1() {
		return lado1;
	}

	public void establecerLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		} else {
			throw new IllegalArgumentException("Çíà÷åíèå äîëæíî áûòü áîëüøå 0");
		}
	}

	public double obtenerLado2() {
		return lado2;
	}

	public void establecerLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		} else {
			throw new IllegalArgumentException("Çíà÷åíèå äîëæíî áûòü áîëüøå 0");
		}

	}

	public double obtenerLado3() {
		return lado3;
	}

	public void establecerLado3(double lado3) {
		if (lado3 > 0) {
			this.lado3 = lado3;
		} else {
			throw new IllegalArgumentException("Çíà÷åíèå äîëæíî áûòü áîëüøå 0");
		}
	}
}