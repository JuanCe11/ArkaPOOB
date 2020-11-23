package aplicacion;

/**
 * Hace la plataforma pegajosa por algunos turnos siguientes (normalmente tres).
 * Un turno equivale a una llegada de la bola a la plataforma.
 * 
 * @author Juan Sebastian Fr�sica y Juan Sebasti�n G�mez
 *
 */
public class SorpresaPlataformaPegajosa extends Sorpresa {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public SorpresaPlataformaPegajosa(int x, int y) {
		super(x, y);
		setImagen("recursos/SorpresaPlataformaPegajosa.png");
	}

	@Override
	public void aplicarPoder(Jugador jugador, Bola bola) {
		Plataforma pl = new PlataformaPegajosa(0, 0, 0);
		jugador.cambiarPlataforma(pl, bola);
	}
}
