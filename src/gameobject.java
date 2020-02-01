
public class gameobject {
	
	

	 static int x;
	 static int y;
	 static int width;
	 static int height;
	 int speed = 0;
	 boolean isActive = true;
	
	 gameobject object = new gameobject(x, y, width, height);
	 
	 gameobject(int x, int y, int width, int height)
	 {
		 gameobject.x = x;
		 gameobject.y = y;
		 gameobject.width = width;
		 gameobject.height = height;
		 
	 }
	

}
	