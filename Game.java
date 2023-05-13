import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game extends JPanel{
    Maze maze=new Maze();
    Avatar avatar=new Avatar();
    public static int level=1;
    
    public  Game(){
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
                avatar.key_presses(e);
            }
        
             @Override
            public void keyReleased(KeyEvent e) {
            
            }
        
    });
        setFocusable(true);
    }
    
    public void paint(Graphics mazegrphics){
        maze.paint(mazegrphics);
        avatar.paint(mazegrphics);
    }
  
    public static int changeLevel(){
        return level++;
    }
    

    public static int getLevel(){
        return level;
    }
    

    public static void main(String[]args){
	   JOptionPane.showMessageDialog(null, "A girl named lucy went to the maze of mirrors with her friends.\n However, she accidently wanders off by herself.\n As she walks through the maze, she can't find any way out.\n Lucy accidently teleports herself into a new dimension.");
       JOptionPane.showMessageDialog(null, "Can you help Lucy flee the alternate dimension by getting\n her through a series of mazes?");
	   JOptionPane.showMessageDialog(null, "Use the arrowkeys on your keyboard to get her to the end of the maze!");
       JFrame myWindow=new JFrame("ILLUSION LANE");
       Game game =new Game();
       myWindow.add(game);
       myWindow.setSize(920,540);
       myWindow.setLocation(300,200);
       myWindow.setVisible(true);
       myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
       
       while (true){
           try {
               Thread.sleep(10);
        } catch (InterruptedException ex) {
             Logger.getLogger(Game.class.getName()).log(Level.SEVERE, "you lose");
        }
        myWindow.repaint();   
        


        if(getLevel()>3){
            JOptionPane.showMessageDialog(null, "Congratulations! You helped Lucy get out of the mazes.\n Now she can go back to hanging out with her friends.");
            System.exit(0);
            }
        }
    }
}
