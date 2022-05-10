package Bai3_8;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Room r1 = new Single_Room("123", 111, "ok");
		Room r2 = new Double_Room("1212", 222, "ok");
		Room r3 = new Family_Room("312", 222, "ok", 3);
		Room r4 = new Single_Room("2918", 111, "ok");
		Room r5 = new Double_Room("49302", 666, "ok");
		Room r6 = new Family_Room("3421", 345, "ok", 3);
		System.out.println("Infor room 1: " + r1.toString());
		System.out.println("Infor room 2: " + r2.toString());
		System.out.println("Infor room 3: " + r3.toString());
		System.out.println("Infor room 4: " + r4.toString());
		System.out.println("Infor room 5: " + r5.toString());
		System.out.println("Infor room 6: " + r6.toString());
//		 Test case 3: Kiem tra loai phong
		System.out.println("-------------------test 3------------------");
		System.out.println(r1.Type_Room());
		System.out.println(r2.Type_Room());
		System.out.println(r3.Type_Room());
//		 Test case 4: Kiem tra don dat phong co phong gia dinh khong
		Room_Infor ri1 = new Room_Infor(r1, 3);
		Room_Infor ri2 = new Room_Infor(r2, 4);
		Room_Infor ri3 = new Room_Infor(r3, 4);
		Room_Infor ri4 = new Room_Infor(r4, 6);
		Room_Infor ri5 = new Room_Infor(r5, 7);
		Room_Infor ri6 = new Room_Infor(r6, 8);
		ArrayList<Room_Infor> customer1 = new ArrayList<>();
		ArrayList<Room_Infor> customer2 = new ArrayList<>();
		customer1.add(ri1);
		customer1.add(ri3);
		customer2.add(ri1);
		customer2.add(ri2);
		ArrayList<Room_Infor> customer3 = new ArrayList<>();
		ArrayList<Room_Infor> customer4 = new ArrayList<>();
		customer3.add(ri4);
		customer3.add(ri5);
		customer4.add(ri6);
		customer4.add(ri5);
		Booking_Infor bi1 = new Booking_Infor("Jung Nguyen", " 30/4/2022", "3/5/2022", customer1);
		Booking_Infor bi2 = new Booking_Infor("Hung Cao", " 7/5/2022", "20/5/2022", customer2);
		Booking_Infor bi3 = new Booking_Infor("Cong Dung", " 30/4/2022", "23/5/2022", customer3);
		Booking_Infor bi4 = new Booking_Infor("Cao Nam", " 29/5/2022", "1/6/2022", customer4);
		System.out.println("-------------------test 4------------------");
		if (bi1.check_familyRoom()) {
			System.out.println("Exists family room");
		}
		if (!bi2.check_familyRoom()) {
			System.out.println("Not exists family room");
		}
//		 Test case 5: Tinh tien don dat phong
		System.out.println("-------------------test 5------------------");
		System.out.println("Total money bi1 (Jung Nguyen): " + bi1.totalMoney() + " VND");
		System.out.println("Total money bi2 (Hung Cao): " + bi2.totalMoney() + " VND");
		System.out.println("Total money bi3 (Cong Dung): " + bi3.totalMoney() + " VND");
		System.out.println("Total money bi4 (Cao Nam): " + bi4.totalMoney() + " VND");
//		 Test case 6: tim  phong co so luong dat nhieu nhat
		System.out.println("-------------------test 6------------------");
		bi1.room_MaxQuanity();
		bi2.room_MaxQuanity();
//		 Test case 7 : tim don dat phong cua khach hang voi ten cho truoc
		System.out.println("-------------------test 7------------------");
		String nameSearch = "Hung truyen ky";
		System.out.println("Name search: Hung truyen ky");
		List_Booking lb = new List_Booking();
		lb.getList_booking().add(bi1);
		lb.getList_booking().add(bi2);
		lb.getList_booking().add(bi3);
		lb.getList_booking().add(bi4);
		if (lb.customerName(nameSearch).isEmpty()) {
			System.out.println("Not exist infor customer name '" + nameSearch + "' in list booking !!");
		} else {
			System.out.println(lb.customerName(nameSearch));
		}

//		 Test case 8 : don dat phong co tong tien cao nhat
		System.out.println("-------------------test 8------------------");
		System.out.println(lb.maxTotalMoney());
//		 Test case 9: danh sach cac phong don duoc dat 
		System.out.println("-------------------test 9------------------");
		System.out.println("List single room:");
		System.out.println(lb.listSingleRoom());
//		Test case 10 : sap xep giam dan theo tien don dat phong va tang dan theo ten khach hang
		System.out.println("-------------------test 10------------------");
		System.out.println("Total money bi1 (Jung Nguyen): " + bi1.totalMoney() + " VND");
		System.out.println("Total money bi2 (Hung Cao): " + bi2.totalMoney() + " VND");
		System.out.println("Total money bi3 (Cong Dung): " + bi3.totalMoney() + " VND");
		System.out.println("Total money bi4 (Cao Nam): " + bi4.totalMoney() + " VND");
		System.out.println("Before");
		System.out.println(lb.getList_booking());
		lb.SortList();
		System.out.println("After");
		System.out.println(lb.getList_booking());
//		Test case 11: thong ke so luong moi loai phong
		System.out.println("-------------------test 11------------------");
		System.out.println("Number of room types: ");
		lb.synRoom();
//		test case 12 : GUI hien thi danh sac cac don dat phong
		new GUIList(lb);

	}
}
