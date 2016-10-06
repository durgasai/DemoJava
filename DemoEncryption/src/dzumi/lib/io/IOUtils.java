package dzumi.lib.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class IOUtils {
	public static List<String> readTextFileReturnArrayString(String path){
		List<String> list = new ArrayList<>();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(path) );
			String s = "";
			while ((s = bufferedReader.readLine()) != null) {
				list.add(s);
			}
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public static String readTextFile(String path){
		String content = "";
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(path) );
			char[] buffer = new char[512];
			int len = 0;
			while ((len = bufferedReader.read(buffer)) != -1) {
				content += new String(buffer,0,len);
			}
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return content;
	}
	
	public static void writeTextFile(String path, String content){
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
			
			bufferedWriter.write(content);
			
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void expendTextFile(String path, String content){
		try {
			String oldContent = readTextFile(path);
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
			
			bufferedWriter.write(oldContent + "\n" +content);
			
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
