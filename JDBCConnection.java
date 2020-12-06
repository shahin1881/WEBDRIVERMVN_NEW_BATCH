import java.sql.Connection;

	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		/*Connection url
		"jdbc:mysql://"+host+":"+port+"/databasename";
		"jdbc:mysql://"+localhost+":"+3306+"/Employee";
			
	*/
		/*Create new database and create a table

		having two columns	1.Username 2.Password.
		Add 4 records in it.
		*/
			String host="localhost";
			String port="3306";
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/dece2020", "root", "shahin123");
			
			Statement s=con.createStatement();
			
			ResultSet rs=s.executeQuery("select * from EmployeeInfo where name='shahin'");//show table and retrive data  specific person
			
			while(rs.next())// while using are show table filed 
			{
				System.out.println(rs.getString("name"));//shahin
				System.out.println(rs.getString("id"));//2
				System.out.println(rs.getString("location"));//Delhi
				System.out.println(rs.getString("age"));//28
				
			}
			
			
			
			
			
			
		}

	}

