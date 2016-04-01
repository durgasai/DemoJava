package demo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class IOUtils {
	//doc file
	public static void readBinaryTextFile(String path){  
		FileInputStream fileInputStream = null;
		try {
			//buoc 1: mo luong
			fileInputStream = new FileInputStream(path);

			//buoc 2: doc file
			byte[] buffer = new byte[7];
			String s = "";
			int len= 0;
			while( (len = fileInputStream.read(buffer)) != -1){
				s+= new String(buffer,0,len);
			}

			System.out.println(s);
			//buoc 3: dong luong
			fileInputStream.close();
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public static void readBinaryTextFileByBuffer(String path){  
		FileInputStream fileInputStream = null;
		BufferedInputStream bufferedInputStream = null;
		try {
			//buoc 1: mo luong
			fileInputStream = new FileInputStream(path);
			bufferedInputStream = new BufferedInputStream(fileInputStream);

			//buoc 2: doc file
			byte[] buffer = new byte[7];
			String s = "";
			int len= 0;
			while( (len = bufferedInputStream.read(buffer)) != -1){
				s+= new String(buffer,0,len);
			}

			System.out.println(s);
			//buoc 3: dong luong
			bufferedInputStream.close();
			fileInputStream.close();
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	//ghi file
	public static boolean writeBinaryTextFile(String path, String content){

		try {
			//buoc 1: mo luong
			FileOutputStream fileOutputStream = new FileOutputStream(path);

			//buoc 2:ghi file
			fileOutputStream.write(content.getBytes());

			//buoc 3: dong luong
			fileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	//copy file
	public static void copyFile(String srcPath, String desPath){


		try {
			//buoc 1.1: mo luong read
			FileInputStream fileInputStream = new FileInputStream(srcPath);
			//buoc 2.1: mo luong write
			FileOutputStream fileOutputStream = new FileOutputStream(desPath);

			//buoc 1.2: read file --> byte[]

			byte[] buffer = new byte[1024];
			int len= 0;
			while( (len = fileInputStream.read(buffer)) != -1){
				//buoc 2.2: byte[] --> write file
				fileOutputStream.write(buffer,0,len);

			}

			//buoc 1.3: close read
			fileInputStream.close();
			//buoc 2.3: close write
			fileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//neu doc file unicode = BinaryStream --> teo
	//doc file unicode = FileReader
	public static void readTextUnicodeFile(String path){

		try {
			//buoc 1:
			FileReader fileReader = new FileReader(path);

			//buoc 2:
			char[] buffer = new char[7];
			int len = 0;
			String s = "";
			while((len = fileReader.read(buffer)) != -1){
				s+= new String(buffer,0, len);
			}
			System.out.println(s);
			//buoc 3:
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//ghi du lieu country duoi dang data stream
	public static void writeCountryByDataStream(String path, List<Country> countries){

		try {
			//buoc 1: mo luong
			DataOutputStream dataOutputStream = new DataOutputStream(
					new BufferedOutputStream(new FileOutputStream(path)));

			//buoc 2:
			//for each
			for(Country country: countries){
				dataOutputStream.writeUTF(country.getName());
				dataOutputStream.writeLong(country.getPopulation());
				dataOutputStream.writeDouble(country.getArea());
			}

			//buoc 3: dong luong
			dataOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<Country> readCountryByDataStream(String path){

		List<Country> countries = new ArrayList<>();

		try {
			//b1: mo luong
			DataInputStream dataInputStream = new DataInputStream(
					new BufferedInputStream(new FileInputStream(path)));

			//buoc 2: doc cho den khi nao bi loi

			try{
				do{
					String name = dataInputStream.readUTF();
					long pop = dataInputStream.readLong();
					double area = dataInputStream.readDouble();

					countries.add(new Country(name, pop, area));
				}while(true);
			}catch (EOFException e) {
				// TODO: handle exception
				System.out.println("het file");
			}
			//buoc 3: dong luong\
			dataInputStream.close();
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return countries;
	}

	public static void writeCountryByObjectStream(String path, List<Country> countries){
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream(path)));

			for(Country country : countries){
				objectOutputStream.writeObject(country);
			}

			objectOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<Country> readCountryByObjectStream(String path){
		List<Country> countries = new ArrayList<>();

		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(path)));
			try{
				while(true){
					countries.add((Country) objectInputStream.readObject());
				}
			}
			catch(EOFException exception){
				System.out.println("het file");
			}
			objectInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return countries;
	}
}
