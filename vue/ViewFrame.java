package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class ViewFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	private String titleFrame;
	private Image icon;
	private String iconLocation;
	private ViewPanel panel = new ViewPanel();
	
	
	
	public ViewFrame(int width, int height, String titleFrame){
		
		this.iconLocation = "C:\\Users\\Lula Jonathan\\Documents\\X2026\\X2 2022-2023\\SEM1 X2\\2 - Programmation Orienté Objet (Java)\\Projet Développement dune application POO-UML-JAVA\\images\\logo-DLX-800.png";
		this.icon = Toolkit.getDefaultToolkit().getImage(iconLocation);
		this.setTitle(titleFrame);
		this.setIconImage(icon);
		this.setLayout(null);
		this.setSize(width, height);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void setStartMenu(){
		
		this.panel.playMusic();
		this.panel.setStartMenu(getGraphics());
	}
	
	public void setLevelSelection(){
		
		this.panel.setBool(false);
		//this.panel.setLevelSelection(getGraphics());
	}
	
	public void setLevelSelected(String mapSelected){
		
		this.panel.setLevelSelected(getGraphics(), mapSelected);
	}
	
	public void setVictory(){
		
		this.panel.setVictory(getGraphics());
	}
	
	public void setDefeat(){
		
		this.getContentPane().setBackground(Color.BLACK);
		this.panel.setDefeat(getGraphics());
	}
	
	public void setTutorial(){
		
		this.panel.setTutorial(getGraphics());
	}

	public ViewPanel getPanel(){
		
		return panel;
	}

	public void setPanel(ViewPanel panel){
		
		this.panel = panel;
	}
}