import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public  class GamePanel extends JPanel{

		private GameHandler handler;


		public GamePanel(GameHandler handler){
			this.handler = handler;
		}


		@Override
		public void paintComponent(Graphics g){
			Graphics2D g2d = (Graphics2D) g;
			PointerInfo a = MouseInfo.getPointerInfo();
      Point b = a.getLocation();
      int mouseX = (int) (b.getX());
      int mouseY = (int) (b.getY());
			//clear
			g2d.setColor(Color.BLACK);
			g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
			double scale = 50;
			//render each vector
			for(int i = 0; i < handler.getVectors().size(); i++){
				Vector2 vector = handler.getVectors().get(i);
				scale = vector.dist(new Vector2(mouseX,mouseY),vector);
				scale/=10;
				g2d.setColor(Color.RED);
				int x2 = (int)(scale*Math.cos(Math.toRadians(vector.getAngle()))+vector.getX());
				int y2 = (int)(scale*Math.sin(Math.toRadians(vector.getAngle()))+vector.getY());
				g2d.drawLine((int)(vector.getX()),(int)(vector.getY()),x2,y2);
			}
		}

	}
