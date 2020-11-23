package aplicacion;

public class DisminuirVelocidadBola extends Sorpresa {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public DisminuirVelocidadBola(int x, int y) {
		super(x, y);
		setImagen("recursos/SorpresaBola-.png");
	}

	@Override
	public void aplicarPoder(Jugador jugador, Bola bola) {
		bola.disminuirVelocidad();
	}
}
