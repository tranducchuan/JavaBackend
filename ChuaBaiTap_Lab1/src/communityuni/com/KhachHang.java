package communityuni.com;

import java.util.Scanner;

public class KhachHang {
	public int ma;
	public String ten;
	public ThoiGian ngaySinh;
	
	public void luuThongTin(){
		System.out.print(" Nhap ma: ");
		this.ma = new Scanner(System.in).nextInt();
		
		System.out.print(" Nhap ten: ");
		this.ten = new Scanner(System.in).nextLine();
		
		if ( this.ngaySinh == null ){
			this.ngaySinh = new ThoiGian();
		}
		
		this.ngaySinh.nhapDuLieu();
	}
	
	public void hienThongTin(){
		System.out.println("\n ================= ");
		System.out.println(" Ma: " + this.ma + "\n Ten: " + this.ten);
		if ( this.ngaySinh != null ){
			this.ngaySinh.hienThongTin();
		}
	}
	
	public int soSanhNgaySinh(KhachHang kh){
		if (kh != null ){
			return this.ngaySinh.soSanh(kh.ngaySinh);
		}
		
		return 1;
	}
}
