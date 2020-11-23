package aplicacion;


/**
 * Aparecen raramente. Si alguno es golpeado, hace pasar directamente al siguiente nivel. Son destruidos con
un solo golpe de la bola. Dan 500 puntos.
 * @author Juan Sebastian Fr�sica y Juan Sebasti�n G�mez
 *
 */
public class BloqueRosado extends Bloque {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public BloqueRosado(int x, int y) {
		super(x, y);
		setImagen("recursos/BloqueRosado.png");
	}

	@Override
	public int getPuntaje() {
		return 500;
	}
	
	@Override
	public void destruyase(ArkaPOOB juego,Bola bola) {
		setVisible(false);
		juego.acabarNivel();
		Bloque bloque  = Bloque.crearBloque("BloqueNegro");
		juego.setUltimoDestruido(bloque);
	}
}
