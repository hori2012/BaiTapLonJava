package Bai3_8;

import java.util.ArrayList;
import java.lang.String;

public class Booking_Infor implements Comparable<Booking_Infor> {
	private String name;
	private String arrival_date;
	private String go_date;
	private ArrayList<Room_Infor> list_room;

	public Booking_Infor(String name, String arrival_date, String go_date, ArrayList<Room_Infor> list_room) {
		super();
		this.name = name;
		this.arrival_date = arrival_date;
		this.go_date = go_date;
		this.list_room = list_room;
	}

	public Booking_Infor() {
		// TODO Auto-generated constructor stub
		this.list_room = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public String getArrival_date() {
		return arrival_date;
	}

	public String getGo_date() {
		return go_date;
	}

	public ArrayList<Room_Infor> getList_room() {
		return list_room;
	}

	public String toString() {
		return this.name + ", " + this.arrival_date + ", " + this.go_date + ", " + this.list_room;
	}

	// Cau 4: kiem tra co dat phong gia dinh khong ?
	public boolean check_familyRoom() {
		for (int i = 0; i < this.list_room.size(); i++) {
			if (this.list_room.get(i).getRoom().Family_Room()) {
				return true;
			}
		}
		return false;
	}

	// Cau 5: Tong tien hoa don dat hang
	public double totalMoney() {
		double sum = 0.0;
		for (int i = 0; i < this.list_room.size(); i++) {
			sum += (this.list_room.get(i).getQuantity() * this.list_room.get(i).getRoom().getPrice());
		}
		return sum;
	}

	// Cau 6: Phong co so luong dat nhieu nhat
	public void room_MaxQuanity() {
		int index = 0;
		int maxquatity = this.list_room.get(0).getQuantity();
		for (int i = 1; i < this.list_room.size(); i++) {
			if (maxquatity < this.list_room.get(i).getQuantity()) {
				maxquatity = this.list_room.get(i).getQuantity();
				index = i;
			}
		}
		if (this.list_room.get(index).getRoom().Double_Room()) {
			System.out.println("Double room has the most booking : " + maxquatity);
		} else if (this.list_room.get(index).getRoom().Single_Room()) {
			System.out.println("Single room has the most booking : " + maxquatity);
		} else if (this.list_room.get(index).getRoom().Family_Room()) {
			System.out.println("Family room has the most booking : " + maxquatity);
		}
	}

	// cau 10 : sap xep giam dan theo gia tri dat phong va tang dan theo ten
	@Override
	public int compareTo(Booking_Infor o) {
		// TODO Auto-generated method stub
		if (this.totalMoney() < o.totalMoney()) {
			return -1;
		}

		else if (this.name.compareToIgnoreCase(o.getName()) > 0) {
			return 1;
		}
		return -1;
	}

}
