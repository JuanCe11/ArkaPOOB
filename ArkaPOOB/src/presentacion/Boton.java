package presentacion;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;

/**
 * Representa un bot�n usado dentro del juego, con posiciones X y Y
 * 
 * @author Juan Sebastian Fr�sica y Juan Sebasti�n G�mez
 *
 */
public class Boton extends JButton {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage imagen;

	public Boton(String root, int x, int y) {
		super();
		try {
			imagen = ImageIO.read(new File("recursos/" + root + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		setBounds(x, y, imagen.getWidth(), imagen.getHeight());
	}

	public void paint(Graphics g) {
		g.drawImage(imagen, 0, 0, null);
	}

}
