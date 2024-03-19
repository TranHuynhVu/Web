import java.sql.Date;

import com.toedter.calendar.JDateChooser;

public class jDateChoose {
	 public static void main(String[] args) {
	        // Tạo một đối tượng JDateChooser
	        JDateChooser dateChooser = new JDateChooser();
	        // Lấy ngày được chọn từ dateChooser
	        Date selectedDate = (Date) dateChooser.getDate();

	        // Kiểm tra xem ngày có null không (người dùng chưa chọn ngày)
	        if (selectedDate != null) {
	            System.out.println("Ngày được chọn: " + selectedDate);
	        } else {
	            System.out.println("Người dùng chưa chọn ngày.");
	        }
	    }
}
