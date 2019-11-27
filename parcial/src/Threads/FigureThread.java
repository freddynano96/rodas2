package Threads;

import Controlador.WindowController;
import Modelo.FigureGame;

public class FigureThread extends Thread{
	
	private WindowController wc;
	private FigureGame fg;
	public FigureThread(WindowController winController, FigureGame fg){
		wc=winController;
		this.fg=fg;
	}
	
	public void run() {
		
	}
}
