package communityuni.com;

import java.util.Scanner;

public class ThoiGian {
	public static final int BANG_NHAU = 0;
	public static final int NHO_HON = -1;
	public static final int LON_HON = 1;
	
	public int ngay;
	public int thang;
	public int nam;
	
	public void nhapDuLieu(){
		System.out.print(" Nhap ngay: ");
		this.ngay = new Scanner(System.in).nextInt();
		
		System.out.print(" Nhap thang: ");
		this.thang = new Scanner(System.in).nextInt();
		
		System.out.print(" Nhap nam: ");
		this.nam = new Scanner(System.in).nextInt();
		
	}
	
	public void hienThongTin(){
		System.out.println(" " + ngay + " / " + thang + " / " + nam);
	}
	
	public int soSanh(ThoiGian tg){ // quy ước BANG_NHAU  = 0 , NHO_HON = -1 , LON_HON = 1
		if (tg != null ){
			if(this.nam != tg.nam){
				return (this.nam - tg.nam > 0 ) ? LON_HON : NHO_HON ;
			}
				
			
			if ( this.thang != tg.thang ){
				return (this.thang - tg.thang > 0 ) ? LON_HON : NHO_HON;
			}
				
			
			if ( this.ngay != tg.ngay ){
				return (this.ngay - tg.ngay > 0 ) ? LON_HON : NHO_HON;
			}
				
			return BANG_NHAU;
		}
		
		return 1;
	}
}
