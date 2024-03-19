import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class main {
	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        LocalDate ngayhientai = LocalDate.now();
			System.out.println(ngayhientai);
			
			long thoigianchay = System.currentTimeMillis(); // dùng để do thời gian chạy của một gì đó, hoặc tắc nó sau khi chạy bao nhiêu mls(chia 1000 để thành s)
			
	        System.out.println("Nhap ngay thu nhat (yyyy/MM/dd): ");
	        LocalDate ngayThuNhat =  LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	       
	        System.out.println("Nhap ngay thu hai (yyyy/MM/dd): ");
	        LocalDate ngayThuHai = LocalDate.parse(scanner.nextLine(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));

	        long soNgay = tinhSoNgayGiuaHaiNgay(ngayThuNhat, ngayThuHai);

	        System.out.println("So ngay giua hai ngay la: " + soNgay);
	    }

	    private static long tinhSoNgayGiuaHaiNgay(LocalDate ngayThuNhat, LocalDate ngayThuHai) {
	        return ChronoUnit.DAYS.between(ngayThuNhat, ngayThuHai);
	    }
	}

}
