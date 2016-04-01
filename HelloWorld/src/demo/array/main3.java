package demo.array;

public class main3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Data1 data1 = new Data1();
//		Data2 data2 = new Data2();
		
		IData data = new Data2();
		data.a();
		
	}
	
	static void xuLy(Data1 data1){
		
	}
	
	static void xuLy(Data2 data2){
		
	}
	
	static void xuLy(IData data){
		data.a();
	}

}
