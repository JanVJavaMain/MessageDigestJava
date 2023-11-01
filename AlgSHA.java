import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AlgSHA{
    private byte pinHash[];

    public AlgSHA(String pin) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("SHA: " + pinHash);
    }
}
