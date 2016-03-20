package dzumi.demo.encryption;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encryptor2 {
    private static byte[] key;
    private static String cypherType = "AES";
    public Encryptor2(String localPass) {

        // save the encoded key for future use
        // - note that this keeps it in memory, and is not strictly safe
        key = localPass.getBytes();
        String keyCopy = new String(key);
        while(keyCopy.length() < 16)
            keyCopy = keyCopy + keyCopy;
       
        byte keyA[] = keyCopy.getBytes();
        if(keyA.length > 16)
        {
            key = new byte[16];
            System.arraycopy(keyA, 0, key, 0, 16);
        }
        System.out.println(key[0] + "/" + key[1]);
    }

     public byte[] getKey() {
        // return a copy of the key.
        return key.clone();
    }
   
    public byte[] encrypt(byte[] byteArray) throws Exception {
       
            //Create your Secret Key Spec, which defines the key transformations
            SecretKeySpec skeySpec = new SecretKeySpec(key, cypherType);

            //Get the cipher
            Cipher cipher = Cipher.getInstance(cypherType);

            //Initialize the cipher
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);

            //Encrypt the string into bytes
            byte[ ] encryptedBytes = cipher.doFinal(byteArray);            return encryptedBytes;

    }
   
    public byte[] decrypt(byte[] byteArray) throws Exception {
       
        // Get the secret key spec
            SecretKeySpec skeySpec = new SecretKeySpec(key, cypherType);
       
            // create an AES Cipher
            Cipher cipher = Cipher.getInstance(cypherType);
       
            // Initialize it for decryption
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
       
            // And finally, do the decryption.
            byte[]decrypted = cipher.doFinal(byteArray);

            return decrypted;
    }
}