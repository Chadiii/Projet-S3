package com.JavaEE.Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.JavaEE.BD.SingletonConnection;


public class UserImpleme {
	
	public List<User> listUser() {
		
		List<User> user=new ArrayList<User>();
		Connection conn=SingletonConnection.getConnection();
		 try {
			PreparedStatement ps=conn.prepareStatement
					 ("select * from user");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				User u=new User();
			u.setNom(rs.getString("nom"));
			u.setId(rs.getInt("id"));
			u.setEmail(rs.getString("email"));
			u.setPrenom(rs.getString("prenom"));
			u.setType(rs.getString("type"));
			u.setGsm(rs.getString("gsm"));
			
		    user.add(u);
			
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	public void deleteUser(int code) {
		Connection conn=SingletonConnection.getConnection();
		 try {
			PreparedStatement ps=conn.prepareStatement
					 ("delete from user where id=?");
		
			ps.setInt(1,code);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
