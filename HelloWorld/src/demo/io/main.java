package demo.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		IOUtils.writeBinaryTextFile("E:/input.txt", "Xin chao java");
//		IOUtils.readBinaryTextFileByBuffer("E:/temp.txt");
		//		IOUtils.readTextUnicodeFile("E:/temp.txt");
		//		System.out.println("trung tâm tin học");
		//		IOUtils.copyFile("E:/Koala.jpg", "E:/Koala1.jpg");

		
		
		//khoi tao mang countries
		List<Country> countries = new ArrayList<>();
		Random random = new Random();
		for(int i = 0; i < 3; i++){
			countries.add(new Country("name " + i, random.nextLong(), random.nextDouble()));
		}
		
		//xuat ra ket qua tao tu buoc tren
		for(Country country : countries){
			System.out.println(country.toString());
		}
		
		//ghi file
//		IOUtils.writeCountryByDataStream("D:/dataCountry", countries);
		IOUtils.writeCountryByObjectStream("D:/objectCountry", countries);
		//doc file
//		List<Country> inputCountries = IOUtils.readCountryByDataStream("D:/dataCountry");
		List<Country> inputCountries = IOUtils.readCountryByObjectStream("D:/objectCountry");
		for(Country country : inputCountries){
			System.out.println(country.toString());
		}
	}
	
	

}
