package aplicacion;

/**
 * Estos bloques al ser golpeados se transforman en el �ltimo bloque eliminado
 * manteniendo su posici�n. Son poco comunes. Otorgan 600 puntos.
 * 
 * @author Juan Sebastian Fr�sica y Juan Sebasti�n G�mez
 *
 */
public class BloqueNegro extends Bloque {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public BloqueNegro(int x, int y) {
		super(x, y);
		setImagen("recursos/BloqueNegro.png");
	}

	@Override
	public int getPuntaje() {
		int puntaje = 0;
		if (!isVisible()) {
			puntaje = 600;
		}
		return puntaje;
	}

	@Override
	public void destruyase(ArkaPOOB juego, Bola bola) {
		setVisible(false);
		cambiar(juego.getUltimoDestruido());
		juego.setUltimoDestruido(this);
	}

	private Bloque cambiar(Bloque nuevoBloque) {
		if (nuevoBloque == null) {
			nuevoBloque = new BloqueNegro(0, 0);
		}
		nuevoBloque.reiniciar();
		nuevoBloque.setX(getX());
		nuevoBloque.setY(getY());
		nuevoBloque.setVisible(true);
		return nuevoBloque;
	}
}
