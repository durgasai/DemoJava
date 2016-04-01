package demo.array;

import java.util.Random;

public class main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		Random random = new Random();

		//insert data
		for(int i = 0; i < a.length; i++)
			a[i] = random.nextInt(200) - 100;
		xuat(a);
		sapXep(a);
		xuat(a);
	}
	
	static void sapXep(int[] a) {
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					swap ( a[i], a[j]);
				}
			}
		}
	}
	static void swap( int a, int b){
		int t =a;
		a = b;
		b =t;
	}
	
	//swap2
	static void swap2( int a, int b){
		int t =a;
		a = b;
		b =t;
	}
	
	
	
	static void xuat(int[] a){
		//xuat
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println("");
	}

}
