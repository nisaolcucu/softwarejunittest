
package com.account;

public class Validator {
    public static boolean isValidName(String name) {
        return name != null && name.matches("[A-Z][a-z]{1,49}");
    }
    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }
    public static boolean isValidPassword(String password) {
        return password != null && password.length() >= 8 && password.matches(".*[A-Z].*[0-9].*");
    }
    public static boolean doPasswordsMatch(String pw1, String pw2) {
        return pw1 != null && pw1.equals(pw2);
    }
    public static boolean isValidDOB(String dob) {
        return dob != null && dob.matches("^\\d{2}/\\d{2}/\\d{4}$");
    }
}



















/*package com.account;

import java.util.regex.Pattern;

public class Validator {

    public static boolean isValidName(String name) {
        return name != null && name.matches("^[A-ZÇĞİÖŞÜ][a-zçğıöşü]{1,29}$");
    }

    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w-\\.]+@[\\w-\\.]+\\.(com|org|net|edu|gov)$");
    }

    public static boolean isValidPassword(String password) {
        return password != null && password.length() >= 8;
    }

    public static boolean doPasswordsMatch(String password, String confirmPassword) {
        return password != null && password.equals(confirmPassword);
    }

    public static boolean isValidDate(String date) {
        return date != null && date.matches("^\\d{2}/\\d{2}/\\d{4}$");
    }
}
*/


/*
package com.account;

import java.util.regex.Pattern;

public class Validator {

    public static boolean isValidName(String name) {
        return name != null && name.matches("[A-Za-z]{2,50}");
    }

    public static boolean isValidEmail(String email) {
        return email != null && Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", email);
    }

    public static boolean isValidPassword(String password) {
        return password != null && password.length() >= 8;
    }

    public static boolean passwordsMatch(String p1, String p2) {
        return p1 != null && p1.equals(p2);
    }

    public static boolean isValidDateOfBirth(String dob) {
        return dob != null && Pattern.matches("^\\d{2}/\\d{2}/\\d{4}$", dob);
    }
}
*/