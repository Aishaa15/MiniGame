import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;


public class Avatar {
    Maze lab=new Maze();
    int x=40;
    int y=40;
    int width=40;
    int height=40;
    int movement=40;
        

    public void paint(Graphics main_graphics){
        main_graphics.setColor(Color.BLACK);
        main_graphics.setColor(Color.black);
        main_graphics.fillOval(x+16,y+3,20,20);
        main_graphics.setColor(Color.black);
    }
    
    public void key_presses(KeyEvent event){
        int[][]maze=lab.getMaze();
        
        if(event.getKeyCode()==37){
            if(maze[y/40][(x/40)-1] !=1){
                x=x-movement;
            }
        }
        if(event.getKeyCode()==39){
            if(maze[y/40][(x/40)+1]!=1){
                x=x+movement;
            }
        }
        if(event.getKeyCode()==40){
            if(maze[(y/40)+1][x/40]!=1){
                y=y+movement;
            }
        }
        if(event.getKeyCode()==38){
            if(maze[(y/40)-1][x/40]!=1){
                y=y-movement;
            }
        }
        
        if(Game.getLevel()==1){
            if(x==840 && y==440){
            Game.changeLevel();
            JOptionPane.showMessageDialog(null, "END OF LEVEL 1");
            x=40;
            y=40;
        }
      }

      if(Game.getLevel()==2){
            if(x==840 && y==440){
            Game.changeLevel();
            JOptionPane.showMessageDialog(null, "END OF LEVEL 2");
            x=40;
            y=40;
        }
      }

       if(Game.getLevel()==3){
            if(x==840 && y==440){
            Game.changeLevel();
            x=40;
            y=40;
        }
      }
    }
}   
