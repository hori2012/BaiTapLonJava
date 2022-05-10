package Bai3_8;

public class Single_Room extends Room {

	public Single_Room(String room_code, double price, String note) {
		super(room_code, price, note);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Single room : " + this.getRoom_code() + " - " + this.getPrice() + " - " + this.getNote();
	}

	@Override
	public String Type_Room() {
		// TODO Auto-generated method stub
		return "Single room";
	}

	@Override
	public boolean Family_Room() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean Double_Room() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean Single_Room() {
		// TODO Auto-generated method stub
		return true;
	}

}
