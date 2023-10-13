import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		//HASHMAP
		Map<String, String> country=new HashMap<>();
		country.put("TR", "Turkiye");
		country.put("GR", "Almanya");
		country.put("EN", "Ingiltere");
		country.put("FR", "France");
		System.out.println(country.get("FR"));
		country.remove("GR");
		
		System.out.println(country.size());
		//sıralamayı kendi haritalamasına göre yapar
		for (String countryKey : country.keySet()) {
			
			System.out.println(countryKey);
		}
		System.out.println("-------------------------");
		for (String countryvalue : country.values()) {
			System.out.println(countryvalue);
		}
		
		
		//LİNKEDHASHMAP
		//yazdığın sırayla ekana çıktı veriri. birbirine düğüm gibi bağlı önceki sonrakini gösteriri
		LinkedHashMap<Integer, String> students=new LinkedHashMap<>();
            
		students.put(1, "Basak");
		students.put(2, "Bayram");
		students.put(3, "mutluluk");
		
		System.out.println("***************************************");
	for (Integer ogrenciler : students.keySet()) {
		System.out.println(ogrenciler);
	}
	System.out.println("###########################################");
	for (String string : students.values()) {
		System.out.println(string);
	}
		//TREEMAP İSTEDİĞİN SIRAYLA YAZMANI SAĞLAR
	
		TreeMap<Integer,String> sıraliMap=new TreeMap<>();
		
	 sıraliMap.put(23,"Başak");
	 sıraliMap.put(3,"Hilal");
	 sıraliMap.put(45,"Hasan");
	 System.out.println("------------------------");
	 for (Integer s: sıraliMap.keySet()) {
		System.out.println(s);
	}
	 
	 
		
	}

	
}
