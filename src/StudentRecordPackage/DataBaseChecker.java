package StudentRecordPackage;
import java.sql.*;

public class DataBaseChecker {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/studentrecordapplication";
		String username = "root";
		String pass = "";
		String sqlquary = "select * from studentrecordapplication where DigitId=9 ";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlquary);
		rs.next();
		String Name = rs.getString("Name");
		String session = rs.getString("Session");
		String DiditId = rs.getString("DigitId");
		String Couse = rs.getString("CourseDetails");
		
		
		System.out.println(Name+" "+session+" "+DiditId+" "+Couse);
		st.close();
		con.close();
		
		

	}

}
