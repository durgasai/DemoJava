package demo.java;

public class PhanSo {
	//thuoc tinh 
	private int tu;
	private int mau;
	
	public int getMau(){
		return mau;
	}
	
	void setMau(int mau){
		if(mau == 0)
		{
			//xuat loi
		}
		this.mau = mau;
	}
	
	//phuong thuc khoi tao
	//phuong thuc khoi tao mac dinh
	public PhanSo(){
		setTu(0);
		mau = 1;
	}
	
	public PhanSo(int tu, int mau){
		this.setTu(tu);
		if(mau == 0)
		{
			//loi
			this.mau = 1;
		}
		else
			this.mau = mau;
			
	}
	
	//hanh dong - function (ham) - method (phuong thuc)
/*	PhanSo Cong(PhanSo a, PhanSo b){
		PhanSo kq = new PhanSo();
		kq.tu = a.tu * b.mau + a.mau * b.tu;
		kq.mau = a.mau * b.mau;
		return kq;
	}*/
	
	PhanSo Cong( PhanSo b){
		PhanSo kq = new PhanSo();
		kq.setTu(this.getTu() * b.mau + this.mau * b.getTu());
		kq.mau = this.mau * b.mau;
		return kq;
	}
	
	/*void Xuat(int tu, int mau){
		System.out.println(tu + "/" + mau);
	}*/
	
	public void Xuat(){
		System.out.println(getTu() + "/" + mau);
	}

	public int getTu() {
		return tu;
	}

	public void setTu(int tu) {
		this.tu = tu;
	}
}
