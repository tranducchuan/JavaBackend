package communityuni.com;

public class ChuaBaiTapLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KhachHang kh1 = new KhachHang();
		
		kh1.luuThongTin();
		kh1.hienThongTin();
		
		KhachHang kh2 = new KhachHang();
		kh2.luuThongTin();
		kh2.hienThongTin();
		
		int soSanhNgaySinh = kh1.soSanhNgaySinh(kh2);
		
		switch(soSanhNgaySinh){
			case ThoiGian.BANG_NHAU:
				System.out.println(" 2 khách hàng bằng tuổi nhau");
				
			case ThoiGian.NHO_HON:
				System.out.println(" Khách hàng 1 lớn tuổi hơn");
				
			case ThoiGian.LON_HON:
				System.out.println(" Khach hang 1 nhỏ tuổi hơn");
		}
		
	}

}
