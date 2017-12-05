package intpack;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;


public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://10.10.10.176:3306/boi_cia_08082016", "suresh", "suresh123");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from bcc_id_master");
		while(rs.next()){  
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		con.close();

}
}