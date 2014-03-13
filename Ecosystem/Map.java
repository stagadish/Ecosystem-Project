package Ecosystem;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author MW
 * @author GD
 * @version 3.12.14
 */
public class Map {
    private int gridWidth = 0;
    private int gridHeight = 0;
    
    /**
    * Default constructor for the 12x12 Map Grid
    */
    public Map(){
        gridWidth = 12;
        gridHeight = 12;
    }
    
    /**
    * Custom size Map Grid Constructor
    *@param x is the user defined width
    * @param y is the user defined height
    */
    public Map(int x, int y){
        gridWidth = x;
        gridHeight = y;
    }
    
    public void generateGrid(){
        HashMap<Point,ArrayList<Organism>> coordinateMap = new HashMap<>();
        ArrayList<Organism> organisms = new ArrayList<>();
        
        for(int i = 0; i < gridWidth; i++) {
            for(int j = 0; j < gridHeight; j++) {
                Point p = new Point(i,j);
                coordinateMap.put(p, new ArrayList<Organism>());
                
                Double tempX = p.getX();
                Double tempY = p.getY();
                System.out.print(tempX.intValue() +","+ tempY.intValue() +" -"+
                    coordinateMap.get(p).size()+ "\t\t");

            }
            System.out.println();

        }
    }
}
