import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class connection {
    
 public static Connection con;
 
 public static void connecttosql()
 {
     try
     {  
       String url = "jdbc:sqlserver://localhost\\LAPTOP-6CU4LT94:1433;databaseName=HospitalManagement;encrypt=true ; trustServerCertificate=true";
       String username ="Mohamedsayed";
       String pass = "123";
       
      con = DriverManager.getConnection(url, username, pass);
      
      /*System.out.println("connection done");*/ JOptionPane.showMessageDialog(null, "الكونكشن فل الفل");
     }
     catch(SQLException e) {
      
         /*System.out.println(e); */  JOptionPane.showMessageDialog(null, e);
     }
       
 }  
 public static void Close()
 {
     try {
         con.close();
     } catch(SQLException e) {
         
         /* System.out.println(e);*/   JOptionPane.showMessageDialog(null, e);
         
     }
 }
 
 public static boolean excutequey (String sqlstatement)
 {
     try{
         Statement stmt = con.createStatement();
         stmt.execute(sqlstatement);
         return true;
     }
     catch(SQLException e)
     {
         /*System.out.println(e); */    JOptionPane.showMessageDialog(null, e);
      return false;
     }
 }
  
 
 public static void main (String args[])
 {
     
 }
 
 
 
 
 
 
}
