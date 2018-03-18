import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class GameHandler{

		private GameFrame frame;
		private GameThread thread;

		private ArrayList<Vector2> vectors = new ArrayList<Vector2>();

		public GameHandler(){
			frame = new GameFrame(this);
			((Thread)(thread = new GameThread(this))).start();

      for(int i = 0;i<50;i++){
        for(int j = 0; j<50; j++){
          vectors.add(new Vector2(i,j));
        }
      }
		}

		public void update(){
      PointerInfo a = MouseInfo.getPointerInfo();
      Point b = a.getLocation();
      int mouseX = (int) (b.getX()/50);
      int mouseY = (int) (b.getY()/50);
      //physics!

      for(Vector2 v : vectors){
        double slope = (v.getY()-mouseY)/(v.getX()-mouseX);
        double angle = Math.toDegrees(Math.atan(slope));
        v.setAngle(angle);
      }
			//Paint canvas
			getGameFrame().getGamePanel().repaint();
		}

		public GameFrame getGameFrame(){
			return frame;
		}

		public GameThread getGameThread(){
			return thread;
		}
    public ArrayList<Vector2> getVectors(){
      return vectors;
    }


	}
