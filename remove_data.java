


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class remove_data{

    // Replace below database url, username and password with your actual database credentials
    
    private static final String DELETE_QUERY = "delete from student where roll_no = '102';";

    public void deleteRecord(String fullName, String roll_no, String grade) throws SQLException {

        // Step 1: Establishing a Connection and 
        // try-with-resource statement will auto close the connection
    	 try {
	          Class.forName("com.mysql.cj.jdbc.Driver");
	       } catch (ClassNotFoundException e) {
	           // TODO Auto-generated catch block
	           e.printStackTrace();
	       }
	      // create the connection
	       try(Connection con = DriverManager.getConnection("jdbc:mysql:///college","root","Aditi@123");
	                PreparedStatement ps = con.prepareStatement(DELETE_QUERY);){
	        //   set the values
       

            // Step 2:Create a statement using connection object
          
            ps.setString(1, fullName);
            ps.setString(2, roll_no);
            ps.setString(3, grade);

            System.out.println(ps);
            // Step 3: Execute the query or update query
            ps.executeUpdate();
        } catch (SQLException e) {
            // print SQL exception information
            System.out.println(e);
            
        }
    }

 
}

