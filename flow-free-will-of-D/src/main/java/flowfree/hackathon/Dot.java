package flowfree.hackathon;

import java.awt.Color;
import java.awt.Graphics;

public class Dot extends Piece {

	public Dot(Color color) {
		super(color);
	}

	@Override
	public void draw(Graphics g, int width, int height) {
		g.setColor(getColor().darker());
		g.fillOval(width / 6, height / 6, width - (width / 3), height - (height / 3));
	}
}
