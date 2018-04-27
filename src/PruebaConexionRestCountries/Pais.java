package PruebaConexionRestCountries;


public class Pais {

	private String name, capital, nativeName;
	private String[] topLevelDomain;
	private String alpha2Code, alpha3Code, demonym;
	private String[] callingCodes, altSpellings;	
	private String region, subregion;
	private long population;
	private double[] latlng;
	private double area;
	private String[] timezones, borders;
	private Currency[] currencies;
	private Language[] languages;
 	private Translation translations;
 	private String flag, cioc;
 	private RegionalBlock[] regionalBlocs;
 	
	public String toString() {
		return "Pais: " + name + " Capital: " + capital;
	}
	
	public class Currency{
		 String code, name, Symbol;
		 
	}
	
	public class Language{
		String iso639_1, iso639_2, name, nativeName;
	}
	
	public class Translation{
		String de,es,fr,jait,br,pt,nl,hr,fa;
	}
	
	public class RegionalBlock{
		String acronym, name;
		String[] otherAcronyms, otherNames;
	}
}
