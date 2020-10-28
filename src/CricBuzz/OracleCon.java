/* Suraj K
 * Roll No. 411731 	*/

package cricbuzz;

import java.sql.*;

public class OracleCon {
	public static Connection connectToDB() {
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
			return con;
		}catch(Exception e) { 
			System.out.println(e);
		} 
		return null;
	} 
	
}
