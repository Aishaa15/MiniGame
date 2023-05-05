import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;


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
         ImageIcon image = new ImageIcon("Image.jpg");
         JLabel label_image = new JLabel(image);
         label_image.setBounds(550,10,600,500);
         screen.add(label_image);

        JButton play_game = new JButton("Play game");
        play_game.setBounds(700, 500, 300, 50);
        screen.add(play_game);
        play_game.addActionListener(new ActionListener()

        {
            public void actionPerformed(ActionEvent e)
            {
                screen.dispose();
            
            }
        });

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

        screen.setLayout(null);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setResizable(false);
        screen.setVisible(true);

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
    }
    
    public static void instruction_screen()
    {
        JFrame instr = new JFrame("Instructions");
        instr.setSize(400,400);

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

        JLabel instructions = new JLabel("Instructions");
        instructions.setBounds(75, 100, 300, 50);
        instr.add(instructions);

         

        instr.setLayout(null);
        instr.setResizable(false);
        instr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instr.setVisible(true);
    }
}
