package Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.JavaEE.BD.SingletonConnection;


public class ReservtionImpleme {
	public List<Reservation> listReservation() {
		List<Reservation> reserv=new ArrayList<Reservation>();
		Connection conn=SingletonConnection.getConnection();
		 try {
			PreparedStatement ps=conn.prepareStatement
					 ("select * from reservation");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Reservation R=new Reservation();
			R.setId_reservation(rs.getInt("id_reservation"));
			R.setCode_imm(rs.getInt("code_imm"));
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
	public void deleteReservation(int code) {
		Connection conn=SingletonConnection.getConnection();
		 try {
			PreparedStatement ps=conn.prepareStatement
					 ("delete from reservation where id_reservation=?");
		
			ps.setInt(1,code);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
