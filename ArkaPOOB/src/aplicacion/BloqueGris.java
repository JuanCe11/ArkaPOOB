package aplicacion;

/**
 * Estos bloques son indestructibles, la bola nunca los destruye. Cuando una
 * bola se estrella con ellos, rebota como lo har�a con una plataforma. Al igual
 * que los bloques rojos, aparecen com�nmente. No dan puntos.
 * 
 * @author Juan Sebastian Fr�sica y Juan Sebasti�n G�mez
 *
 */
public class BloqueGris extends Bloque {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public BloqueGris(int x, int y) {
		super(x, y);
		setImagen("recursos/BloqueGris.png");
	}

	@Override
	public void destruyase(ArkaPOOB juego, Bola bola) {
	}

	@Override
	public boolean enJuego() {
		return false;
	}

	@Override
	public int getPuntaje() {
		return 0;
	}
}
