import java.awt.Color;
import java.awt.Graphics;

public class rocketship extends gameobject 
{ 
	
	rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	static void draw(Graphics g)
	{
		 g.setColor(Color.BLUE);
	        g.fillRect(x, y, width, height);
	}
	
	void update()
	{
		
	}
} 
