package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.Action;
import javax.swing.JOptionPane;

import model.ThiSinh;
import model.Tinh;
import view.QLSVView;

public class QLSVControler implements ActionListener{
	public QLSVView qlsvView;
	
	public QLSVControler(QLSVView qlsvView) {
		this.qlsvView = qlsvView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String tenNut = e.getActionCommand();
		JOptionPane.showMessageDialog(qlsvView, "Bạn vừa "+ tenNut);// Tạo bảng thông báo 
		
		if(tenNut.equals("Insert")) {
			qlsvView.qlsvModel.setTrangThai("Insert");
			
			try {
				int msv = Integer.parseInt(qlsvView.msv_jTextField.getText());
				String hoTen = qlsvView.hoTen_jTextField.getText()+"";
				int queQuan = qlsvView.queQuan_JComboBox2.getSelectedIndex();
				Tinh tinh = Tinh.getQueQuanByID(queQuan);
				Date date = new Date(qlsvView.ngaySinh_jTextField.getText());
				
				Boolean gt = true;
				if(qlsvView.nam_jRadioButton.isSelected()) {
					gt = true;
				}else {
					gt = false;
				}
				
				float hoa = Float.parseFloat(qlsvView.hoa_jTextField.getText());
				float ly = Float.parseFloat(qlsvView.ly_jTextField.getText());
				float toan = Float.parseFloat(qlsvView.toan_jTextField.getText());
				
				ThiSinh ts = new ThiSinh(msv, hoTen, tinh.toString(), date, gt, toan, ly, hoa);
				qlsvView.insert(ts);
				
			} catch (Exception e2) {
				e2.printStackTrace();
				JOptionPane.showMessageDialog(qlsvView, "Vui lòng nhập đủ thông tinh");
			}
		
			qlsvView.resetForm2();
		}else if(tenNut.equals("Edit") && qlsvView.qlsvModel.getTrangThai().equals("Insert")) {
			qlsvView.resetForm2();

		}else if(tenNut.equals("Delete")) {
			
		}else if(tenNut.equals("OK")) {
			
		}else if(tenNut.equals("Cancel")) {
			
		}
	}



}
