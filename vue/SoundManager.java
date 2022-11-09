package view;

import java.io.File;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



public class SoundManager{

	//private BoulderDashView view;
	//private URL url; // Main sound track url.
	private Clip clip;
	private String soundLocation;
	
	
	
	public SoundManager(){
		
		//this.url = getClass().getResource("Main_Theme.wav");
		this.soundLocation = "C:\\Users\\Lula Jonathan\\Documents\\X2026\\X2 2022-2023\\SEM1 X2\\2 - Programmation Orienté Objet (Java)\\Projet Développement dune application POO-UML-JAVA\\sound\\Main_Theme.wav";
	}
	
	public void setFile(){
		
		try{
			
			//AudioInputStream ais = AudioSystem.getAudioInputStream(url);
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File(soundLocation));
			this.clip = AudioSystem.getClip();
			clip.open(ais);
		}
		
		catch(Exception e){
			
		}
	}
	
	public void play(){
		
		clip.start();
	}
	
	public void loop(){
		
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public void stop(){
		
		clip.stop();
	}
}