import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import javax.swing.*;
public class GamePanel extends JPanel {
    Image imgh;
    int FPS=60;
    Random rn=new Random();
    
    int x=rn.nextInt(500),y=rn.nextInt(400);
    int directionX = 1;
    int directionY = 1;
    int speed = 1;
    long targetTimeInMilli=1000/FPS;
    long waitTime;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(x,y ,100,100);
        // imgh=ImageIO.read("./dvd.png");
        if (x>=400) {
            setBackground(Color.blue);
        } else if (x <=0) {
            setBackground(Color.RED);
            
        }
        if(y>=360){
            setBackground(Color.CYAN);
        }
        else if(y<=0){
            setBackground(Color.PINK);
        }
        
        
    }
    public void gameLoop() throws InterruptedException{
        while (true) { 
            long startTime=System.nanoTime();
            update();
            x = x + (speed * directionX);
            y = y + (speed * directionY);
            repaint();
            //all your code for game
            long endTime=System.nanoTime();
            long diff=endTime-startTime;
            waitTime=targetTimeInMilli-diff/1000000;
            Thread.sleep(waitTime);
        }
    }
    public void update() {
        if (x>=400) {
            directionX = -1;
        } else if (x <=0) {
            directionX = rn.nextInt(5);
            
        }
        if(y>=360){
            directionY=-1;
        }
        else if(y<=0){
            directionY=rn.nextInt(5);
        }
        


    }
    
}
