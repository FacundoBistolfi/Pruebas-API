package PruebaConexionRestCountries;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class ConectorPaises {

	public String getPaises() {
		return conectarAPI("https://restcountries.eu/rest/v2/all");
	}

	public String getPaises(String nombre) {
		return conectarAPI("https://restcountries.eu/rest/v2/name/" + nombre);
	}

	public String getPais(String nombre) {
		return conectarAPI("https://restcountries.eu/rest/v2/name/" + nombre + "?fullText=true");
	}

	public String getPaisPorCapital(String capital) {
		return conectarAPI("https://restcountries.eu/rest/v2/capital/" + capital);
	}

	public String getPaisPorRegion(String region) {
		return conectarAPI("https://restcountries.eu/rest/v2/region/" + region);
	}

	private String conectarAPI(String uri) {
		String res = "";
		URL url;
		HttpsURLConnection con;
		BufferedReader br;
		try {
			url = new URL(uri);
			con = (HttpsURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			if (con.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + con.getResponseCode());
			}

			br = new BufferedReader(new InputStreamReader((con.getInputStream())));

			String output = "";

			while ((output = br.readLine()) != null) {
				res += output;
			}

			con.disconnect();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
}
