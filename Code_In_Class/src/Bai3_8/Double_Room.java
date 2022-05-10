package Bai3_8;

public class Double_Room extends Room {

	public Double_Room(String room_code, double price, String note) {
		super(room_code, price, note);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Double room : " + this.getRoom_code() + " - " + this.getPrice() + " - " + this.getNote();
	}

	@Override
	public String Type_Room() {
		// TODO Auto-generated method stub
		return "Double room";
	}

	@Override
	public boolean Family_Room() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean Double_Room() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected boolean Single_Room() {
		// TODO Auto-generated method stub
		return false;
	}

}
