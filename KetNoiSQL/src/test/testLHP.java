package test;

import java.sql.Date;
import java.util.ArrayList;

import dao.LHP_DAO;
import dao.SINHVIEN_DAO;
import dao.userDAO;
import model.LHP;
import model.SINHVIEN;
import model.User;

public class testLHP {
	public static void main(String[] args) {
		
		/*
		// test insert
		SINHVIEN sv = new SINHVIEN(123456788, "Tran huynh vu", Date.valueOf("2023-01-01"), "22t1");
		System.out.println(sv);
		SINHVIEN_DAO.getSinhvien_DAO().insert(sv);
		*/
		
		/*
		// test update
		LHP lhp = new LHP("LTJV", "Lập Trình Java", 3);
		System.out.println(lhp);
		LHP_DAO.getLhp_DAO().update(lhp);
		*/
		
		/*
		//test delete
		LHP lhp = new LHP("LTJV", "Lập Trình Java", 3);
		System.out.println(lhp);
		LHP_DAO.getLhp_DAO().delete(lhp);
		*/
		
		/*
		for(int i = 1;  i<=10 ;i++) {
			SINHVIEN sv = new SINHVIEN(123+i, "Le Van A "+i, Date.valueOf("2032-01-01"), "22t"+i);
			SINHVIEN_DAO.getSinhvien_DAO().insert(sv);
		}
		
		ArrayList<SINHVIEN> sv = SINHVIEN_DAO.getSinhvien_DAO().selectALL();
		
		for (SINHVIEN sinhvien : sv) {
			System.out.println(sinhvien);
		}
		*/
		
		//test user
//		User user = new User("us1", "abc123", "vu");
//		
//		userDAO.getuserDAO().insert(user);
		
		User user = userDAO.getuserDAO().selectById(new User("us1", "abc123", "vu"));
		System.out.println(user);
		
	}
}
