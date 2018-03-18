import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public  class GameFrame extends JFrame{

  private GameHandler handler;
  private GamePanel panel;


  public GameFrame(GameHandler handler){
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(1000, 1000);
    this.add((panel = new GamePanel(handler)));
    this.setVisible(true);
    this.handler = handler;
  }

  public GamePanel getGamePanel(){
    return panel;
  }

}
