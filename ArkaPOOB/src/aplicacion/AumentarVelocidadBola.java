package aplicacion;

/**
 * Se encarga de aumentar la velocidad de la bola
 * 
 * @author Juan Sebastian Fr�sica y Juan Sebasti�n G�mez
 *
 */
public class AumentarVelocidadBola extends Sorpresa {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public AumentarVelocidadBola(int x, int y) {
		super(x, y);
		setImagen("recursos/SorpresaBola+.png");
	}

	@Override
	public void aplicarPoder(Jugador jugador, Bola bola) {
		bola.aumentarVelocidad();
	}

}
