package aplicacion;

/**
 * Clase propia de excepciones
 * 
 * @author Juan Sebastian Fr�sica y Juan Sebasti�n G�mez
 *
 */
public class ArkaPOOBException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public static final String MISMO_COLOR = "Los jugadores no pueden tener el mismo color.";
	public static final String SOLO_GRISES = "No puede jugar solo con bloques grises.";
	public static final String SOLO_NEGROS = "No puede jugar solo con bloques negros.";
	public static final String SIN_BLOQUES = "No puede jugar sin bloques seleccionados.";
	public static final String SIN_SORPRESAS = "Si escogio el bloque azul, no puede jugar sin sorpresas.";
	public static final String SIN_JUEGO = "Cree un juego antes de guardar.";
	public static final String NO_ABRIR = "Imposible abrir el juego. Aseg�rse que es un archivo v�lido.";

	public ArkaPOOBException(String message) {
		super(message);
	}

}
