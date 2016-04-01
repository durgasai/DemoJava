package demo.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFile();
		
		try {
			readFile1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PhanSo phanSo = new PhanSo();
		try {
			phanSo.setMau(0);
		} catch (PhanSoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void readFile(){
		try {
			FileInputStream fileInputStream = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void readFile1() throws FileNotFoundException{
		FileInputStream fileInputStream = new FileInputStream("");
	}
	
	

}
