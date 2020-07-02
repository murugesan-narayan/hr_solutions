package javapro;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(getSHAHEX(s));
        //My code
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(s.getBytes());
        byte[] digest = md.digest();
        String encVal = DatatypeConverter.printHexBinary(digest).toLowerCase();
        System.out.println(encVal);

        sc.close();
    }

    private static String getSHAHEX(String s) {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] result = digest.digest(s.getBytes());
            for (byte b : result) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1)
                    sb.append('0');
                sb.append(hex);
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

}
