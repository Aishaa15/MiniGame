
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * The Game panel inherits attributes and methods from the main class (or base class) "JPanel". 
 * However, since "Game" is a subclass, it can add its own fields and methods, 
 * which is a fundamental pillar of Object-Oriented Programming.
 */
public class Game extends JPanel {
    Maze maze = new Maze();
    Avatar avatar = new Avatar();
    public static int level = 1;

    public Game() {
        // Add a key listener to the game panel
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                // Add a key listener to the game panel
                avatar.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

        });
        setFocusable(true);
    }

    public void paint(Graphics graphic) {
        // Call the paint method of the maze object
        maze.paint(graphic);
        
        // Call the paint method of the avatar object
        avatar.paint(graphic);
    }

    public static int changeLevel() {
        return level++;
    }

    public static int getLevel() {
        return level;
    }

    public static void main(String[] args) {
        // Display introductory messages
        JOptionPane.showMessageDialog(null, "Years ago, a scientist created a new animal and called it 'ernudo'.\nBut a fiercy fire destroyed his lab.\nNowadays, a great explorer called 'Martino', has decided to get in the ruins\nof that old lab, to proof that animal exists indeed, but he danger lies on...");
        JOptionPane.showMessageDialog(null, "Will he survive? Ready to help him get out the maze?");
        JOptionPane.showMessageDialog(null, "Remember, get out the maze before the monsters catch you!");

        // Create the game window
        JFrame myWindow = new JFrame("AVATAR RUN ∫_☻");
        Game game = new Game();
        myWindow.add(game);
        myWindow.setSize(920, 540);
        myWindow.setLocation(300, 200);
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                // Log an error message if sleep is interrupted
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, "you lose");
            }
            myWindow.repaint();

            if (getLevel() > 3) {
                // Display a message when the player completes all levels
                JOptionPane.showMessageDialog(null, "you did it! see you soon.");
                System.exit(0);
            }
        }
    }
}