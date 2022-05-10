package Bai3_8;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GUIList {
	JFrame f = new JFrame("LIST BOOKING ROOM");

	public GUIList(List_Booking answer) {
		super();

		String colunm[] = { "HOTEN", "NGAY DEN", "NGAY DI", "MA PHONG", "LOAI PHONG", "GIA PHONG", "SO LUONG PHONG", "GHI CHU" };

		DefaultTableModel model = new DefaultTableModel(colunm, 0);
		JTable table = new JTable(model);
		table.setBounds(100, 150, 200, 300);
		for (int i = 0; i < answer.getList_booking().size(); i++) {
			for (int j = 0; j < answer.getList_booking().get(i).getList_room().size(); j++) {
				String row[] = { answer.getList_booking().get(i).getName(),
						answer.getList_booking().get(i).getArrival_date(), answer.getList_booking().get(i).getGo_date(),
						answer.getList_booking().get(i).getList_room().get(j).getRoom().getRoom_code(),
						answer.getList_booking().get(i).getList_room().get(j).getRoom().Type_Room(),
						String.valueOf(answer.getList_booking().get(i).getList_room().get(j).getRoom().getPrice()),
						String.valueOf(answer.getList_booking().get(i).getList_room().get(j).getQuantity()),
						answer.getList_booking().get(i).getList_room().get(j).getRoom().getNote() };
				model.addRow(row);
			}

		}

		JScrollPane sp = new JScrollPane(table);
		f.add(sp);
		f.setSize(300, 400);
		f.setVisible(true);

	}

}
