package PruebaConexionRestCountries;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class ServicioPaises {

	private ConectorPaises conector;

	public ServicioPaises() {
		conector = new ConectorPaises();
	}

	public List<Pais> obtenerPaises() {
		//Cargo el tipo "Lista de paises"
		Type tipoListaDePaises = new TypeToken<ArrayList<Pais>>(){}.getType();  

		//List<Pais> lista = new ArrayList<Pais>();

		Gson gson = new Gson();
		String jsonPaises = conector.getPaises();
		List<Pais> lista = null;
		if(!(jsonPaises==null))
			lista = gson.fromJson(jsonPaises,  tipoListaDePaises);
		
		return lista;
	}

}
