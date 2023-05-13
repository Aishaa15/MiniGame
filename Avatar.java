import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;




public class Avatar 
{
    // Creating a Maze object
    Maze lab=new Maze();

    // Avatar position and size variables
    int x=40;
    int y=40;
    int width=40;
    int height=40;
    int movement=40;
        
  
    
// Method to paint the avatar on the screen
public void paint(Graphics graphic) 
{
    // Setting the color for the avatar body
    graphic.setColor(Color.pink);
    // Drawing a filled rectangle to represent the avatar
    graphic.fillRect(x, y, width, height);
    // Setting the color for the avatar outline
    graphic.setColor(Color.white);
    // Drawing a rectangle to outline the avatar
    graphic.drawRect(x, y, width, height);

    // Setting the color for the avatar eyes
    graphic.setColor(Color.white);
    // Drawing the avatar's eyes as ovals
    graphic.fillOval(x + 16, y + 3, 8, 8);
    graphic.setColor(Color.white);

    // Drawing the avatar's arms and shoulders
    graphic.fillRect(x + 9, y + 12, 4, 14);
    graphic.fillRect(x + 11, y + 12, 4, 4);
    graphic.fillRect(x + 28, y + 12, 4, 14);
    graphic.fillRect(x + 26, y + 12, 4, 4);
    graphic.fillRect(x + 14, y + 12, 13, 14);

    // Drawing the avatar's legs
    graphic.fillRect(x + 14, y + 24, 6, 14);
    graphic.fillRect(x + 21, y + 24, 6, 14);
}

// Method to handle key press events
public void keyPressed(KeyEvent event) 
{
    // Getting the maze array from the Maze object
    int[][] maze = lab.getMaze();

    // Moving the avatar based on the key pressed
    if (event.getKeyCode() == 37) { // Left arrow key
        if (maze[y / 40][(x / 40) - 1] != 1) {
            x = x - movement;
        }
    }
    if (event.getKeyCode() == 39) { // Right arrow key
        if (maze[y / 40][(x / 40) + 1] != 1) {
            x = x + movement;
        }
    }
    if (event.getKeyCode() == 40) { // Down arrow key
        if (maze[(y / 40) + 1][x / 40] != 1) {
            y = y + movement;
        }
    }
    if (event.getKeyCode() == 38) { // Up arrow key
        if (maze[(y / 40) - 1][x / 40] != 1) {
            y = y - movement;
        }
    }

    // Checking if the avatar reached a specific position to change the level
    if (x == 840 && y == 440) {
        Game.changeLevel();
        x = 40;
        y = 40;
    }
}   

}