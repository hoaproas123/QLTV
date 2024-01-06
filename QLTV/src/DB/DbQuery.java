/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DbQuery{
    String url="jdbc:sqlserver://"+InitDB.serverName+":1433;databaseName="+InitDB.databaseName+";user="+InitDB.username+";password="+InitDB.password;
    Connection conn;
    public DbQuery (){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection(url);
       }catch (ClassNotFoundException ex){
            Logger.getLogger(DbQuery.class.getName()).log(Level.SEVERE,null,ex);
        }catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Không thể kết nối, kiểm tra lại địa chỉ URL","Thông báo",0);
        }
    }
    
    
    public ResultSet ExcuQuery_GetTable(String from,String where,String orderby){
        try{
            Statement stat=conn.createStatement();
            ResultSet rs=stat.executeQuery("select *"+
                                            " from "+from+
                                            " where "+where+
                                            " order by "+orderby);
            return rs;
        }catch(SQLException ex){
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,null,ex);
        }
        return null;
    }
    
    public ResultSet ExcuQuery_GetRow(String from,String where){
        try{
            Statement stat=conn.createStatement();
            ResultSet rs=stat.executeQuery("select *"+
                                            " from "+from+
                                            " where "+where);
            return rs;
        }catch(SQLException ex){
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,null,ex);
        }
        return null;
    }
    public ResultSet ExcuQuery_GetRow(String select,String from,String where){
        try{
            Statement stat=conn.createStatement();
            ResultSet rs=stat.executeQuery("select "+select+
                                            " from "+from+
                                            " where "+where);
            return rs;
        }catch(SQLException ex){
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,null,ex);
        }
        return null;
    }
    
    public ResultSet ExcuQuery_GetLastRow(String from,String where,String orderby){
        try{
            Statement stat=conn.createStatement();
            ResultSet rs=stat.executeQuery("select TOP 1 *"+
                                            " from "+from+
                                            " where "+where+
                                            "order by "+orderby);
            return rs;
        }catch(SQLException ex){
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,null,ex);
        }
        return null;
    }
    
    
    
    public void ExcuQuery_Delete(String table,String where){
        try{
            Statement stat=conn.createStatement();
            stat.executeUpdate("Delete "+table+" where "+where);
        }catch(SQLException ex){
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    public void ExcuQuery_Add(String query){
        try{
            Statement stat=conn.createStatement();
            stat.executeUpdate(query);
        }catch(SQLException ex){
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    public void ExcuQuery_Update(String table,String set,String where){
        try{
            Statement stat=conn.createStatement();
            stat.executeUpdate("Update "+table+" set "+set+" where "+ where);
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,null,ex);

        }
    }
}
  
