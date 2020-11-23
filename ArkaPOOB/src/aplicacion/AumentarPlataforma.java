package aplicacion;

/**
 * Se encarga de aumentar el tama�o de la plataforma
 * 
 * @author Juan Sebastian Fr�sica y Juan Sebasti�n G�mez
 *
 */
public class AumentarPlataforma extends Sorpresa {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public AumentarPlataforma(int x, int y) {
		super(x, y);
		setImagen("recursos/SorpresaPlataforma+.png");
	}

	@Override
	public void aplicarPoder(Jugador jugador, Bola bola) {
		Plataforma pl = new PlataformaGrande(0, 0, 0);
		jugador.cambiarPlataforma(pl, bola);
	}
}