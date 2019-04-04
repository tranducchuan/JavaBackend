package communityuni.com;

public class DemoConTro {
	
	// lần đầu tiên class được load lên bộ nhớ thì sẽ sử dụng static load trước
	static {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa");
	}
	//Tại sao hàm main phải có static
	// vì có static thì hàm main không cần object vẫn chạy được
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv1 = new SinhVien();
		sv1.ma = 1;
		sv1.ten = " Sinh vien 1";
		sv1.tuoi = 19;
		
		SinhVien sv2 = sv1;
		sv2.tuoi = 20;
		
		System.out.println(" sv2.ma = "+ sv2.ma);
		System.out.println(" sv2.ten = "+ sv2.ten);
		System.out.println(" sv2.tuoi = "+ sv2.tuoi);
		System.out.println(" sv1.tuoi = "+ sv1.tuoi);
		
		tangTuoiLenMot(sv1.tuoi);
		System.out.println(" sv1.tuoi = "+ sv1.tuoi);
		tangTuoiLenMot(sv1);
		System.out.println(" sv1.tuoi = "+ sv1.tuoi);
	
		
	}
	
	public static void tangTuoiLenMot(int tuoi){
		tuoi = tuoi + 1;
	}
	
	public static void tangTuoiLenMot(SinhVien sv){
		sv.tuoi = sv.tuoi + 1;
	}
}
