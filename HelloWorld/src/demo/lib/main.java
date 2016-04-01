package demo.lib;

import java.util.Calendar;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis());
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK) );
		
		String s = "abc";
		System.out.println(s + "xyz");
		
		StringBuilder builder = new StringBuilder();
		builder.append("abc").append("xyz").append("def");
		
		System.out.println(builder.toString());
		
		System.out.println(String.format("Xin chao %1$s! Ban co %2$d tin nhan. Xin chao %1$s!", "Midu", 10));

		Xuat("a", "b", "x", builder.toString());
		
		//cat chuoi
		String x = "Nguyen Van A#19#Viet Nam";
		String[] temp = x.split("#");
		for(String t : temp)
			System.out.println(t);
	}
	
	static void Xuat(String... text){
		for(int i = 0; i < text.length; i++)
		System.out.println(text[i]);
	}

}
