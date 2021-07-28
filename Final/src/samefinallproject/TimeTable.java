package samefinallproject;

import java.util.ArrayList;

public class TimeTable {
    
    static ArrayList<Cell> cell;
    static final int DaysPerWeek = 6 ;
    static final int HoursPerDay = 6 ;

    public TimeTable() {
        cell = new ArrayList() ;
    }
    
    public void input()
    {
        
    }
    public static void addCell(Cell c)
    {
        cell.add(c) ;
    }

    public static ArrayList<Cell> getCell() {
        return cell;
    }
   
   
    
}
