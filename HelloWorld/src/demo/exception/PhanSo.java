package demo.exception;

public class PhanSo {
	int tu;
	int mau;
	public PhanSo(int tu, int mau) {
		super();
		this.tu = tu;
		this.mau = mau;
	}
	
	public PhanSo() {
		// TODO Auto-generated constructor stub
	}

	public int getTu() {
		return tu;
	}

	public void setTu(int tu) {
		this.tu = tu;
	}

	public int getMau() {
		return mau;
	}

	public void setMau(int mau) throws PhanSoException {
		if(mau == 0)
			throw new PhanSoException("khong the truyen gia tri mau = 0");
		this.mau = mau;
	}
	
	
}
