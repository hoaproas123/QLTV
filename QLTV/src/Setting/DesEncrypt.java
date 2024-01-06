/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Setting;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 *
 * @author Admin
 */
public class DesEncrypt {
    public String encryptOrDecrypt(String key,int mode,String input) throws Throwable{
        DESKeySpec dks=new DESKeySpec(key.getBytes());
        SecretKeyFactory skf=SecretKeyFactory.getInstance("DES");
        SecretKey desKey= skf.generateSecret(dks);
        Cipher cipher=Cipher.getInstance("DES");
        if(mode==Cipher.ENCRYPT_MODE){
            cipher.init(Cipher.ENCRYPT_MODE,desKey);
            byte[] charac = input.getBytes("UTF-8");
            byte[] encrypted = cipher.doFinal(charac);
            String encrypted_charac = Base64.getEncoder().encodeToString(encrypted);
            return encrypted_charac;
        }
        return null;
    }
}
