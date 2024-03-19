package model;

import java.util.ArrayList;

public class QLSVModel {
	private ArrayList<ThiSinh> dsThiSinhs;
	public String trangThai;
	
	public QLSVModel(ArrayList<ThiSinh> dsThiSinhs) {
		this.dsThiSinhs = dsThiSinhs;
	}

	public QLSVModel() {
		dsThiSinhs = new ArrayList<ThiSinh>();
	}

	public ArrayList<ThiSinh> getDsThiSinhs() {
		return dsThiSinhs;
	}

	public void setDsThiSinhs(ArrayList<ThiSinh> dsThiSinhs) {
		this.dsThiSinhs = dsThiSinhs;
	}
	
	public void insert(ThiSinh thiSinh) {
		this.dsThiSinhs.add(thiSinh);
	}
	
	public void delete(ThiSinh thiSinh) {
		this.dsThiSinhs.remove(thiSinh);
	}
	
	public void update(ThiSinh thiSinh) {
		this.dsThiSinhs.remove(thiSinh);
		this.dsThiSinhs.add(thiSinh);
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	
}
