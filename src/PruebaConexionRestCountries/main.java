package PruebaConexionRestCountries;

import java.util.List;


public class main {

	public static void main(String[] args) {

		
		
		ServicioPaises serv = new ServicioPaises();
		List<Pais> lista = serv.obtenerPaises();
		if (!lista.isEmpty()) {
			for (Pais p : lista) {
				System.out.println(p);
			}
		}
		
		
	}

}
