package encryption.rsa;

import java.math.BigInteger;

public class MyRSA {
    private static PublicKey publicKey = new PublicKey();
    private static byte[] privateKey = new byte[128];

    // 공개키를 얻을 때마다 키를 생성함
    public static PublicKey getPublicKey(){
        keyGeneration();
        return publicKey;
    }

    public static void keyGeneration(){
        byte[] p = new byte[128];
        byte[] q = new byte[128];
        p = new BigInteger("12362187351286793512873961278612789").toByteArray();
    }

    public static String encryption(String plainText, PublicKey pubKey){

        return "";
    }

    public static String decryption(String cipherText, byte[] priKey){

        return "";
    }
}
