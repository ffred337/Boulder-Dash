package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class ClavierListener implements KeyListener{

	private BoulderDashView view;
	private int Enter = KeyEvent.VK_ENTER;
	
	
	
	public ClavierListener(BoulderDashView view){
		
		this.view = view;
	}

	@Override
	public void keyTyped(KeyEvent e){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e){
		// TODO Auto-generated method stub
		
		int keyCode = e.getKeyCode();
		
		if(this.view.getState() == ViewState.UN && keyCode == Enter){
			
			this.view.levelSelection();
		}
		
		if(keyCode == KeyEvent.VK_NUMPAD1){
			
			this.view.levelSelected("-> map 1 selected");
		}
		
		if(keyCode == KeyEvent.VK_NUMPAD2){
			
			this.view.levelSelected("-> map 2 selected");
		}
		
		if(keyCode == KeyEvent.VK_NUMPAD3){
			
			this.view.levelSelected("-> map 3 selected");
		}
		
		if(keyCode == KeyEvent.VK_NUMPAD4){
			
			this.view.levelSelected("-> map 4 selected");
		}
		
		if(keyCode == KeyEvent.VK_NUMPAD5){
			
			this.view.levelSelected("-> map 5 selected");
		}
		
		if(this.view.getState() == ViewState.TROIS && keyCode == Enter){
			
			this.view.tutorial();
		}
	}

	@Override
	public void keyReleased(KeyEvent e){
		// TODO Auto-generated method stub
		
	}
}