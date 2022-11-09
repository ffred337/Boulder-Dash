package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;



public class ViewPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean bool = true;
	SoundManager sound = new SoundManager();
	
	

	public void setStartMenu(Graphics g){
		
		int frameWidth = 1440, frameHeight = 768, posXB = 325, posYB = 50, posXS = 580, posYS = 550;
		int timeSleep = 1000;
		PanelComponent background = new PanelComponent(0, 0, "C:\\Users\\Lula Jonathan\\Documents\\X2026\\X2 2022-2023\\SEM1 X2\\2 - Programmation Orienté Objet (Java)\\Projet Développement dune application POO-UML-JAVA\\images\\background1.jpg");
		PanelComponent boulderMenu = new PanelComponent(posXB, posYB, "C:\\Users\\Lula Jonathan\\Documents\\X2026\\X2 2022-2023\\SEM1 X2\\2 - Programmation Orienté Objet (Java)\\Projet Développement dune application POO-UML-JAVA\\images\\logo-DLX-800.png");
		Font font = new Font("Bauhaus 93", Font.BOLD, 40);
		String Press = "PRESS ENTER";
		
		//this.playMusic();	
		g.setFont(font);
		g.setColor(Color.RED);
		g.drawImage(background.getImage().getScaledInstance(frameWidth, frameHeight, Image.SCALE_DEFAULT), 0, 0, this);
		g.drawImage(boulderMenu.getImage(), posXB, posYB, this);
		
		if(bool == true){
			
			try{
				
				Thread.sleep(timeSleep);
				g.drawImage(background.getImage().getScaledInstance(frameWidth, frameHeight, Image.SCALE_DEFAULT), 0, 0, this);
				g.drawImage(boulderMenu.getImage(), posXB, posYB, this);
				g.drawString(Press, posXS, posYS);
				Thread.sleep(timeSleep);
				g.drawImage(background.getImage().getScaledInstance(frameWidth, frameHeight, Image.SCALE_DEFAULT), 0, 0, this);
				g.drawImage(boulderMenu.getImage(), posXB, posYB, this);
				//continue;
				setStartMenu(g);
			}
			
			catch(InterruptedException e){
			
				e.printStackTrace();
			}
		}
		
		if(bool == false){
			
			this.setLevelSelection(g);
		}
	}
	
	public void update(){
		
		this.repaint();
	}
	
	public void setLevelSelection(Graphics g){
		
		Font font = new Font("Bauhaus 93", Font.ITALIC, 40);
		g.setFont(font);
		g.setColor(Color.RED);
		
		int levelSelectorX = 200, levelSelectorY = 100, x_ = 50, y_ = 50;
		String levelSelector = "LEVEL SELECTOR";
		String map_1 = "-> Press 1 for map 1";
		String map_2 = "-> Press 2 for map 2";
		String map_3 = "-> Press 3 for map 3";
		String map_4 = "-> Press 4 for map 4";
		String map_5 = "-> Press 5 for map 5";
		
		PanelComponent background = new PanelComponent(0, 0, "C:\\Users\\Lula Jonathan\\Documents\\X2026\\X2 2022-2023\\SEM1 X2\\2 - Programmation Orienté Objet (Java)\\Projet Développement dune application POO-UML-JAVA\\images\\background1.jpg");
		
		g.drawImage(background.getImage().getScaledInstance(1440, 768, Image.SCALE_DEFAULT), 0, 0, this);
		g.drawString(levelSelector, levelSelectorX, levelSelectorY);
		g.drawString(map_1, levelSelectorX + x_ , levelSelectorY + y_);
		g.drawString(map_2, levelSelectorX + x_ , levelSelectorY + y_ * 2);
		g.drawString(map_3, levelSelectorX + x_ , levelSelectorY + y_ * 3);
		g.drawString(map_4, levelSelectorX + x_ , levelSelectorY + y_ * 4);
		g.drawString(map_5, levelSelectorX + x_ , levelSelectorY + y_ * 5);
		
	}
	
	public void setLevelSelected(Graphics g, String mapSelected){
		
		Font font = new Font("Bauhaus 93", Font.ITALIC, 40);
		g.setFont(font);
		g.setColor(Color.RED);
		
		//PanelComponent background = new PanelComponent(0, 0, "C:\\Users\\Lula Jonathan\\Documents\\X2026\\X2 2022-2023\\SEM1 X2\\2 - Programmation Orienté Objet (Java)\\Projet Développement dune application POO-UML-JAVA\\images\\background1.jpg");
		
		//g.drawImage(background.getImage().getScaledInstance(1440, 768, Image.SCALE_DEFAULT), 0, 0, this);
		g.drawString(mapSelected, 400, 500);
		g.drawString("PRESS ENTER...", 1000, 700);
	}
	
	public void setVictory(Graphics g){
		
		Font font = new Font("Bauhaus 93", Font.ITALIC, 80);
		g.setFont(font);
		g.setColor(Color.RED);
		PanelComponent background = new PanelComponent(0, 0, "C:\\Users\\Lula Jonathan\\Documents\\X2026\\X2 2022-2023\\SEM1 X2\\2 - Programmation Orienté Objet (Java)\\Projet Développement dune application POO-UML-JAVA\\images\\background1.jpg");
		PanelComponent trophy = new PanelComponent(0, 0, "C:\\Users\\Lula Jonathan\\Documents\\X2026\\X2 2022-2023\\SEM1 X2\\2 - Programmation Orienté Objet (Java)\\Projet Développement dune application POO-UML-JAVA\\images\\trophy_1.jpg");
		
		g.drawImage(background.getImage().getScaledInstance(1440, 768, Image.SCALE_DEFAULT), 0, 0, this);
		g.drawImage(trophy.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT), 400, 0, this);
		g.drawString("You have won", 450, 700);
	}
	
	public void setDefeat(Graphics g){
		
		Font font = new Font("Bauhaus 93", Font.ITALIC, 80);
		g.setFont(font);
		g.setColor(Color.RED);
		
		g.drawString("You lost", 550, 400);
	}
	
	public void setTutorial(Graphics g){
		
		PanelComponent background = new PanelComponent(0, 0, "C:\\Users\\Lula Jonathan\\Documents\\X2026\\X2 2022-2023\\SEM1 X2\\2 - Programmation Orienté Objet (Java)\\Projet Développement dune application POO-UML-JAVA\\images\\background1.jpg");
		PanelComponent rockford = new PanelComponent(430, 150, "C:\\Users\\Lula Jonathan\\Documents\\X2026\\X2 2022-2023\\SEM1 X2\\2 - Programmation Orienté Objet (Java)\\Projet Développement dune application POO-UML-JAVA\\player_sprites\\tile000.png");
		PanelComponent diamond = new PanelComponent(530, 250, "C:\\Users\\Lula Jonathan\\Documents\\X2026\\X2 2022-2023\\SEM1 X2\\2 - Programmation Orienté Objet (Java)\\Projet Développement dune application POO-UML-JAVA\\decor_tiles\\tile004.png");
		Font font = new Font("Bauhaus 93", Font.ITALIC, 35);
		g.setFont(font);
		g.setColor(Color.RED);
		String a = "You represent Rockford.", b = "You have to dig to collect diamonds.",
		c = "Use the keys Z, Q, S and D. Z to go UP, S to go Down, Q to go Right, D to go Left", d = "Good Luck !";
		
		g.drawImage(background.getImage().getScaledInstance(1440, 768, Image.SCALE_DEFAULT), 0, 0, this);
		g.drawImage(rockford.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT), 430, 150, this);
		g.drawImage(diamond.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT), 630, 200, this);
		g.drawString("Tutorial (How to play)", 200, 100);
		g.drawString("PRESS ENTER...", 1000, 700);
		g.drawString(a, 50, 200);
		g.drawString(b, 50, 250);
		g.drawString(c, 50, 300);
		g.drawString(d, 50, 550);
	}
	
	public void playMusic(){
		
		sound.setFile();
		sound.play();
		sound.loop();
	}
	
	public void stopMusic(){
		
		sound.stop();
	}

	public boolean getBool(){
		
		return bool;
	}

	public void setBool(boolean bool){
		
		this.bool = bool;
	}
}