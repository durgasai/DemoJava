package demo.shape;

public abstract class Shape {
	double a;//canh 1
	double b;//canh 2
	double chuVi;
	double dienTich;
	int mauVien;
	int mauNen;
	
	public Shape() {
		// TODO Auto-generated constructor stub
		a = 0;
		b = 0;
		chuVi = 0;
		dienTich = 0;
		mauVien = 0;
		mauNen = 0;
	}

	public Shape(double a, double b){
		this.a = a;
		this.b= b;
		
	}
	public void XuatThongTin(){
		System.out.println("a:" + a + "\tb:" + b);
	}
	
	public abstract double tinhDienTich();
	/*phuong thuc get,set*/
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getChuVi() {
		return chuVi;
	}

	public void setChuVi(double chuVi) {
		this.chuVi = chuVi;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public int getMauVien() {
		return mauVien;
	}

	public void setMauVien(int mauVien) {
		this.mauVien = mauVien;
	}

	

	public int getMauNen() {
		return mauNen;
	}

	public void setMauNen(int mauNen) {
		this.mauNen = mauNen;
	}
	
	
}
