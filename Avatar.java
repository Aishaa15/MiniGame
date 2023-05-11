import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;




public class Avatar {
    Maze lab=new Maze();
    int x=40;
    int y=40;
    int width=40;
    int height=40;
    int movement=40;
        
    
    public void paint(Graphics graphic){
        graphic.setColor(Color.pink);
        graphic.fillRect(x, y, width, height);
        graphic.setColor(Color.white);
        graphic.drawRect(x, y, width, height);
        
        
        graphic.setColor(Color.white);
        graphic.fillOval(x+16,y+3,8,8);
        graphic.setColor(Color.white);
        
        
        graphic.fillRect(x+9,y+12,4,14);
        graphic.fillRect(x+11,y+12,4,4);
        graphic.fillRect(x+28,y+12,4,14);
        graphic.fillRect(x+26,y+12,4,4);
        graphic.fillRect(x+14,y+12,13,14);
       
        
        graphic.fillRect(x+14,y+24,6,14);
        graphic.fillRect(x+21,y+24,6,14);
    }
    
    
    
    public void keyPressed(KeyEvent event)
    {
        int[][]maze=lab.getMaze();
        
        if(event.getKeyCode()==37)
        {
            if(maze[y/40][(x/40)-1] !=1){
                x=x-movement;
            }
        }
        if(event.getKeyCode()==39)
        {
            if(maze[y/40][(x/40)+1]!=1){
                x=x+movement;
            }
        }
        if(event.getKeyCode()==40)
        {
            if(maze[(y/40)+1][x/40]!=1){
                y=y+movement;
            }
        }
        if(event.getKeyCode()==38)
        {
            if(maze[(y/40)-1][x/40]!=1){
                y=y-movement;
            }
        }
        
       
        if(x==840 && y==440)
        {
            Game.changeLevel();
            x=40;
            y=40;
        }
    }
}   