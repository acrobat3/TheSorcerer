import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Map implements Entity{
	
	private float x;
	private float y;
	private Image background;
	private Image topbottomwall;
	private Image leftrightwall;
	
	public Map(float x, float y) throws SlickException {
		background = new Image("res/background.png");
		topbottomwall = new Image("res/top and bottom wall.png");
		leftrightwall = new Image("res/left and right wall.png");
	    this.setXY(x,y); 
	    
	  }
	
	public float getX() {
	    return x;
	  }
	
	 
    public float getY() {
	    return y;
	  }
	  
	protected void setXY(float x, float y) {
	    this.x = x;
	    this.y = y;
	  }

	 public void draw(){
		background.draw(x,y);
		topbottomwall.draw(x,y);
		topbottomwall.draw(x,y+460);
		leftrightwall.draw(x,y);
		leftrightwall.draw(x+620,y);
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
	}

	
}