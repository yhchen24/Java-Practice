// You-Hsin Chen
// 01/26/2020
// CSE142
// TA: Ana Jojic
// Assignment #3
//
// This program will produce a face.
import java.awt.*;
public class Doodle {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(500, 500);
      panel.setBackground(Color.LIGHT_GRAY);
      Graphics brush = panel.getGraphics();
      circle(brush, 100, 100, 300);
      square(brush, 155, 180, 50);
      square(brush, 295, 180, 50);
      triangleFrame(brush, 250, 280, 60);
   }
   
   // draw circle
   public static void circle(Graphics brush, int x, int y, int size) {
      brush.setColor(Color.BLUE);
      brush.fillOval(x, y, size, size);
   }
   
   // draw square
   public static void square(Graphics brush, int x, int y, int size) {
      brush.setColor(Color.RED);
      brush.fillRect(x, y, size, size);
   }
   
   // draw triangle
   public static void triangleFrame(Graphics brush, int x, int y, int size) {
      brush.setColor(Color.GREEN);
      brush.drawLine(x, y, x - size / 2, y + size);
      brush.drawLine(x - size / 2, y + size, x + size / 2, y + size);
      brush.drawLine( x + size / 2, y + size, x, y);
   }
}