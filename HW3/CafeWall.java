// You-Hsin Chen
// 01/26/2020
// CSE142
// TA: Ana Jojic
// Assignment #3
//
// This program will produce cafe wall figure.
import java.awt.*;

public class CafeWall {
   public static final int MORTAR = 2;
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(650, 400);
      panel.setBackground(Color.GRAY);
      Graphics pen = panel.getGraphics();
      singleRow(pen, 0, 0, 4, 20);
      singleRow(pen, 50, 70, 5, 30);
      grid(pen, 400, 20, 2, 35, 35);
      grid(pen, 10, 150, 4, 25, 0);
      grid(pen, 250, 200, 3, 25, 10);
      grid(pen, 425, 180, 5, 20, 10);
   }
   
   // draw a single row which consists of pairs of black and white boxes.
   public static void singleRow(Graphics brush, int x, int y, int pairs, int size) {
      for (int i = 0; i < pairs; i++) {
         brush.setColor(Color.BLACK);
         brush.fillRect(x + 2 * i * size, y, size, size);
         brush.setColor(Color.BLUE);
         brush.drawLine(x + 2 * i * size, y, x + (2 * i + 1) * size, y + size);
         brush.drawLine(x + 2 * i * size, y + size, x + (2 * i + 1) * size, y);
         brush.setColor(Color.WHITE);
         brush.fillRect(x + ( 2 * i + 1) * size, y, size, size);
      }
   }
   
   // draw a grid.
   public static void grid(Graphics brush, int x, int y, int pairs, int size, int offset) {
      for (int i = 0; i < pairs; i++) {
         singleRow(brush, x, y + 2 * i * (size + MORTAR), pairs, size);
         singleRow(brush, x + offset, y + (2 * i + 1) * (size + MORTAR), pairs, size);
      }
   }
}