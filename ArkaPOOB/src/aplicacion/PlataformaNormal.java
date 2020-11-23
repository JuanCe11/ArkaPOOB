package aplicacion;

/**
 * Sigue las instrucciones del jugador y rebota siempre la bola.
 * 
 * @author Juan Sebastian Fr�sica y Juan Sebasti�n G�mez
 *
 */
public class PlataformaNormal extends Plataforma {

	/**
	 *
	 */
	private static final long serialVersionUID = -9074419311447334071L;

	public PlataformaNormal(int x, int y, int color) {
		super(x, y, ("PlataformaNormalBasica" + Integer.toString(color)));
	}

	@Override
	public void setColor(int color) {
		super.setImagen("recursos/PlataformaNormalBasica" + Integer.toString(color) + ".png");
	}
}
