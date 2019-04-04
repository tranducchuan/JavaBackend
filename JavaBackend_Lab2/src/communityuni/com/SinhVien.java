package communityuni.com;


/*
 * Constructor là hàm được gọi khi khởi tạo object
 * Nếu không viết thì mặc đinh Java sẽ viết hộ ( tự thêm vào khi biên dịch ) 1 constructor rỗng, không tham số, không nội dung
 * Tại sao cần Constructor
 * Nhu cầu cần có nó, vì khi tạo object thì phải làm gì đó luôn
 * Nếu các phương thức bình thường thì không chạy được  vì muốn chạy được thì phải gọi tên hàm  
 * Đã viết Constructor có tham số thì lập tức Java không tự sinh Constructor rỗng nữa nên ta cần viết thêm phương thức Constructor rỗng
 * Trong constructor có tham số được tạo ra vì mục đích kiểm tra dữ liệu, ràng buộc điều kiện cho dữ liệu , nhập dữ liệu cho đúng
 */

public class SinhVien {
	
	public SinhVien(){
		// ten phương thức là tên class
		// không có kiểu trả về
		System.out.println(" Dang khoi tao sinh vien");
	}
	
	public SinhVien(int ma, String ten, int tuoi){
		// ten phương thức là tên class
		// không có kiểu trả về
		System.out.println(" Dang khoi tao sinh vien co tham so");
		this.ma = ma;
		this.ten = ten;
		this.tuoi = tuoi;
		// Constructor sinh ra không chỉ là truyền tham số vào trong lúc nó được khởi tạo mà nó dùng vì mục đích chính chạy những đoạn code muốn nó chạy ngay khi khởi tạo object
		// Khi khởi tạo object là máy khởi tạo nó gọi constructor mình viết chạy kèm với object được tạo
		// 1 class có bao nhiêu Constructor?
		// 1 class có vô số Constructor nhưng các phương thức phải khác nhau về danh sách tham số truyền vào
	}
	
	// Biến cục bộ của class
	public int ma;
	public String ten;
	public int tuoi;
	
	// Thường thì biến static thường đi kèm với final
	public static final int a = 10; // Tránh trường hợp public final int a = 10 , thì trong các object sẽ có các biến a bị thừa khi không sử dụng 
	// Biến 
	public static String tenThayGiao = " Tran Duc Chuan"; // biến tĩnh nằm trong class con mà nó nằm trong class cha
	
	// Đoạn static load, cho du ban khoi tao bao nhieu object thì static load chỉ chạy duy nhất 1 lần khi class được load lên bộ nhớ
	static {
		System.out.println(" Day la doan code static se chay khi lan dau tien class duoc load lên bộ nhớ");
	}
	
	// Hàm này tồn tại trong vùng nhớ của Class cha nên nó chỉ gọi được các biến tĩnh, hàm này chạy không cần object nên hàm này không truy cập được
	public static void inTenThayGiao(){
		System.out.println("Thay giao ten la: "+tenThayGiao);
		
		// Muốn truy cập được thì ta sẽ sử dụng bằng cách khởi tạo 1 object mới
		//SinhVien sv = new SinhVien();
		//sv.ma = 3;
		//System.out.println(sv.ma); // Không in được vì không biết mã của ai để in ra cả
		
	}
}
