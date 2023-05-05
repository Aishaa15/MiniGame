import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.Graphics;


public class GameMenu extends JFrame
{
    
    public static void main(String[] args)
    {
        Themain();
    }
        
    public static void Themain()
    {
        //create main frame
        JFrame screen = new JFrame("Illusion Lane Menu");
        screen.setSize(3000, 3000);
    
       
        //set background 
        Container cp = screen.getContentPane();
        cp.setBackground(new Color(61,85,12));

        //add image 
        ImageIcon image = new ImageIcon("IMAGE.jpg");
        JLabel label_image = new JLabel(image);
        label_image.setBounds(550,10,600,500);
        screen.add(label_image);


        JButton Exit = new JButton("Exit");
        Exit.setBounds(700, 700, 300, 50);
        screen.add(Exit);
        Exit.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent e)
            {
                screen.dispose();
            }
        });


        JButton play_game = new JButton("Play game");
        play_game.setBounds(700, 500, 300, 50);
        screen.add(play_game);
        play_game.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                screen.dispose();
                play_screen();
            
            }
        });

      
        JButton instructions = new JButton("Instructions");
        instructions.setBounds(700, 600, 300, 50);
        screen.add(instructions);
        instructions.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                screen.dispose();
                instruction_screen();
            }
        });


        screen.setLayout(null);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setResizable(false);
        screen.setVisible(true);
        
    }
    
    public static void instruction_screen()
    {
        JFrame instr = new JFrame("Instructions");
        instr.setSize(3000,3000);

        JButton goBack = new JButton("Go back");
        goBack.setBounds(30,50,150,20);
        instr.add(goBack);
        goBack.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                instr.dispose();
                Themain();
            }
        });

        JLabel instructions = new JLabel("OBJECTIVE OF GAME: use the keys on your keyboard to get your character to the end of the maze ");
        instructions.setBounds(75, 100, 500, 50);
        instructions.setFont(new Font ("Serif", Font.PLAIN, 50));
        instr.add(instructions);

        instr.setLayout(null);
        instr.setResizable(false);
        instr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instr.setVisible(true);
    }
    
    //window to game
    public static void play_screen()
    {
        JFrame play = new JFrame("Game");
        play.setSize(3000,3000);

        play.setLayout(null);
        play.setResizable(false);
        play.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        play.setVisible(true);
    }
}
