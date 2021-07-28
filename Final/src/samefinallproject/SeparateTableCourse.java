/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samefinallproject;

import javax.swing.table.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SeparateTableCourse extends JFrame {
    public SeparateTableCourse(String courName) {
    super();
   
    DefaultTableModel dtm = new DefaultTableModel() {
       public boolean isCellEditable(int row, int column)
       {
          return false;
       }
    };
  
    ArrayList<Cell> cell =new ArrayList();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=TimeTable;integratedSecurity=true";
            Connection con = DriverManager.getConnection(url);
            if(con.isValid(100))
            {

                String sql = "select * from cell";
                PreparedStatement pstw = con.prepareStatement(sql);
                ResultSet rs = pstw.executeQuery();

                while(rs.next())
                {
                    Cell c = new Cell() ;
                    c.setTeacherId(rs.getString(1));
                    c.setRoomName(rs.getString(2));
                    c.setCourseName(rs.getString(3));
                    cell.add(c);
                }

            }

            con.close();
        }
        
        catch(ClassNotFoundException e){

            JOptionPane.showMessageDialog(null, e);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        String col [] = { " ","8-10","10-12","12-2","2-4","4-6","6-8"};
        int k = 0;
        Object data[][] = {{ "saturday ",cell.get(k).getCourseName()+"\n"+cell.get(k).getRoomname(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId()},
                           { "Sunday ",cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId()},
                           { "Monday ",cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId()},
                           { "Tuesday ",cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId()},                           
                           { "Wednesday ",cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname() ,cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId()},
                           { "Thursday ",cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId(),cell.get(++k).getCourseName()+"\n"+cell.get(k).getRoomname()+"\n"+cell.get(k).getTeacherId()}} ;
        
        dtm.setDataVector(data, col);
        
    JTable table = new JTable(dtm);
    table.getColumn("8-10").setCellRenderer(new TextAreaRenderer());
    table.getColumn("10-12").setCellRenderer(new TextAreaRenderer());
    table.getColumn("12-2").setCellRenderer(new TextAreaRenderer());
    table.getColumn("2-4").setCellRenderer(new TextAreaRenderer());
    table.getColumn("4-6").setCellRenderer(new TextAreaRenderer());
    table.getColumn("6-8").setCellRenderer(new TextAreaRenderer());


    int l=0 ;
     for(int i=0 ; i< TimeTable.DaysPerWeek ;i++)
        {
            for(int j=1 ; j< TimeTable.HoursPerDay+1 ;j++)
            {
         if(cell.get(l).getCourseName().equals(courName))
                        dtm.setValueAt(cell.get(l).getRoomname()+"\n"+cell.get(l).getTeacherId(),i,j);
        else
            dtm.setValueAt(" ", i, j);
        l++;
    }
        }
     
    int cellCounter = 0;
    int takencell = 36 ;
    for(int i=0 ; i< TimeTable.DaysPerWeek ;i++)
        {
            for(int j=1 ; j< TimeTable.HoursPerDay+1 ;j++)
            {
               
                if(takencell>=cell.size())
                    break;
                if(cell.get(cellCounter).getRoomname().equals(cell.get(takencell).getRoomname())||cell.get(cellCounter).getTeacherId().equals(cell.get(takencell).getTeacherId()))
                {
                    if(cell.get(takencell).getCourseName().equals(courName))
                        dtm.setValueAt(cell.get(takencell).getRoomname()+"\n"+cell.get(takencell).getTeacherId(),i,j);
                    else
                        dtm.setValueAt(" ", i, j);
                    
                        
                }   
                else 
                    if(cell.get(cellCounter).getCourseName().equals(courName))
                        dtm.setValueAt(cell.get(cellCounter).getRoomname()+"\n"+cell.get(cellCounter).getTeacherId(),i,j);
                    else
                        dtm.setValueAt(" ", i, j);
                cellCounter++;
                takencell++;
                
            }
        }
  
    table.setRowHeight(90);
    JScrollPane scroll = new JScrollPane(table);
    getContentPane().add(scroll);
  
    setSize( 400, 250 );
    setVisible(true);
  }
}
