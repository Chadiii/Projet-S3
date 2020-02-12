package web;

import java.util.ArrayList;
import java.util.List;
import Bean.Reservation;
import Bean.Reservation_model;

public class modelModel {
	
	private Reservation_model r=new Reservation_model();
	private List<Reservation_model> reserv_model=new ArrayList<Reservation_model>();
	
	public Reservation_model getR() {
		return r;
	}
	public void setR(Reservation_model r) {
		this.r = r;
	}
	public List<Reservation_model> getReserv_model() {
		return reserv_model;
	}
	public void setReserv_model(List<Reservation_model> reserv_model) {
		this.reserv_model = reserv_model;
	}
	
	

}
