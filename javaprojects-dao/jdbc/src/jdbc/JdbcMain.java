package jdbc;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import oracle.jdbc.driver.*;

public class JdbcMain {
	public static void main(String[] args) {
	JdbcMain ui=new JdbcMain();
	ui.execute();
	}
	
	
	Connection createConnection() throws SQLException{
	
		DriverManager.registerDriver(new OracleDriver());
		String url="jdbc:oracle:thin:@192.168.2.11:1521:orcl";
		Connection connection=DriverManager.getConnection(url, "scott","tiger");
		return connection;
     }
	
   public void fetchAndDisplay() {
	try {
		
		//register driver
		//DriverManager.registerDriver(new OracleDriver());
		
		//creating connection
		
		Connection connection=createConnection();
		
		//creating statement object
		
		
		String sql="select * from employees";
		PreparedStatement statement=connection.prepareStatement(sql);
		ResultSet resultSet= statement.executeQuery();
		while (resultSet.next()){
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			System.out.println("  id=" +id + "  name=" + name );
			
		}
	  }catch (SQLException e) {
		 System.out.println("error");
	      }
   }
	
	public void addRow() {
		try {
			Connection connection = createConnection();
			Statement statement=connection.createStatement();
			String sql="insert into employees(id,name) values(1899,'Nida')";
			int count= statement.executeUpdate(sql);
			System.out.println("no of rows updated=" +count);
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void execute() {
		addRow();
		fetchAndDisplay();
	}
   
}

