package communityuni.com;

public class DemoStatic {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien();
		SinhVien sv2 = new SinhVien();
		SinhVien sv3 = new SinhVien();
		
		System.out.println(sv1.tenThayGiao);
		System.out.println(sv2.tenThayGiao);
		System.out.println(sv3.tenThayGiao);
		
		// biến static của 1 object thay đổi thì các object khác cũng thay đổi theo
		sv1.tenThayGiao = " Tran Duc Chu";
		System.out.println(sv1.tenThayGiao);
		System.out.println(sv2.tenThayGiao);
		System.out.println(sv3.tenThayGiao);
		
		// biến static này ta sử dụng Class cha vẫn thay đổi được toàn bộ giá trị biến static của object
		SinhVien.tenThayGiao = " Ten Thay Giao";
		System.out.println(SinhVien.tenThayGiao);
		System.out.println(sv1.tenThayGiao);
		System.out.println(sv2.tenThayGiao);
		System.out.println(sv3.tenThayGiao);
		
		SinhVien.inTenThayGiao();
		
		// Demo constructor
		SinhVien sv4 = new SinhVien(4, "Chuan Tran HeHe", 12);
		System.out.println("sv.ma = "+sv4.ma);
		System.out.println("sv.ten = "+sv4.ten);
		System.out.println("sv.tuoi = "+sv4.tuoi);
	}
}
