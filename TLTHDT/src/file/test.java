package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static NHANVIEN nvb[] = new NHANVIEN[3];
	public static NHANVIEN nv2[] = new NHANVIEN[3];
	public Scanner rc = new Scanner(System.in);
	public static String nameFile = "nhanvien.txt";
	public static String nameFile2 = "nhanvien.bin";
	public static void nhapsv1() {
		try {
			FileWriter nvFileWriter = new FileWriter(nameFile);
			for(int i = 0; i < 3; i++) {
				nvb[i] = new NHANVIEN();
				System.out.println("Nhap NV "+(i+1));
				nvb[i].nhap();
				nvFileWriter.write("MaNV: "+nvb[i].getManv()+"| ");
				nvFileWriter.write("Ho Ten: "+nvb[i].getHoten()+"| ");
				nvFileWriter.write("Tuoi: "+nvb[i].getTuoi()+"| ");
				nvFileWriter.write("Luong: "+nvb[i].getLuong()+"\n");
			}
			nvFileWriter.flush();
			nvFileWriter.close();
			System.out.println("Nhap File thanh cong");
		} catch (IOException e) {
			System.out.println("Nhap File bi loi");
			e.printStackTrace();
		}
		
	}
	public static void docFilenvb() {
		try {
			FileReader fileReader = new FileReader(nameFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while(true) {
				String string = bufferedReader.readLine();
				if(string != null) {
					System.out.println(string);
				}else {
					break;
				}		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// cau 2
	public static void nhapnv2() {
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nameFile2));
			for(int i = 0; i < 3;i++) {
				nv2[i] = new NHANVIEN();
				System.out.println("Nhap NhanVien "+(i+1));
				nv2[i].nhap();
				objectOutputStream.writeObject(nv2[i]);
			}
			objectOutputStream.flush();
			objectOutputStream.close();
			System.out.println("Nhap File Thanh Cong");
		} catch (IOException e) {
			System.out.println("Nhap File That Bai");
			e.printStackTrace();
		}
	}
	public static void xuatFilenv2() {
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nameFile2));
			NHANVIEN nhanvien = null;
			while(true) {
				nhanvien = (NHANVIEN)objectInputStream.readObject();
				if(nhanvien != null)
					System.out.println(nhanvien);
				else {
					break;
				}
			}
			objectInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		nhapsv1();
//		docFilenvb();
		nhapnv2();
		xuatFilenv2();
	}

}
