package dzumi.exercise.encryption;

import java.util.List;
import java.util.Random;

public class Encrypt {
	public static char randomChar(){
		return (char) (65 + new Random().nextInt(26));
	}

	public static char[] stringToCharArray(String s){
		char[] buffer = new char[s.length()];
		s.getChars(0, s.length(), buffer, 0);
		return buffer;
	}
	public static String encryptByEven(String content){
		char[] buffer = stringToCharArray(content.toUpperCase());
		char[] encrypt = new char[content.length() * 2];
		for(int i = 0; i < encrypt.length; i++){
			if(i %2 == 0)
				encrypt[i] = buffer[i/2];
			else
				encrypt[i] = randomChar();
		}

		return new String(encrypt);
	}

	public static String encryptByPrime(String content){
		String encrypt = "";
		char[] buffer = stringToCharArray(content.toUpperCase());

		int i = 0;
		int index = 0;
		try{
			while(true){
				if(Algorithm.isNguyenTo(i++))
					encrypt+= buffer[index++];
				else
					encrypt+= randomChar();

			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			return encrypt;
		}
	} 
	
	public static String encryptByDoiXung(String content){
		String encrypt = "";
		char[] buffer = stringToCharArray(content.toUpperCase());

		int i = 0;
		int index = 0;
		try{
			while(true){
				if(Algorithm.isDoiXung(i++))
				{
					System.out.println(i);
					encrypt+= buffer[index++];
				}
				else
					encrypt+= randomChar();

			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			return encrypt;
		}
	} 
	
	public static String encryptByNumberRelated(String content, int number){
		String encrypt = "";
		char[] buffer = stringToCharArray(content.toUpperCase());

		int i = 0;
		int index = 0;
		try{
			while(true){
				if(Algorithm.isNumberRelated(i++, number))
				{
					System.out.println(i);
					encrypt+= buffer[index++];
				}
				else
					encrypt+= randomChar();

			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			return encrypt;
		}
	} 
}
