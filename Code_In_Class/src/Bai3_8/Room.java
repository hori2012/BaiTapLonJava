package Bai3_8;

public abstract class Room {
	private String room_code;
	private double price;
	private String note;

	public Room(String room_code, double price, String note) {
		super();
		this.room_code = room_code;
		this.price = price;
		this.note = note;
	}

	public String getRoom_code() {
		return room_code;
	}

	public double getPrice() {
		return price;
	}

	public String getNote() {
		return note;
	}

	public abstract String Type_Room();

	public abstract String toString();

	public abstract boolean Family_Room();

	protected abstract boolean Double_Room();

	protected abstract boolean Single_Room();
}
