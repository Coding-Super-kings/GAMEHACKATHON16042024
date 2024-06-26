package flowfree.hackathon;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Piece {

	Color color;
	private int centerX;
	private int centerY;

	public Piece(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public abstract void draw(Graphics g, int width, int height);

}
