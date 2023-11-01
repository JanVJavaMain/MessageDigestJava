import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AlgMD{
    private byte pinHash[];

    public AlgMD(String pin) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("MD5: " + pinHash);
    }
}
