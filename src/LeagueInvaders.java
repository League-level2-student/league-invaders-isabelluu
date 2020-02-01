import javax.swing.JFrame;

public class LeagueInvaders {
		
		 JFrame frame;
		 public static final int WIDTH = 500;
		 public static final int HEIGHT = 800;
		 gamepanel panel = new gamepanel();
		
		
		public void setup()
		{
			JFrame frame = new JFrame();
			frame.add(panel);
			frame.setSize(WIDTH, HEIGHT);
			frame.show(true);
			frame.addKeyListener(panel);
		
			
		}
		

	}

	