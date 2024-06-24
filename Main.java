
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JFrame f=new JFrame("DVD");

        GamePanel gp=new GamePanel();
        f.add(gp);
        f.setSize(500,500);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        ///
        gp.gameLoop();//always at last
    }
   
    

}