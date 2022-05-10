package Bai3_8;

import java.util.ArrayList;
import java.util.Collections;

public class List_Booking {
	private ArrayList<Booking_Infor> list_booking;

	public List_Booking(ArrayList<Booking_Infor> list_booking) {
		super();
		this.list_booking = list_booking;
	}

	public List_Booking() {
		// TODO Auto-generated constructor stub
		this.list_booking = new ArrayList<>();
	}

	public ArrayList<Booking_Infor> getList_booking() {
		return list_booking;
	}

	public void setList_booking(ArrayList<Booking_Infor> list_booking) {
		this.list_booking = list_booking;
	}

	public int lsize() {
		return this.list_booking.size();
	}

	// Cau 7: Danh sach don dat phong cua khach hang voi ten cho truoc
	public ArrayList<Booking_Infor> customerName(String name) {
		ArrayList<Booking_Infor> answer = new ArrayList<>();
		for (int i = 0; i < this.list_booking.size(); i++) {
			if (this.list_booking.get(i).getName() == name) {
				answer.add(this.list_booking.get(i));
			}
		}
		return answer;
	}

	// Cau 8: Don dat phong co tong tien cao nhat
	public ArrayList<Booking_Infor> maxTotalMoney() {
		double maxtotal = this.list_booking.get(0).totalMoney();
		int index = 0;
		for (int i = 1; i < this.list_booking.size(); i++) {
			if (maxtotal < this.list_booking.get(i).totalMoney()) {
				maxtotal = this.list_booking.get(i).totalMoney();
				index = i;
			}
		}

		ArrayList<Booking_Infor> answer = new ArrayList<>();
		for (int i = 0; i < this.list_booking.size(); i++) {
			if (maxtotal == this.list_booking.get(i).totalMoney()) {
				answer.add(this.list_booking.get(i));
			}
		}
		System.out.println("Highest total bill: " + maxtotal + " VND");
		return answer;
	}

	// cau 10: sap xep giam dan theo gia tri dat phong va tang dan theo ten
	public void SortList() {
		Collections.sort(this.list_booking);
	}

	// Cau 9: Danh sach phong don da dat
	public ArrayList<Room> listSingleRoom() {
		ArrayList<Room> answer = new ArrayList<>();
		for (int i = 0; i < this.list_booking.size(); i++) {
			for (int j = 0; j < this.list_booking.get(i).getList_room().size(); j++) {
				if (this.list_booking.get(i).getList_room().get(j).getRoom().Single_Room()) {
					answer.add(this.list_booking.get(i).getList_room().get(j).getRoom());
				}
			}
		}
		return answer;
	}

	// Cau 11: Thong ke moi loai phong
	public void synRoom() {
		int countSingle = 0, countDouble = 0, countFamily = 0;
		for (int i = 0; i < this.list_booking.size(); i++) {
			for (int j = 0; j < this.list_booking.get(i).getList_room().size(); j++) {
				if (this.list_booking.get(i).getList_room().get(j).getRoom().Single_Room()) {
					countSingle++;
				} else if (this.list_booking.get(i).getList_room().get(j).getRoom().Double_Room()) {
					countDouble++;
				} else if (this.list_booking.get(i).getList_room().get(j).getRoom().Family_Room()) {
					countFamily++;
				}
			}
		}
		System.out.println("Single room: " + countSingle);
		System.out.println("Double room: " + countDouble);
		System.out.println("Family room: " + countFamily);
	}

}
