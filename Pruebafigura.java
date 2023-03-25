package ejercicio10_13;


import java.util.ArrayList;
import java.util.List;
public class Pruebafigura {
	public static void main(String[] args) {

		List<Figurabase> figuraList = new ArrayList<Figurabase>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -6960608914345042532L;

			{
				//add(new Circulofigura(15));
				add(new Cuadradofigura(8));
				add(new Cubofigura(16));
				//add(new Esferafigura(20));
				
			}
		};

		for (Figurabase figura : figuraList) {
			if (figura instanceof Bidimensionalfigura) {
System.out.println("El area de " + figura + " es = " + ((Bidimensionalfigura) figura).obtenerArea());
			} else if (figura instanceof Tridimensionalfigura) {
				
System.out.println("El area de " + figura + " es  = " + ((Tridimensionalfigura) figura).obtenerArea()
		+ " | El volumen de la figura es = " + ((Tridimensionalfigura) figura).obtenerVolumen());

			}
		}

	}
}