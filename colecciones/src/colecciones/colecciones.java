package colecciones;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * La coleccion set no puede tener elementos duplicados
		 * solo tiene los elementos heredados de collection 
		 * existen diferentes tipos de implementaciones 
		 * 
		 * HashSet: esta implementacion almacena los elementos de una
		 * tabla hash. Es la que mejor rendimeiento tiene.
		 * Los elementos tienen un orden
		 * 
		 * HashSet orden aleatorio
		 * TreeSet ordena de mayor a menor o alfabeticamente
		 * LinkedHashSet respeta el orden que pusiste 
		 * 
		 */
		Set<String> frutas = new TreeSet(); 
		frutas.add("Mango");
		frutas.add("Manzana");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Caranbola");
		frutas.add("Maracuya");
		frutas.add("Platano");
		
		//for(String fruta: frutas) {
			//System.out.println(fruta);
		//}
		
		//System.out.println(frutas.size());
		
		/*
		 * La interfaz list define una sucesion de elemento
		 * Si admite elementos duplicados 
		 * añade nuevos metodos que podemos utilizar
		 * Acceso posicional a elementos: manipula elementos en función de su posición en la lista.
		 * Búsqueda de elementos: busca un elemento concreto de la lista y devuelve su posición.
		 * Rango de operación: permite realizar ciertas operaciones sobre ragos de elementos dentro de la propia lista.
		 * 
		 *
		 * Implementaciones:
		 * ArrayList
		 * LinkedList
		 * 
		 */
		
		List<String> frutas2 = new ArrayList<String>(); 
		frutas2.add("Mango");
		frutas2.add("Manzana");
		frutas2.add("Durazno");
		
		frutas2.add("Guayaba");
		frutas2.add("Pera");
		frutas2.add("Cereza");
		frutas2.add("Mandarina");
		frutas2.add("Caranbola");
		frutas2.add("Maracuya");
		frutas2.add("Platano");
		
		for(String f: frutas2) {
			System.out.println(f);
	}
		
		int pera = frutas2.indexOf("Pera");
		System.out.println(pera);
		System.out.println(frutas2.get(pera));
		
		/*
		 * int dato primitivo
		 * Integer es un objeto
		 */
		
		List<Integer> agenda = new ArrayList<Integer>();
		agenda.add(123);
		agenda.add(456);
		agenda.add(789);
		
		for(Integer a: agenda) {
			System.out.println(a);
	
		}
		
		//LinkedList
		List<String> animales = new LinkedList<String>();
		animales.add("Perro");
		animales.add("Gato");
		animales.add("Conejo");
		animales.add("Tortuga");
		animales.add("Oso");
		animales.add("Quetzal");
		
		for(String an: animales) {
			System.out.println(an);
		
  }
		
		/*
		 * La interfaz Map asocia claves o valores.
		 * No puede contener claves dupliocadas y cada
		 * cvlave solo puede tener asociado un valor 
		 * 
		 *  Implementaciones
		 *  HashMap
		 *  TreeMap
		 *  LinkedMap 
		 */
	 	Map <String, String> diccionario = new TreeMap<>();
	 	//diccionario.pu(clave, valor);
	 	diccionario.put("elemento1", "Bernardo Tomas");
	 	diccionario.put("Telefono", "5618114794");
	 	diccionario.put("Indice", "ewewewe");
	 	
	 	System.out.println(diccionario.get("elemento1"));
	 	
	 	for( Entry<String, String> entry : diccionario.entrySet()) {
	 		System.out.println(entry.getKey() +" ; "+entry.getValue());
	 		
	 	};
	 	
	 	
	 	/*
	 	 * animales[0]= "Perro";
	 	 * animales[1]= "Gato";
	 	 * animales[2]= "Caballo";
	 	 * animales[3]= "";
	 	 */
	 	
	}
}

