package dzumi.demo.encryption;

import java.io.File;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("HEllo");
		long startTime = System.currentTimeMillis();
		IOUtils.encryptFile(new File("E:/GOPR0574.MP4"), new File("E:/output"));
		IOUtils.decryptFile(new File("E:/output"), new File( "E:/result.MP4"));
		
		System.out.println(System.currentTimeMillis() - startTime); 
		/*try {
			
			CryptoUtils.encrypt("dzumi09876543211", new File("E:/minus_button-128.png"), new File("E:/output"));
			CryptoUtils.decrypt("dzumi09876543211", new File("E:/output"), new File("E:/result.png"));

		} catch (CryptoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
