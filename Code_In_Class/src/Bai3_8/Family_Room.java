package Bai3_8;

public class Family_Room extends Room {
	int capacity;

	public Family_Room(String room_code, double price, String note, int capacity) {
		super(room_code, price, note);
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Family room : " + this.getRoom_code() + " - " + this.getPrice() + " - " + this.getNote() + " - "
				+ this.getCapacity();
	}

	@Override
	public String Type_Room() {
		// TODO Auto-generated method stub
		return "Family room";
	}

	@Override
	public boolean Family_Room() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected boolean Double_Room() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean Single_Room() {
		// TODO Auto-generated method stub
		return false;
	}

}
