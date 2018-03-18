import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public  class Vector2{

		private double x;
		private double y;
    private double angle;

		public Vector2(double x, double y){
			this.x = x;
			this.y = y;
      this.angle = 0.0;

		}
    //getters and setters
		public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}

    public double getAngle(){
      return angle;
    }

    public void setAngle(double angle){
      this.angle = angle;
    }
		public Vector2 add(Vector2 v2){
			return new Vector2(x + v2.x, y + v2.y);
		}

		public Vector2 mult(double d){
			return new Vector2(x * d, y * d);
		}

		public static double dist(Vector2 v1, Vector2 v2){
			return Math.sqrt(Math.pow((v2.x - v1.x), 2) + Math.pow((v2.y - v1.y), 2));
		}

		@Override
		public String toString(){
			return "X: " + x + " Y: " + y;
		}

	}
