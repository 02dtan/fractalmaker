package fractalmaker;
import java.awt.*;
import java.awt.event.*;

public class ConfigScreen extends Frame implements ActionListener, WindowListener{
	private static final long serialVersionUID = -511905013914893538L;
	TextField widthField = new TextField(3);
	Label widthLabel = new Label("Width:");
	TextField heightField = new TextField(3);
	Label heightLabel = new Label("Height:");
	TextField thresholdField = new TextField(3);
	Label thresholdLabel = new Label("Threshold:");
	TextField startxField = new TextField(2);
	Label startxLabel = new Label("Starting:");
	TextField startyField = new TextField(2);
	Label plusSign = new Label("+");
	Label iSign = new Label("i");
	Button submit=new Button("Create");
	int startingX;
	int startingY;
	int threshold;
	int width=2;
	int height=3;
	
	Color firstIteration = (new Color(100,239,255));
	Color secondIteration = (new Color(255, 239, 100));
	
	public static void main(String[] args){
		ConfigScreen fractal = new ConfigScreen("Fractal");
		fractal.setSize(600,400);
		fractal.setVisible(true);
	}
	public ConfigScreen(String title){
		super(title);
		init();
	}
	public void init(){
		setLayout(new GridLayout(1,12));
		addWindowListener(this);
		add(widthLabel);
		add(widthField);
		add(heightLabel);
		add(heightField);
		add(thresholdLabel);
		add(thresholdField);
		add(startxLabel);
		add(startxField);
		add(plusSign);
		add(startyField);
		add(iSign);
		add(submit);
		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				width=Integer.parseInt(widthField.getText());
				height=Integer.parseInt(heightField.getText());
				threshold=Integer.parseInt(thresholdField.getText());
				startingX=Integer.parseInt(startxField.getText());
				startingY=Integer.parseInt(startyField.getText());
				FractalScreen fractalScreen = new FractalScreen(width, height, threshold, startingX, startingY);
			}
		});
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
