import java.awt.Color;
import java.awt.Graphics;


    int[][]lab=new int[13][23];
    int row=0;
    int col=0;
    int rownumber=13;
    int colnumber=23;
    int blockwidth=40;
    int blockheight=40;
    
    
    public void paint(Graphics mazegrphics){
        int [][]maze=getMaze();
        
        for(row=0;row<rownumber;row++){
            for(col=0;col<colnumber;col++){
                if(maze[row][col]==1){
                    if(Game.getLevel()==1){
                    mazegrphics.setColor(Color.LIGHT_GRAY);

                    }
                    if(Game.getLevel()==2){
                    mazegrphics.setColor(Color.YELLOW);
                    }
                    if(Game.getLevel()>=3){
                    mazegrphics.setColor(Color.RED);
                    }

                    mazegrphics.fillRect(col*40,row*40,blockwidth,blockheight);
                    mazegrphics.setColor(Color.black);
                    mazegrphics.drawRect(col*40,row*40,blockwidth,blockheight);
                }
            }
        }
        mazegrphics.drawString("Start", 5, 62);
        mazegrphics.drawString("End", 850, 462);
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
