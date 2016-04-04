import java.awt.Robot;
import java.awt.Point;
import java.awt.MouseInfo;
import java.awt.AWTException;
import java.awt.Toolkit;
import java.lang.Math;

class AprilFools{
   public static void main(String[] args) throws AWTException{
      Robot r = new Robot();
      int x, y, newX, newY;
      while (true){
         Point p = MouseInfo.getPointerInfo().getLocation();
         x = (int) p.getX();
         y = (int) p.getY();
         newX = getNewX(x);
         newY = getNewY(y);
         r.mouseMove(newX, newY);
         try{
            Thread.sleep(2000);
         } 
         catch (InterruptedException e) {
            Thread.currentThread().interrupt();
         }
      }
   }
   public static int getNewX(int xPos){
      int temp = xPos + ((int) (301 * Math.random())) - 150;
      if (temp > (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth()){
         return (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
      } 
      else if (temp < 0){
         return 0;
      } 
      else {
         return temp;
      }
   }
   public static int getNewY(int yPos){
      int temp = yPos + ((int) (301 * Math.random())) - 150;
      if (temp > (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()){
         return (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
      } 
      else if (temp < 0){
         return 0;
      } 
      else {
         return temp;
      }
   }
}
