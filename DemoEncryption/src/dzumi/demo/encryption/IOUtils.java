package dzumi.demo.encryption;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOUtils {
	public static void decryptFile(File fileSrc, File fileDes){
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileSrc));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileDes));
			
			Encryptor encryptor = new Encryptor("dzumi");
			byte[] buffer = new byte[(int) fileSrc.length()];
			bis.read(buffer);
			buffer = encryptor.decrypt(buffer);
			bos.write(buffer);
			
			bos.flush();
			bos.close();
			bis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void encryptFile(File fileSrc, File fileDes){
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileSrc));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileDes));
			
			Encryptor encryptor = new Encryptor("dzumi");
			byte[] buffer = new byte[(int) fileSrc.length()];
			bis.read(buffer);
			buffer = encryptor.encrypt(buffer);
			bos.write(buffer);
			
			bos.flush();
			bos.close();
			bis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean delete(String path) {
		File file = new File(path);
		if (file.exists())
			return file.delete();
		return false;
	}
}
