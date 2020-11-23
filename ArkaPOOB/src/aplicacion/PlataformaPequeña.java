package aplicacion;

/**
 * Representa una peque�a plataforma apodada Nave Espacial Vaus, que impide que
 * una bola salga de la zona de juego, haci�ndola rebotar.
 * 
 * @author Juan Sebastian Fr�sica y Juan Sebasti�n G�mez
 *
 */
public class PlataformaPequeña extends Plataforma {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public PlataformaPequeña(int x, int y, int color) {
		super(x, y, ("PlataformaNormalPequeña" + Integer.toString(color)));
	}

	@Override
	public void setColor(int color) {
		super.setImagen("recursos/PlataformaNormalPequeña" + Integer.toString(color) + ".png");
	}
}