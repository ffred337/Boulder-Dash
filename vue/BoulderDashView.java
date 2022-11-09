package view;

import contract.IView;



public class BoulderDashView implements IView{

	private ViewFrame viewFrame;
	private final ClavierListener clavier;
	private int frameWidth = 1440;
	private int frameHeight = 768;
	private String frameTitle = "BOULDER DASH";
	private ViewState state;
	
	
	
	
	public BoulderDashView(){
		
		this.viewFrame = new ViewFrame(frameWidth, frameHeight, frameTitle);
		this.clavier = new ClavierListener(this);
		this.viewFrame.addKeyListener(clavier);
		this.state = ViewState.UN;
	}
	
	public void startMenu(){
		
		this.viewFrame.setStartMenu();
		this.setState(ViewState.DEUX);
	}
	
	public void levelSelection(){
		
		this.viewFrame.setLevelSelection();
		this.setState(ViewState.DEUX);
	}
	
	public void levelSelected(String mapSelected){
		
		this.viewFrame.setLevelSelected(mapSelected);
		this.setState(ViewState.TROIS);
	}
	
	public void tutorial(){
		
		this.getViewFrame().setTutorial();
		this.setState(ViewState.QUATRE);
	}

	public int getFrameWidth(){
		
		return frameWidth;
	}

	public void setFrameWidth(int frameWidth){
		
		this.frameWidth = frameWidth;
	}

	public int getFrameHeight(){
		
		return frameHeight;
	}

	public void setFrameHeight(int frameHeight){
		
		this.frameHeight = frameHeight;
	}

	public String getFrameTitle(){
		
		return frameTitle;
	}

	public void setFrameTitle(String frameTitle){
		
		this.frameTitle = frameTitle;
	}

	public ViewFrame getViewFrame(){
		
		return viewFrame;
	}

	public void setViewFrame(ViewFrame viewFrame){
		
		this.viewFrame = viewFrame;
	}

	public ViewState getState(){
		
		return state;
	}

	public void setState(ViewState state){
		
		this.state = state;
	}
}