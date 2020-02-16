package algorithms.strings;

import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {
        // Return the minimum number of characters to make the password strong
        int n = 7;
        String password = "AUzs-nV";
        int nu, lc, uc, sc;
        nu = lc = uc = sc = 0;
        char[] c = password.toCharArray();
        for (int i=0; i<n; i++) {
            if (Character.isDigit(c[i])) nu++;
            if (Character.isUpperCase(c[i])) uc++;
            if (Character.isLowerCase(c[i])) lc++;
            boolean scFound = Character.toString(c[i]).matches(("[!@#$%^&*()\\-+]"));
            if (scFound) sc++;
        }
        int mc = 0;
        if (uc == 0) mc++;
        if (lc == 0) mc++;
        if (sc == 0) mc++;
        if (nu == 0) mc++;
        int d = 6-n;
        if (d > mc) mc = d;
        System.out.println("mc = " + mc);
    }
}

/*
static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        if (n < 6) {
            return 6 - n;
        }
        boolean numFound = Pattern.compile("[0-9]+")
                            .matcher(password).find();
        boolean lcFound = Pattern.compile("[a-z]+")
                            .matcher(password).find();
        boolean ucFound = Pattern.compile("[A-Z]+")
                            .matcher(password).find();
        boolean scFound = Pattern.compile("[!@#$%^&*()-+]+")
                            .matcher(password).find();
        int rc = 4;
        if (numFound) rc--;
        if (lcFound) rc--;
        if (ucFound) rc--;
        if (scFound) rc--;
        return rc;
    }
 */