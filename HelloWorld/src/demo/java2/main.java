package demo.java2;

import demo.java.PhanSo;
import demo.shape.Rectangle;
import demo.shape.Shape;
import demo.shape.Triangle;

public class main {
	/*int a;
	void a(){
		a  = 1;
		main(null);
	}*/
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		a = 1;
		// TODO Auto-generated method stub
//		Shape shape = new Shape(10,20);
//		shape.XuatThongTin();
		
		Triangle triangle = new Triangle(5,6,10,20);
//		triangle.XuatThongTin();
		
		//van de 1: ep kieu tu lop cha ve lop con
//		Triangle temp = (Triangle) shape;
//		temp.XuatThongTin();
		
		//van de 2: ep kieu tu lop con ve lop cha
		Shape temp = triangle;
//		Rectangle temp2 = (Rectangle) temp;
//		temp2.XuatThongTin();
//		temp.XuatThongTin();
//		temp.set
		
		TinhDienTich(triangle);
		
		Triangle triangle2 = null;
//		System.out.println(triangle2.c);
		System.out.println(triangle2.TAG);
		System.out.println(Triangle.TAG);
	}
	
	
	static double TinhDienTich(Shape shape){
		return shape.tinhDienTich();
	}

}
