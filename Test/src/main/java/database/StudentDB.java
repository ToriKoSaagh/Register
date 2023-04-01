package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.Driver;

public class StudentDB {
	public void registration(String fullname, String department, String pass,String phone,String gender) {
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "";
		String query = "insert into student_registration values(?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, fullname);
			pst.setString(2, department);
			pst.setString(3, phone);
			pst.setString(4, pass);
			pst.setString(5, gender);
			
			int row = pst.executeUpdate();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
