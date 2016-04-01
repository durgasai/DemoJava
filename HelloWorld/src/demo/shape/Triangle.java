package demo.shape;

public class Triangle extends Shape{
	public static final String TAG = "Triangle";
	public double c;
	double h;
	
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(double a, double b, double c, double h){
		/*this.a = a;
		this.b = b;*/
		//==> co cach nao su dung lai phuong thuc khoi tao cua lop cha hay khong?
		super(a, b);
		this.c = c;
		this.h = h;
	}
	
	@Override
	public void XuatThongTin() {
		// TODO Auto-generated method stub
		super.XuatThongTin();
		System.out.println("c:" + c + "\th:" + h);
	}
	
	
	void setH(double h){
		this.h = h;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return 0;
	}
}
