package Bai3_8;

public class Room_Infor {
	private Room room;
	private int quantity;

	public Room_Infor(Room room, int quantity) {
		super();
		this.room = room;
		this.quantity = quantity;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return this.room + " - " + this.quantity;
	}

}
