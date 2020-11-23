package aplicacion;

import java.util.ArrayList;

/**
 * Representa un modo de usuario CPU, su prioridad es destruir bloques
 * 
 * @author Juan Sebastian Fr�sica y Juan Sebasti�n G�mez
 *
 */
public class Destructor extends Maquina {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public Destructor(int x, int y) {
		super(x, y);
	}

	@Override
	public int tipoMaquina() {
		return 1;
	}

	@Override
	public void mover(Bola bola, ArrayList<Sorpresa> sorpresas, Jugador otroJugador) {
		if (buscarDireccion(bola) == 1) {
			moveLeft(otroJugador);
		} else {
			moveRight(otroJugador);
		}
	}

	/**
	 * Dice hacia donde moverse dependiendo de la bola
	 * 
	 * @param bola      bola actual del juego
	 * @param sorpresas lista de las sorpresas en el juego.
	 * @return 1 si va a al izquierda o 0 si va a la derecha
	 */
	private int buscarDireccion(Bola bola) {
		int direccion = 0;
		if (bola.getX() < getX() + (getAncho() / 2)) {
			direccion = 1;
		}
		return direccion;
	}

}
