package ejercicio10_13;


public abstract class Esferafigura extends Tridimensionalfigura {
		public Esferafigura(double radio) {
			super(radio);
		}

		public double obtenerArea() {

			return 4 * Math.PI * Math.pow(super.obtenerLado1(), 2);
		}

		
		public double obtenerVolumen() {

			return 4 / 3 * Math.PI * Math.pow(super.obtenerLado1(), 3);
		}
		

		public String toString() {
			return " una Esfera";
		}
	}
