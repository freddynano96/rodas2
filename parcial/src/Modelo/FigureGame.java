package Modelo;

public class FigureGame {

	private double posX;
	private double posY;
	private boolean state;
	
	
	public FigureGame() {
		
	}
	
	public double getPosX() {
		return posX;
	}
	
	public void setPosX(double x) {
		posX = x;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}
	
	public boolean isState() {
		return this.state;
	}
	
	public boolean winGame() {
		return;
	}
	
	public boolean endGame() {
		return;
	}
	
	public double distance(double d1, double d2) {
		return;
	}
}
