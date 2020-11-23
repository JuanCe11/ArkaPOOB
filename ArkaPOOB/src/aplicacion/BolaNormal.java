package aplicacion;

/**
 * Representa una bola que recorre el tablero destruyendo bloques y rebotando
 * con paredes y plataformas.
 * 
 * @author Juan Sebastian Fr�sica y Juan Sebasti�n G�mez
 *
 */
public class BolaNormal extends Bola {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	protected double velocidad = 2;

	public BolaNormal(int x, int y) {
		super(x, y);
	}

}
