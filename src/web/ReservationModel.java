package web;

import java.util.ArrayList;
import java.util.List;
import Bean.Reservation;

public class ReservationModel {
	private Reservation r=new Reservation();
	private List<Reservation> reserv=new ArrayList<Reservation>();
	
	public Reservation getR() {
		return r;
	}
	public void setR(Reservation r) {
		this.r = r;
	}
	public List<Reservation> getReserv() {
		return reserv;
	}
	public void setReserv(List<Reservation> reserv) {
		this.reserv = reserv;
	}

}
