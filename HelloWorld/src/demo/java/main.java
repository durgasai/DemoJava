package demo.java;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhanSo a = new PhanSo();
		System.out.println(a.getTu());
		System.out.println(a.getMau());
		
		PhanSo b = new PhanSo(1, 2);
		/*System.out.println(b.tu);
		System.out.println(b.mau);*/
//		b.Xuat(2, 1);
		b.Xuat();
		
		b.setTu(5);
		b.setMau(0);
		
		PhanSo c=null;
//		System.out.println(c.getTu());
		
		HonSo honSo = new HonSo();
		System.out.println(honSo.nguyen);
		System.out.println(honSo.phanSo.getTu());
		/*String s1 = "a";
		String s2 = "a";
		String s3 = new String("a");

		System.out.println(s1 == s2);
		
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s3));*/
		
		
	}
	
	static boolean kiemTraNamNhuan(int nam){
		return false;
	}

}
