package Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.JavaEE.BD.SingletonConnection;


public class Image_Implem {
	public void addImage(Image_Imm m, int code_imm) {
		Connection conn=SingletonConnection.getConnection();
		 try {
			PreparedStatement ps=conn.prepareStatement
					 ("insert into image_immob(filename,path,code_imm) values(?,?,?)");
			
			ps.setString(1,m.getFilename());
			ps.setString(2,m.getPath());
			ps.setInt(3,code_imm);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	public void deleteImage(int code_imm) {
		Connection conn=SingletonConnection.getConnection();
		 try {
			PreparedStatement ps=conn.prepareStatement
					 ("delete from image_immob where code_imm=?");
		
			ps.setInt(1,code_imm);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
