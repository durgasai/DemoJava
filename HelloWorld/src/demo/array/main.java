package demo.array;

import java.util.ArrayList;
import java.util.Random;

import demo.java.PhanSo;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a[] = new int[10];
		Random random = new Random();

		//insert data
		for(int i = 0; i < a.length; i++)
			a[i] = random.nextInt(200) - 100;

		xuat(a);

		//sap xep tang dan
		int n = a.length;
		for(int i = 0; i < n - 1; i++)
			for(int j = i + 1; j < n; j++)
				if(a[i] > a[j])
					swap(a,i,j);
		xuat(a);
		
		PhanSo phanSo = new PhanSo(0,1);
		phanSo.Xuat();
		rename(phanSo);
		phanSo.Xuat();
		
		int temp = 0;
		System.out.println(temp);
		change(temp);
		System.out.println(temp);*/
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("H");
//		arrayList.get(9);//a[i]
		for(int i = 0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));
		
	}
	
	static void change(int i){
		i = 5;
	}
	
	static void rename(PhanSo ps){
//		a = "hi";
		ps.setTu(5);
	}

	static void xuat(int[] a){
		//xuat
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println("");
	}

	static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
