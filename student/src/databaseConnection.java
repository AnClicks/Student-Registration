/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADITYA RAJ
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class databaseConnection {
final static String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
final static String DB_URL="jdbc:mysql://localhost:3306/student";

final static String USER ="root";
final static String PASS ="";

public static Connection connection(){
     java.sql.Connection con=null;
    try {
        Class.forName(JDBC_DRIVER);
        
         con = DriverManager.getConnection(DB_URL,USER,PASS);
       
        
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    return con;
}

}
