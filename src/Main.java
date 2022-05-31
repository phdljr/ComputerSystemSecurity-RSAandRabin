import encryption.rsa.MyRSA;
import encryption.rsa.PublicKey;

public class Main {
    public static void main(String[] args) {
        String plainText = "plainText";
        PublicKey publicKey = MyRSA.getPublicKey();
        String cipherText = MyRSA.encryption(plainText, publicKey);
    }
}
