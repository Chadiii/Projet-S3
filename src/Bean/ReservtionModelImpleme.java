package Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.JavaEE.BD.SingletonConnection;


public class ReservtionModelImpleme {
	public List<Reservation_model> listModele() {
		List<Reservation_model> reserv=new ArrayList<Reservation_model>();
		Connection conn=SingletonConnection.getConnection();
		 try {
			PreparedStatement ps=conn.prepareStatement
					 ("select * from reservation_model");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Reservation_model R=new Reservation_model();
			R.setId_reservation_model(rs.getInt("id_reservation_model"));
			R.setCode_model(rs.getInt("code_model"));
			R.setId_user(rs.getInt("id_user"));
		
		    reserv.add(R);
			
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reserv;
	}
	public void deleteModele(int code) {
		Connection conn=SingletonConnection.getConnection();
		 try {
			PreparedStatement ps=conn.prepareStatement
					 ("delete from reservation_model where id_reservation_model=?");
		
			ps.setInt(1,code);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
