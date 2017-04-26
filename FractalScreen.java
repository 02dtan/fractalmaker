package fractalmaker;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FractalScreen extends Frame implements ActionListener, WindowListener{
	int startingX;
	int startingY;
	int threshold;
	int width=2;
	int height=3;
	
	public FractalScreen(int width, int height, int threshold, int startingX, int startingY){
		this.startingX = startingX;
		this.startingY = startingY;
		this.threshold = threshold;
		this.height = height;
		this.width = width;
		init();
	}
	public void init(){
		setLayout(new GridLayout(width,height));
		setSize(1000,1000);
		addWindowListener(this);
		setVisible(true);
		makeGraph();
	}
	public void makeGraph(){
		Generator gen = new Generator(width, height, threshold, startingX, startingY);
		int[][] mat = gen.gen();
		for(int row = 0; row<height; row++){
			for(int col = 0; col<width; col++){
				Cell cell = new Cell(mat[row][col]);
				add(cell);
			}
		}
	}
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		dispose();
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void actionPerformed(ActionEvent e) {}
}
