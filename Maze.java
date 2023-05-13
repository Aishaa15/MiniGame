
import java.awt.Color;
import java.awt.Graphics;

public class Maze {
    int[][] lab = new int[13][23];  // 2D array representing the maze
    int row = 0;  // Current row index
    int col = 0;  // Current column index
    int rownumber = 13;  // Total number of rows in the maze
    int colnumber = 23;  // Total number of columns in the maze
    int blockwidth = 40;  // Width of each maze block
    int blockheight = 40;  // Height of each maze block
    
    
    public void paint(Graphics maze_graphics) {
        int[][] maze = getMaze();

        for (row = 0; row < rownumber; row++) {
            for (col = 0; col < colnumber; col++) {
                if (maze[row][col] == 1) {
                    // Set the color based on the game level
                    if (Game.getLevel() == 1) {
                        maze_graphics.setColor(Color.LIGHT_GRAY);
                    } else if (Game.getLevel() == 2) {
                        maze_graphics.setColor(Color.YELLOW);
                    } else if (Game.getLevel() >= 3) {
                        maze_graphics.setColor(Color.RED);
                    }

                    // Draw the filled rectangle
                    maze_graphics.fillRect(col * 40, row * 40, blockwidth, blockheight);
                    maze_graphics.setColor(Color.black);
                    // Draw the rectangle outline
                    maze_graphics.drawRect(col * 40, row * 40, blockwidth, blockheight);
                }
            }
        }
        // Draw the labels for start and end points
        maze_graphics.drawString("Start", 5, 62);
        maze_graphics.drawString("End", 850, 462);
    }


        public int [][] getMaze(){
        if(Game.getLevel()==1){
    
            //Level 1
            int maze[][]=
            {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            { 1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1},
            { 1,1,0,1,1,0,0,0,0,0,0,0,1,1,1,0,1,1,1,1,0,1,1},
            { 1,1,0,0,1,0,1,0,1,1,1,0,0,0,1,0,1,0,0,1,0,1,1},
            { 1,1,1,0,1,0,1,0,1,1,0,0,1,0,0,0,1,1,0,1,0,1,1},
            { 1,1,0,0,1,0,0,0,1,1,1,0,1,0,1,0,0,0,0,1,0,1,1},
            { 1,1,0,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1,1,1},
            { 1,1,0,1,0,0,0,0,1,0,0,0,1,0,0,1,1,1,0,1,1,1,1},
            { 1,1,0,1,0,1,1,1,1,0,1,1,1,1,0,1,1,1,0,1,1,1,1},
            { 1,1,0,1,0,0,0,0,1,0,0,0,0,0,0,1,1,1,0,1,0,1,1},
            { 1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,1,1},
            { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,1},
            { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};

            lab=maze;
        }
        
        if(Game.getLevel()==2){
            
            //Level 2
            int maze[][]=
            {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            { 1,0,0,0,1,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1,1},
            { 1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,0,1,1},
            { 1,1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,1},
            { 1,1,0,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1},
            { 1,1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,1},
            { 1,1,1,0,1,0,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,1},
            { 1,1,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,1},
            { 1,1,0,1,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,0,1,1},
            { 1,1,0,1,0,0,0,0,1,0,1,0,0,1,0,0,0,0,1,1,0,1,1},
            { 1,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,0,1,1},
            { 1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
            
            lab=maze;
        }

        if(Game.getLevel()==3){
            
            //Level 3
            int maze [][]=
            {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            { 1,0,0,0,1,0,0,0,0,0,0,1,1,1,0,0,1,1,3,0,0,1,1},
            { 1,1,1,0,1,0,1,0,1,1,1,0,0,0,1,0,0,0,1,1,0,1,1},
            { 1,1,0,0,0,0,1,0,0,1,0,0,1,0,1,0,1,0,0,1,0,1,1},
            { 1,1,0,1,1,1,1,0,1,0,0,1,1,0,1,0,0,1,0,1,0,1,1},
            { 1,1,0,0,0,0,1,0,0,0,1,1,1,0,1,0,1,0,0,1,0,1,1},
            { 1,1,1,0,1,0,1,1,1,1,0,0,0,0,1,0,0,1,0,1,0,1,1},
            { 1,1,0,0,0,1,0,0,0,1,0,1,1,1,0,0,1,0,0,1,0,1,1},
            { 1,1,0,1,1,0,0,1,0,1,0,0,0,0,0,1,0,0,1,1,0,1,1},
            { 1,1,0,1,0,0,1,1,0,1,0,1,1,1,1,0,0,1,0,0,0,1,1},
            { 1,1,0,0,0,1,1,1,0,1,0,0,0,0,0,1,0,0,0,1,0,1,1},
            { 1,1,0,1,0,0,0,1,0,0,0,1,1,1,1,0,0,1,0,1,0,0,1},
            { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
            
            lab=maze;
        }

    
        
        return lab;
        
    }
}