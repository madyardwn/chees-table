import java.awt.*;
import javax.swing.JFrame;

public class CheesTable extends Canvas{
	
  // Chessboard
  public void paint(Graphics g) {
		int x = 0;
		int y = 0;
		int width = 50;
		int height = 50;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i + j) % 2 == 0) {
					g.setColor(Color.WHITE);
				} else {
					g.setColor(Color.BLACK);
				}
				g.fillRect(x, y, width, height);
				x += width;
			}
			x = 0;
			y += height;
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Chessboard");
		Canvas canvas = new CheesTable();
		canvas.setSize(400, 400);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
	}

}
