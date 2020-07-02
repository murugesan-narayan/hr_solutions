package javapro;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;
import java.util.Scanner;

public class JavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(getMD5(s));

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(s.getBytes());
        byte[] digest = md.digest();
        String encVal = DatatypeConverter.printHexBinary(digest).toLowerCase();
        System.out.println(encVal);

        sc.close();
    }

    private static String getMD5(String s) {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] result = md.digest(s.getBytes());
            for (byte b : result) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1)
                    sb.append('0');
                sb.append(hex);

            }
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return sb.toString();
    }

}
