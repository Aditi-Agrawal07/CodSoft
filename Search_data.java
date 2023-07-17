package _03Task.src;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Search_data{

    // Replace below database url, username and password with your actual database credentials
    
    private static final String SEARCH_QUERY = "Select * from student where full_name = ?, roll_no = ?, grade = ?";

    public void searchRecord(String fullName, String roll_no, String grade) throws SQLException {

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
	                PreparedStatement ps = con.prepareStatement(SEARCH_QUERY);){


            // Step 2:Create a statement using connection object
          
	    	  
            ps.setString(1, fullName);
            ps.setString(2, roll_no);
            ps.setString(3, grade);

            System.out.println(ps);
            // Step 3: Execute the query or update query
           ResultSet rs =  ps.executeQuery();
           if(rs.next()) {
        	   String name = rs.getString(1);
        	   
           }
          
        } catch (SQLException e) {
            // print SQL exception information
            System.out.println(e);
            
        }
	    
		// return rs;
    }

 
}

